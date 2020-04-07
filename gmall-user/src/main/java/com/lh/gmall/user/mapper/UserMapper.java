package com.lh.gmall.user.mapper;

import com.lh.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * @author liuhao
 * @Desc //
 * @DATE 2020/4/7 19:41
 */
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
