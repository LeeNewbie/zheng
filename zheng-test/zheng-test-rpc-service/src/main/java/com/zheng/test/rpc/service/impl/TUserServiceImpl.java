package com.zheng.test.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.test.dao.mapper.TUserMapper;
import com.zheng.test.dao.model.TUser;
import com.zheng.test.dao.model.TUserExample;
import com.zheng.test.rpc.api.TUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TUserService实现
* Created by shuzheng on 2017/12/22.
*/
@Service
@Transactional
@BaseService
public class TUserServiceImpl extends BaseServiceImpl<TUserMapper, TUser, TUserExample> implements TUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TUserServiceImpl.class);

    @Autowired
    TUserMapper tUserMapper;

}