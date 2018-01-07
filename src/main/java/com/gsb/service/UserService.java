package com.gsb.service;

import com.gsb.dao.UserMapper;
import com.gsb.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService  {

    @Resource
    private UserMapper userDao;
    public List<User> getAllUser() {
        try{
//代码区
            return userDao.selectAllUser();
        }
        catch(Exception e){
            String xx=e.getMessage();
            System.out.print(e.getMessage());
            return null;
//异常处理
        }


    }
}
