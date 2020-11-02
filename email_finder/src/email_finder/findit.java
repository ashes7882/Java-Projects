package email_finder;
import java.util.*; 


public class findit {

	public static void main(String[] args) {
		
		String[] emails = {"xyz@abc.com", "abc@xyz.com", "aaa@bbb.com", "bbb@aaa.com", "MNO@JKL.COM"};
		for(int m=0; m<emails.length; m++) {
			emails[m] = emails[m].toLowerCase();
		}
		System.out.println("The current data set is:");
		for(String element:emails) {
			System.out.println(element);
			}
		
		int length = emails.length;

		System.out.println("Please enter an email to search in the data set:");
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine().toLowerCase();

		int n;
		for(n=0; n<length; n++){
			if(emails[n].equals(userInput)) {
				System.out.println("Found the email at index:" + n);
				break;
		}
	}
		if(n==length) {
			System.out.println("Email not found");
		}
	}
}
