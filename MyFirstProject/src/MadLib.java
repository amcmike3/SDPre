import java.util.Scanner;

public class MadLib {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to mad libs would you like a long or short story?");
		String choice = scanner.next();

		if (choice.equalsIgnoreCase("short")) {
			System.out.println("Please Enter your name ");
			String input1 = scanner.next();
			System.out.println("Please Enter adjective ");
			String input2 = scanner.next();
			System.out.println("Please Enter an Animal");
			String input3 = scanner.next();
			
			System.out.println(input1 + " smells like a " 
					+ input2 + " " + input3 + ".");
		}
		else if (choice.equalsIgnoreCase("long")) {

			System.out.println("Please Enter Adjective ");
			String input1 = scanner.next();
			System.out.println("Please Enter Noun-Plural ");
			String input2 = scanner.next();
			System.out.println("Please Enter silly nickname ");
			String input3 = scanner.next();
			System.out.println("Please Enter Verb-past tense ");
			String input4 = scanner.next();
			System.out.println("Please Enter a Place plural");
			String input5 = scanner.next();
			System.out.println("Please Enter silly nickname ");
			String input6 = scanner.next();
			System.out.println("Please Enter Noun ");
			String input7 = scanner.next();
			System.out.println("Please Enter Verb-pastense ");
			String input8 = scanner.next();
			System.out.println("The music roaring out of the speakers was loud and " + input1
					+ ". Why did I agree to come with them here? \n"
					+ "My two sisters were dancing and singing along with the musicians on stage. "
					+ "At least they were having fun, right? \n" + "Me being the only boy in our small family, "
					+ "I was expected to do these kinds of things with my " + input2
					+ ", even though I absolutely HATED these kinds of things! \n" + "I was practically dragged to "
					+ input5 + " against my will. \n" + "I looked over to my older sister"
					+ ", Katie, and whispered into her ear, " + input3
					+ " When can we leave? \nI'm getting bored She looked my way and shrugged, "
					+ "as if she didn't know. Ask Zoe, after all it was her idea in the first place Katie said shortly after. \n"
					+ "I nodded and " + input4
					+ " my way in the crowd of people, the exact reason I hate going to these kinds of things, "
					+ "looking for my younger sister, Zoe. \nWhen I finally found her I tapped her shoulder. "
					+ "She turned around and looked into my green eyes Why aren't you having fun, Kyle She asked. \n"
					+ "Because I don't really like going to " + input5 + ". Can we go home now I " + input6
					+ ". \nZoe waved a finger at me saying, One more " + input7
					+ ", and then we can leave I was grateful to hear this, since I wanted to leave as soon as possible. \n"
					+ "I walked back through the crowd to tell Katie the details on our leaving time. Man, I was so "
					+ input8 + "to leave!");

		} else {
			System.out.println("invalid option. Goodbye.");
		}
		scanner.close();
	}
}
