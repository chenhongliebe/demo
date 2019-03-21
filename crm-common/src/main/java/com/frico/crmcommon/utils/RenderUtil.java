package com.frico.crmcommon.utils;

import com.alibaba.fastjson.JSON;
import com.frico.crmcommon.exception.CrmException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RenderUtil {

    public RenderUtil() {
    }

    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException var3) {
            throw new CrmException("");
        }
    }
}
