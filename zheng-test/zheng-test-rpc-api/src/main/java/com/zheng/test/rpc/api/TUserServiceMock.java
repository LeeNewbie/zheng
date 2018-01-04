package com.zheng.test.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.test.dao.mapper.TUserMapper;
import com.zheng.test.dao.model.TUser;
import com.zheng.test.dao.model.TUserExample;

/**
* 降级实现TUserService接口
* Created by shuzheng on 2017/12/22.
*/
public class TUserServiceMock extends BaseServiceMock<TUserMapper, TUser, TUserExample> implements TUserService {

}
