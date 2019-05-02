package interfaceActivity;

public class ConcreteClass implements MyInterface,YourInterface {

	public static void main(String[] args) {
		ConcreteClass class1 = new ConcreteClass();
		
		MyInterface myInterface = new ConcreteClass();//or
		
		class1.sayHello();
		class1.shakeHand();
		class1.letsChat();

	}

	@Override
	public void sayHello() {
		System.out.println("Hi, There!");
		System.out.println("I am from  "+companyName);
	}

	@Override
	public void shakeHand() {
		System.out.println("Shake Hand!!!");
		
	}

	@Override
	public void letsChat() {
		System.out.println("Let's have coffee and chat!");
	}
	
	}


