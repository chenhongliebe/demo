package com.frico.crmcommon.utils;

public class AuthUtil {

    private static ThreadLocal<LoginInfo>  threadLocal = new ThreadLocal<>();

    public static LoginInfo getUserInfo(){
        return threadLocal.get();
    }
    public static void setUserInfo(LoginInfo loginInfo){
        threadLocal.set(loginInfo);
    }


}
