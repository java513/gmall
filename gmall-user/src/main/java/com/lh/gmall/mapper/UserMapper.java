package com.lh.gmall.mapper;

import com.lh.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author liuhao
 * @Desc //
 * @DATE 2020/4/7 19:41
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
