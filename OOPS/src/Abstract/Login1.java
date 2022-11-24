package Abstract;

   public class Login1 extends Login {
void cancelButton() {
	System.out.println("Cancel button");
}
public static void main(String[] args) {
	Login s1=new Login1();
	s1.cancelButton();
}
}

