import com.gjw.diy.UserController;
import com.gjw.service.UserService;
import com.gjw.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/1 15:23
 * @desc:
 */
public class MyTest {

    @Test
    public void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        UserController userController = context.getBean("userController", UserController.class);
//        userController.testAop("aaaavvv");
        UserService service = (UserService) context.getBean("userServiceImpl");
        service.delete();


    }

}
