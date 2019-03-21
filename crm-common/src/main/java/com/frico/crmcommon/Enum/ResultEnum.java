package com.frico.crmcommon.Enum;

import lombok.Getter;

/**
 * Created by Administrator on 2018/3/13 0013.
 */
@Getter
public enum ResultEnum {
    SUCCESS("0", "success"),
    PARAM_ERROR("1", "参数不正确"),

    USER_NO_EXIST("11","用户不存在"),

    ARTICLE_NO_EXIST("21","文章不存在"),
    ARTICLE_PUBLISH_FAIL("22","文章发布失败"),

    MSGHISTORY_NO_EXIST("31",""),

    VIDEO_NO_EXIST("41","视频资源不存在"),
    VIDEO_SAVE_ERROR("42", "添加视频失败"),

    COURSE_SAVE_ERROR("51","添加课程失败"),
    COURSE_UPDATE_ERROR("52", "更新课程失败"),

    ADVERT_SAVE_ERROR("61", "添加广告位失败"),
    ADVERT_DELETE_ERROR("62", "删除广告位失败"),

    AUDIO_SAVE_ERROR("71", "添加音频失败"),
    AUDIO_UPDATE_ERROR("72", "更新音频失败"),
    AUDIO_DELETE_ERROR("73", "删除广告位失败"),


    FILE_UPLOAD_FAIL("111","文件上传失败"),
    FILE_DOWNLOAD_FAIL("112","文件下载失败"),

    ORDER_EXISTS("121","订单已存在,不需要重复购买"),

    ORDER_NO_EXISTS("122","订单不存在,请检查订单号是否正确"),

    ORDER_PAY("999","订单已经支付，请勿重新支付~"),




    PROPERTIES_CONVER_FAIL("3001","属性转换失败"),


    ERROR_PASSWROD_FAIL("5001","交易密码不正确"),

    NOT_SUFFICIENT_FUNDS("6001","余额不足");


    private String code;

    private String msg;

    ResultEnum(String code, String msg){
        this.code=code;
        this.msg=msg;
    }

}
