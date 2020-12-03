import com.trista.dao.UserMapper;
import com.trista.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test01() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper2 = context.getBean("userMapper2",UserMapper.class);
        List<User> userList = userMapper2.getUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
