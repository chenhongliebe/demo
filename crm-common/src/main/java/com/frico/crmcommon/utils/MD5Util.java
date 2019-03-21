package com.frico.crmcommon.utils;

import java.security.MessageDigest;
import java.util.Random;

public class MD5Util {

    /**
     * md5加密
     * @param password
     * @return
     * @throws Exception
     */
    public static String getMd5Str(String password) throws Exception{
        MessageDigest md5= MessageDigest.getInstance("MD5");
//        BASE64Encoder base64en = new BASE64Encoder();
//        String newstr=base64en.encode(md5.digest(password.getBytes("utf-8")));
        byte[] md5Bytes= md5.digest(password.getBytes("utf-8"));
        StringBuffer hexValue = new StringBuffer();
        for(int i=0;i<md5Bytes.length;i++){
            int val = md5Bytes[i] & 0xff;
            if(val<16){
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < length; ++i) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }

        return sb.toString();
    }


}
