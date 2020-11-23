package com.retire.service.impl;


import com.retire.mapper.SysUserMapper;
import com.retire.pojo.SysUser;
import com.retire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper SysUserMapper;


    @Async
    @Override
    public List<SysUser> selectAll() {
        List<SysUser> sysUsers = SysUserMapper.selectAll();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("task2任务耗时:"+(currentTimeMillis1-currentTimeMillis)+"ms");

        return sysUsers;
    }
}
