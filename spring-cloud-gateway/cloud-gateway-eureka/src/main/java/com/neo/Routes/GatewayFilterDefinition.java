package com.neo.Routes;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author afj
 * @date 2021/1/4 18:14
 * 创建过滤器模型
 */
public class GatewayFilterDefinition {
    /**
     * Filter Name
     */
    private String name;
    /**
     * 对应的路由规则
     */
    private Map<String, String> args = new LinkedHashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }
}