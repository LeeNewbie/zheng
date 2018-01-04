package com.zheng.test.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.test.dao.mapper.TUserRoleMapper;
import com.zheng.test.dao.model.TUserRole;
import com.zheng.test.dao.model.TUserRoleExample;

/**
* 降级实现TUserRoleService接口
* Created by shuzheng on 2017/12/22.
*/
public class TUserRoleServiceMock extends BaseServiceMock<TUserRoleMapper, TUserRole, TUserRoleExample> implements TUserRoleService {

}
