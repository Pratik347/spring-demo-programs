import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String [] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	
		obj.setMessage("Good Morning !");
		System.out.println(obj.getMessage());
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj1.getMessage());*/
		
		
		
		/*HelloWorldSetterDemo obj = (HelloWorldSetterDemo) context.getBean("helloWorldSetterDemo");
		System.out.println(obj.getMessage());*/
		
		
		Room obj = (Room) context.getBean("room");
		System.out.println(obj.getProjector().switchOffProjector());		
	}
}
