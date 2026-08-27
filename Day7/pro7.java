package day7;

public class pro7 {


		static String correctPassword = "231";
		static void tryPassword(String password) {
			System.out.println("trying:"+password);
			if(password.equals(correctPassword)) {
				System.out.println("password found:"+password);
				return;
			}
			System.out.println("wrong password.go back and try again.");
		}
		public static void main(String[] args) {
			tryPassword("123");
			tryPassword("231");
			tryPassword("122");
			tryPassword("1211");
		}

}
