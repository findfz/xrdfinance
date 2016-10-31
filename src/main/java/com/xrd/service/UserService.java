package com.xrd.service;

import com.xrd.service.dto.UserDTO;

import java.util.List;

/**
 * @FileName UserService
 * @Description 类描述
 * @Author XiongZhan
 * @Date 2016/10/31
 */
public interface UserService {
    /*
     * @MethodName
     * @Description 方法描述
     * @Param 
     * @ResultType 
     * @Author XiongZhan
     * @Date 2016/10/31
     */
    public List<UserDTO> findAll();
}
