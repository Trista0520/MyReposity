import com.trista.pojo.Student;
import com.trista.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user2", User.class);
        System.out.println(user2 == user3);
    }
}
