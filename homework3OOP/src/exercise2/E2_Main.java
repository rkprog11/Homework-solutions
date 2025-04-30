package exercise2;

public class E2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m1 = new Email();
		//Static type of m1 is Message, but the dynamic type is Email, as it gets created with "new Email()"
		Message m2 = new SMS();
		
		System.out.println(m1.getType());
		System.out.println(m2.getType());
		//The Methods of the dynamic type are getting called, because the dynamic type is the type of an object during the runtime
		
		//m1.send();
		//The compiler finds no method "send" for the static type "Message" for m1 and thus can't compile
		//a fix for this is casting a different type for the compiler, however this only works if m1 has the right dynamic type
		((Email)m1).send();
	}

}
 