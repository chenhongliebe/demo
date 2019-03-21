package com.frico.crmcommon.handler;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcommon.exception.CrmException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;

@ControllerAdvice
@Slf4j
@ResponseBody
public class ExceptionHandle {

    //请求方式异常
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResultVO handle(HttpRequestMethodNotSupportedException e){
        return ResultVO.error("60001",e.getMessage());
    }
    //shiro未授权异常
//    @ExceptionHandler(UnauthorizedException.class)
//    public ResultVO handle(UnauthorizedException e){
//        return ResultVO.ret("50001","未授权");
//    }
    //自定义异常处理
    @ExceptionHandler(CrmException.class)
    public ResultVO handle(CrmException e){
        if(e.getCode()==null || e.getCode()==""){
            e.setCode("50000");
        }
        log.info("自定义异常返回信息:{}",e.getMessage());
        return ResultVO.error(e.getCode(), e.getMessage());
    }
    //系统未知异常
    @ExceptionHandler(Exception.class)
    public ResultVO handle(Exception e){
        log.error(e.getMessage(), e);
        return ResultVO.error("-1","系统繁忙");
    }


//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public ResultVO handle(Exception e){
////业务受理失败原因
//        if(e.getClass() == WebsiteException.class){
//            WebsiteException websiteException = (WebsiteException) e;
//            if(websiteException.getCode()==null || websiteException.getCode()==""){
//                websiteException.setCode("50000");
//            }
//            log.info("自定义异常返回信息:{}",e.getMessage());
//            return ResultVO.ret(websiteException.getCode(), websiteException.getMessage());
//        }else if(e.getClass() == UnauthorizedException.class){
//            return ResultVO.ret("50001","未授权");
//        }else if(e.getClass() == IllegalArgumentException.class){
//            log.info("自定义异常返回信息:{}",e.getMessage());
//            return ResultVOUtil.error("50000",e.getMessage());
//        } else {
//            log.error(e.getMessage(), e);
//            return ResultVOUtil.error("-1","系统繁忙");
//        }
//    }


    /**
     * 判断是否 ajax 调用
     *
     * @param handler
     * @return
     */
    private boolean isAjax(Object handler) {
        if (handler != null && handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            ResponseBody responseBodyAnn = AnnotationUtils.findAnnotation(handlerMethod.getMethod(), ResponseBody.class);
            return responseBodyAnn != null;
        }

        return false;
    }
}