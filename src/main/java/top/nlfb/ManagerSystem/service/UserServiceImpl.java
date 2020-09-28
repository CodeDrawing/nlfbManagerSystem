package top.nlfb.ManagerSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.nlfb.ManagerSystem.mapper.UserMapper;
import top.nlfb.ManagerSystem.pojo.User;

import java.util.List;

/**
 * @author zx
 * @date 2020/9/27
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> loginIn(User user) {
        List<User> users = userMapper.loginIn(user);
        return users;
    }
}
