package top.nlfb.ManagerSystem.mapper;

import org.springframework.stereotype.Repository;
import top.nlfb.ManagerSystem.pojo.User;

import java.util.List;

/**
 * @author zx
 * @date 2020/9/27
 **/
@Repository
public interface UserMapper {
//    登陆 正确返回1 不正确返回2
   public List<User> loginIn(User user);
}
