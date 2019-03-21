package com.frico.crmcommon.interceptor;

import com.frico.crmcommon.Enum.TokenExceptionEnum;
import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcommon.utils.AuthUtil;
import com.frico.crmcommon.utils.JwtTokenUtil;
import com.frico.crmcommon.utils.LoginInfo;
import com.frico.crmcommon.utils.RenderUtil;
import io.jsonwebtoken.JwtException;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInteceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof org.springframework.web.servlet.resource.ResourceHttpRequestHandler) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        return check(request, response, handlerMethod);
    }

    private boolean check(HttpServletRequest request, HttpServletResponse response, HandlerMethod handlerMethod) {
//        if (request.getServletPath().equals("customer/login")) {
//            return true;
//        }
        final String requestHeader = request.getHeader("Authorization");
        String authToken;
        if (requestHeader != null && requestHeader.startsWith("Bearer ")) {
            authToken = requestHeader.substring(7);

            //验证token是否过期,包含了验证jwt是否正确
            try {
                boolean flag = JwtTokenUtil.isTokenExpired(authToken);
                if (flag) {
                    RenderUtil.renderJson(response, new ResultVO(TokenExceptionEnum.TOKEN_EXPIRED.getCode(), TokenExceptionEnum.TOKEN_EXPIRED.getMsg()));
                    return false;
                }
            } catch (JwtException e) {
                //有异常就是token解析失败
                RenderUtil.renderJson(response, new ResultVO(TokenExceptionEnum.TOKEN_ERROR.getCode(), TokenExceptionEnum.TOKEN_ERROR.getMsg()));
                return false;
            }
        } else {
            //header没有带Bearer字段
            RenderUtil.renderJson(response, new ResultVO(TokenExceptionEnum.TOKEN_ERROR.getCode(), TokenExceptionEnum.TOKEN_ERROR.getMsg()));
            return false;
        }
        String userId =JwtTokenUtil.getUsernameFromToken(authToken);
        String account =JwtTokenUtil.getPrivateClaimFromToken(authToken,"account");
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setId(Integer.parseInt(userId));
        loginInfo.setUsername(account);
        AuthUtil.setUserInfo(loginInfo);
        return true;
    }


}
