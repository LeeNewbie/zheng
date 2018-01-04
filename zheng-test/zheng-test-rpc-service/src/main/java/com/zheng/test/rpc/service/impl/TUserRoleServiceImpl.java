package com.zheng.test.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.test.dao.mapper.TUserRoleMapper;
import com.zheng.test.dao.model.TUserRole;
import com.zheng.test.dao.model.TUserRoleExample;
import com.zheng.test.rpc.api.TUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TUserRoleService实现
* Created by shuzheng on 2017/12/22.
*/
@Service
@Transactional
@BaseService
public class TUserRoleServiceImpl extends BaseServiceImpl<TUserRoleMapper, TUserRole, TUserRoleExample> implements TUserRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TUserRoleServiceImpl.class);

    @Autowired
    TUserRoleMapper tUserRoleMapper;

}