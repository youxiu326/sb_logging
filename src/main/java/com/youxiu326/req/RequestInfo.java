package com.youxiu326.req;

import lombok.Data;

/**
 * @Auther: lihui
 * @Date: 2020-10-10 09:39
 * @Description:
 */
@Data
public class RequestInfo {
    private String ip;
    private String url;
    private String httpMethod;
    private String classMethod;
    private Object requestParams;
    private Object result;
    private Long timeCost;
}
