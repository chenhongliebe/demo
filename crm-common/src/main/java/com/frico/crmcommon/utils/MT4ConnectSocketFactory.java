package com.frico.crmcommon.utils;

import com.alibaba.fastjson.JSONObject;
import com.frico.crmcommon.Enum.SocketEnum;

import java.math.BigDecimal;

/**
 * 连接mt4服务器工厂
 */
public class MT4ConnectSocketFactory {

    /**
     * 开户
     */
    public static String openUser(){
        String code = SocketEnum.MSGTYPE_1001.getCode();//开户
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        return null;
    }

    /**
     * 入金
     */
    public static String inMoney(String account, BigDecimal money) throws Exception{
        String code =SocketEnum.MSGTYPE_1002.getCode();//入金
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("money",money);
        json.put("account",account);
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());
        JSONObject js = JSONObject.parseObject(msg);
        return js.getString("code");
    }

    /**
     * 出金
     */
    public static String outMoney(String account, BigDecimal money) throws Exception{
        String code =SocketEnum.MSGTYPE_1003.getCode();//出金
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("account",account);
        json.put("money",money);
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());
        JSONObject js = JSONObject.parseObject(msg);
        return js.getString("code");
    }

    /**
     * 划转
     */
    public static String transfer(String from_account,String to_account, BigDecimal money) throws Exception{
        String code =SocketEnum.MSGTYPE_1004.getCode();//划转
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("from_account",from_account);
        json.put("to_account",to_account);
        json.put("money",money);
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());
        JSONObject js = JSONObject.parseObject(msg);
        return js.getString("code");
    }

    /**
     * 获取用户信息
     */
    public static String getUserInfo(String account) throws Exception{
        String code =SocketEnum.MSGTYPE_1005.getCode();//获取用户信息
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("account",account);
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());
        return msg;
    }

    /**
     * 更改杠杆
     */
    public static String changeLeverage(String account,String leverage) throws Exception{
        String code =SocketEnum.MSGTYPE_1006.getCode();//更改杠杆
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("account",account);
        json.put("leverage",leverage);
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());
        JSONObject js = JSONObject.parseObject(msg);
        return js.getString("code");
    }

    /**
     * 更改手机号
     */
    public static String changePhone(String account,String phone) throws Exception{
        String code =SocketEnum.MSGTYPE_1007.getCode();//更改手机号
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("account",account);
        json.put("phone",phone);
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());
        JSONObject js = JSONObject.parseObject(msg);
        return js.getString("code");
    }

    /**
     * 更改邮箱
     */
    public static String changeEmail(String account,String email) throws Exception{
        String code =SocketEnum.MSGTYPE_1008.getCode();//更改邮箱
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("account",account);
        json.put("phone",email);
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());
        JSONObject js = JSONObject.parseObject(msg);
        return js.getString("code");
    }

    /**
     * 持仓订单 12
     */
    public static String holdOrder(String account,String email) throws Exception{
        String code =SocketEnum.MSGTYPE_1012.getCode();//持仓订单
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("account",account);
        json.put("order_type","2");//2持仓订单
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());
//        JSONObject js = JSONObject.parseObject(msg);
//        return js.getString("code");
        return msg;
    }

    /**
     * 挂单订单 13
     */
    public static String putOrder(String account) throws Exception{
        String code =SocketEnum.MSGTYPE_1013.getCode();//挂单订单
        JSONObject json = new JSONObject();
        json.put("msg_type",code);
        json.put("account",account);
        json.put("order_type","3");//3挂单订单
        NIOClient nioClient = new NIOClient();
        String msg = nioClient.accessServer(json.toString());//结果格式
//        JSONObject js = JSONObject.parseObject(msg);
//        return js.getString("code");
        return msg;
    }



}
