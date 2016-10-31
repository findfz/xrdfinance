package com.xrd.web.rest;

import com.xrd.service.UserService;
import com.xrd.service.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * @FileName UserResource
 * @Description 类描述
 * @Author XiongZhan
 * @Date 2016/10/31
 */
@RestController
@RequestMapping("/user")
public class UserResource {
    @Inject
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<UserDTO> getUsers(){
        List<UserDTO> userDTOs = userService.findAll();
        return userDTOs;
    }
}
