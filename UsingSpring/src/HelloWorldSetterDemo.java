
public class HelloWorldSetterDemo {
	private String message;
	
	public void init() {
		System.out.println("Bean is going through it");
	}
	
	public void destroy() {
		System.out.println("Bean is going to destroy");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
