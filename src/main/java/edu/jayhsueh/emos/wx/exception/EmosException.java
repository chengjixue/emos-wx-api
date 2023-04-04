package edu.jayhsueh.emos.wx.exception;

import lombok.Data;

/**
 * @author xuecj
 * @version 1.0
 * @date 2023/4/4 19:01
 */
@Data
public class EmosException extends RuntimeException{
    private String msg;
    private int code=500;

    public EmosException(String msg){
        super(msg);
        this.msg=msg;
    }
    public EmosException (String msg,Throwable e ){
        super(msg,e);
        this.msg=msg;
    }
    public EmosException(String msg,int code){
        super(msg);
        this.msg=msg;
        this.code=code;
    }
    public EmosException (String msg,Throwable e ,int code){
        super(msg,e);
        this.msg=msg;
        this.code=code;
    }
}
