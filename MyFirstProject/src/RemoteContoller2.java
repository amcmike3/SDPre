import java.util.Scanner;

public class RemoteContoller2 {
	public static void main(String[] args) {
		System.out.println("To begin turn on the remote control: ");
		Scanner scanner = new Scanner(System.in);
		boolean power = false;
		String button = scanner.next();
		if (button.equalsIgnoreCase("on")) {
			System.out.println("TURNING ON...");
			power = true;	
		} else {
			System.out.println("Turn on remote...");
		}
		
		while(power) {
			System.out.println("Please press a button (0-9)");
			button = scanner.next();
			switch(button) {
			case "0" :
				printButton();
				break;
			case "1" :
				printButton();
				break;
			case "2" :
				printButton();
				break;
			case "3" :
				printButton();
				break;
			case "4" :
				printButton();
				break;
			case "5" :
				printButton();
				break;
			case "6" :
				printButton();
				break;
			case "7" :
				printButton();
				break;
			case "8" :
				printButton();
				break;
			case "9" :
				printButton();
				break;
			case "off" :
				System.out.println("TURNING OFF...");
				power = false;
				break;
			default:
				System.out.println("Command not recognized...");	

			}
			
		}	
		scanner.close();
	}
	public static void printButton() {
		System.out.println("Boop");
	}
}
