package com.xrd.repository;

import com.xrd.base.dao.BaseRepository;
import com.xrd.domain.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @FileName UserRepository
 * @Description 类描述
 * @Author XiongZhan
 * @Date 2016/10/31
 */
public interface UserRepository extends BaseRepository<User,String>{
    /*
     * @MethodName 
     * @Description 方法描述
     * @Param 
     * @ResultType 
     * @Author XiongZhan
     * @Date 2016/10/31
     */
    @Query("select u FROM User u")
    public List<User> findUsers();
}
