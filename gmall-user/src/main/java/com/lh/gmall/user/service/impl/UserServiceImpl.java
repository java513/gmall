package com.lh.gmall.user.service.impl;

import com.lh.gmall.user.bean.UmsMember;
import com.lh.gmall.user.mapper.UserMapper;
import com.lh.gmall.user.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuhao
 * @Desc //
 * @DATE 2020/4/7 19:40
 */
@Service
public class UserServiceImpl implements Userservice {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
