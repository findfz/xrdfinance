package com.xrd.base.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * @FileName BaseRepository
 * @Description 类描述
 * @Author XiongZhan
 * @Date 2016/10/31
 */
@NoRepositoryBean
public interface BaseRepository<T, I extends Serializable> extends PagingAndSortingRepository<T, I>,JpaSpecificationExecutor<T> {


}
