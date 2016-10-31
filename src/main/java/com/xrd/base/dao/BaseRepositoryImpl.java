package com.xrd.base.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @FileName BaseRepositoryImpl
 * @Description 类描述
 * @Author XiongZhan
 * @Date 2016/10/31
 */
public class BaseRepositoryImpl {

    protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @PersistenceContext
    protected EntityManager em;
}
