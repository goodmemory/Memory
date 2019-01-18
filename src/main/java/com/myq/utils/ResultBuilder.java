package com.myq.utils;

/**
 * Created by Poorzerg on 2017/四月/13.
 */
public enum ResultBuilder {

    
    SUCCESS(0, "操作成功") ;

    private int status;
    private String message;

    ResultBuilder(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result build() {
        return new Result(this.status, this.message);
    }

    public Result build(Object data) {
        return new Result(this.status, this.message, data);
    }

    public Result build(int second) {
        return new Result(this.status, this.message, second);
    }

    public Result build(Object data, long total) {
        return new Result(this.status, this.message, data, total);
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }


}
