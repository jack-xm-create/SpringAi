package org.example.system.common;

import lombok.Data;
import java.io.Serializable;

/**
 * 统一响应结果封装类
 * 所有的接口都应该返回这个对象
 */
@Data
public class Result<T> implements Serializable {

    private Integer code; // 200成功, 500失败
    private String msg;   // 提示信息
    private T data;       // 数据内容

    // 快速生成成功结果
    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<>();
        r.setCode(200);
        r.setMsg("操作成功");
        r.setData(data);
        return r;
    }

    // 快速生成失败结果
    public static <T> Result<T> error(String msg) {
        Result<T> r = new Result<>();
        r.setCode(500); // 默认错误码
        r.setMsg(msg);
        return r;
    }
}