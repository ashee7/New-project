package EmailApp;

public class EmailMain {

	public static void main(String[] args) {
		Email nishee=new Email();
		System.out.println(nishee.getEmail());
		nishee.setPassword("newpassword");
		System.out.println(nishee.getPassword());
		System.out.println(nishee.getMailBoxCapacity());
	}

}
