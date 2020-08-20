package com.mymusic.wxw.service.impl;


import com.mymusic.wxw.dao.ConsumerMapper;
import com.mymusic.wxw.model.Consumer;
import com.mymusic.wxw.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerMapper consumerMapper;

    public boolean addUser(Consumer consumer) {
        return consumerMapper.insertSelective(consumer) >0 ?true:false;
    }

    public boolean updateUserMsg(Consumer consumer) {
        return consumerMapper.updateUserMsg(consumer) >0 ?true:false;
    }

    public boolean updateUserAvator(Consumer consumer) {

        return consumerMapper.updateUserAvator(consumer) >0 ?true:false;
    }

    public boolean existUser(String username) {
        return consumerMapper.existUsername(username)>0 ? true:false;
    }

    public boolean veritypasswd(String username, String password) {

        return consumerMapper.verifyPassword(username, password)>0?true:false;
    }

//    删除用户
    public boolean deleteUser(Integer id) {
        return consumerMapper.deleteUser(id) >0 ?true:false;
    }

    public List<Consumer> allUser() {
        return consumerMapper.allUser();
    }

    public List<Consumer> userOfId(Integer id) {

        return consumerMapper.userOfId(id);
    }

    public List<Consumer> loginStatus(String username) {

        return consumerMapper.loginStatus(username);
    }
}
