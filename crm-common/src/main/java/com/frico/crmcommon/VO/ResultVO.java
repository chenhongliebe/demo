package com.frico.crmcommon.VO;

import com.frico.crmcommon.Enum.ResultEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/13 0013.
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 4160748732980096229L;

    private String code;

    private String msg;

    private T data;

    public ResultVO(){
//        this.code="0";
//        this.msg="成功";
    }

    public ResultVO(ResultEnum resultEnum){
        this.code=resultEnum.getCode();
        this.msg=resultEnum.getMsg();
    }

    public ResultVO(String code, String msg){
        this.code=code;
        this.msg = msg;
    }


    public ResultVO(T data){
        this.code=ResultEnum.SUCCESS.getCode();
        this.msg=ResultEnum.SUCCESS.getMsg();
        this.data=data;
    }

    public static<T> ResultVO<T> success(T data){
        return new ResultVO(data);
    }

    public static<T> ResultVO<T> success(String code, String msg){

        return new ResultVO(code,msg);
    }

    public static<T> ResultVO<T> success(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultEnum.SUCCESS.getMsg());
        return resultVO;
    }

    public static<T> ResultVO<T> error(String code, String msg){

        return new ResultVO(code,msg);
    }



}
