package top.nlfb.ManagerSystem.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.nlfb.ManagerSystem.pojo.User;
import top.nlfb.ManagerSystem.service.IUserService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zx
 * @date 2020/9/27
 **/
@Controller
@RequestMapping("/user")
public class UserControl {
    @Autowired
    IUserService iUserService;


    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        Model model, HttpSession httpSession){
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        List<User> users = iUserService.loginIn(user);
        if(users.size()==1){
            httpSession.setAttribute("loginUser",userName);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或密码错误，请重试");
            return "login";
        }
    }

}
