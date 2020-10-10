package com.youxiu326.req;

import lombok.Data;

/**
 * @Auther: lihui
 * @Date: 2020-10-10 11:47
 * @Description:
 */
@Data
public class RequestErrorInfo {
    private String ip;
    private String url;
    private String httpMethod;
    private String classMethod;
    private Object requestParams;
    private RuntimeException exception;
}
