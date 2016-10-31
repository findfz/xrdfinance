package com.xrd.service;

import com.google.common.collect.Lists;
import com.xrd.domain.User;
import com.xrd.repository.UserRepository;
import com.xrd.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @FileName UserServiceImpl
 * @Description 类描述
 * @Author XiongZhan
 * @Date 2016/10/31
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Inject
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAll() {
        List<User> users = userRepository.findUsers();
        List<UserDTO> userDTOs = Lists.newArrayList();
        for(User user:users){
            UserDTO userDTO = new UserDTO();
            userDTO.setName(user.getName());
            userDTO.setId(user.getId());
            userDTO.setAddress(user.getAddress());
            userDTO.setAge(user.getAge());
            userDTOs.add(userDTO);
        }
        return userDTOs;
    }
}
