package com.frico.crmcommon.utils;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.ClientConfiguration;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.*;
import com.frico.crmcommon.Enum.ResultEnum;
import com.frico.crmcommon.exception.CrmException;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.Date;

@Slf4j
public class AliyunOssUtils {

    public static String accessKeyId = "LTAIjAHANa7PKGhd";
    public static String accessKeySecret = "LPuKOhNykjfdLkCYAP3gVwmQuJXIOD";
    public static String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";// 以杭州为例
    public static String bucketName = "fricocrm";
    private static ClientConfiguration conf ;

    static {
        conf = new ClientConfiguration();// 创建ClientConfiguration实例，按照您的需要修改默认参数
        conf.setConnectionTimeout(60000);//修改超时时间
        conf.setSocketTimeout(60000);//Socket层传输数据的超时时间
    }

    /**
     * 简单上传文件
     * @param inputStream 上传的文件流
     * @param //length 上下文件 长度
     * @param fileName
     * @throws Exception
     */
    public static String uploadFile(InputStream inputStream,String fileName)throws Exception{
        try {
//            ObjectMetadata meta = new ObjectMetadata();// 创建上传Object的Metadata
//            meta.setContentLength(length);// 必须设置ContentLength   meta.setExpirationTime(expirationTime);
            OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret,conf);
            PutObjectResult result = client.putObject(bucketName, fileName, inputStream);
            if (result != null) {
                client.shutdown();
                Date expiration = new Date(new Date().getTime() + 3600l * 1000 * 24 * 365 * 10);
                String url = client.generatePresignedUrl(bucketName, fileName, expiration).toString();
                log.info("【阿里云oss】上传文件成功,返回结果:{}", JSONObject.toJSONString(result));
                return url;
            }
        } catch (Exception e) {
            log.error("【阿里云oss】上传文件失败:{}"+ e);
            throw new CrmException(ResultEnum.FILE_UPLOAD_FAIL);
        }finally {
            if(inputStream !=null){
                inputStream.close();
            }
        }
        return null;
    }
}
