package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 =  new Email("Mohamed","Yilmaz","ABC Technologies.");
		em1.setMailbox(40);
		em1.setAlternateEmail("yil@gmail.com");
		String ans = em1.showInfo();
		System.out.println(ans);
	}

}
