package com.lh.gmall.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lh.gmall.bean.UmsMember;
import com.lh.gmall.mapper.UserMapper;
import com.lh.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liuhao
 * @Desc //
 * @DATE 2020/4/7 19:40
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }
}
