import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.EmployeeService;
 

 
public class Demo
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 
        //EmployeeManager manager = (EmployeeManager) context.getBean(EmployeeManager.class);
         
        //OR this will also work
         
        EmployeeService service = (EmployeeService) context.getBean("employeeService");
         
        System.out.println(service.createNewEmployee());
    }
}