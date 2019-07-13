package com.itheima.service.Impl;


import com.itheima.dao.UserDao;
import com.itheima.domain.Item;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements UserService {


  @Autowired
  private UserDao userDao;

    public Item findid(Integer id) {
        return userDao.findbyid(id);
    }
}
