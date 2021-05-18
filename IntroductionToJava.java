import java.util.Scanner;

public class IntroductionToJava {

	public static void main(String[] args) {
		System.out.println(" /$$$$$$$   /$$$$$$                /$$$$$ /$$$$$$$   /$$$$$$$$       /$$       /$$");
		System.out.println("| $$__  $$  |__  $$               |_  $$| $$__  $$  |__  $$__/	    | $$      | $$");
		System.out.println("| $$  \\ $$     | $$                 | $$| $$  \\ $$    | $$  /$$$$$$ | $$$$$$$ | $$  /$$$$$$");
		System.out.println("| $$$$$$$      | $$   /$$$$$$       | $$| $$$$$$$/    | $$ |____  $$| $$__  $$| $$ /$$__  $$");
		System.out.println("| $$__  $$ /$$ | $$  |______/  /$$  | $$| $$____/     | $$  /$$$$$$$| $$  \\ $$| $$| $$$$$$$$");
		System.out.println("| $$  \\ $$| $$ | $$           | $$  | $$| $$          | $$ /$$__  $$| $$  | $$| $$| $$_____/");
		System.out.println("| $$$$$$$/|  $$$$$/           |  $$$$$$/| $$          | $$|  $$$$$$$| $$$$$$$/| $$|  $$$$$$$");
		System.out.println("|_______/  \\_____/             \\_______/|__/          |__/ \\_______/|_______/ | __/\\________/");
		
		Scanner scan = new Scanner(System.in);
		
		int input,num1,num2;
		boolean bool1,bool2;
		
		do {
			System.out.println("1. Start The Simulation!!");
			System.out.println("2. Close App");
			System.out.print("Choice >> ");
			input = scan.nextInt();
			scan.nextLine();
			
			if(input == 1) {
				do {
					System.out.print("Input the First number [1 - 100](inclusive): ");
					num1 = scan.nextInt();
					scan.nextLine();
				}while(num1 < 1 || num1 > 100);
				do {
					System.out.print("Input the Second number [1 - 100](inclusive): ");
					num2 = scan.nextInt();
					scan.nextLine();
				}while(num2 < 1 || num2 > 100);
				System.out.println("+======================================================================================================================+");
				System.out.println("+  + (String Type)  |  (Character Type  |  * (Integer Type)  | / (Floating Type)  | input 1 == input 2 (Boolean Type)  +");
				System.out.println("+======================================================================================================================+");
				System.out.printf("        69 + 68     |       E    D      |         4761       |         1.015      |                   %b\n",num1 == num2);
				System.out.println("+======================================================================================================================+");
				System.out.println("Press enter to proceed..");
				scan.nextLine();
				
				do {
					System.out.print("Give me value for p1 [true | false]: ");
					bool1 = scan.nextBoolean();
					scan.nextLine();
				}while(!(bool1 == true || bool1 == false));
				do {
					System.out.print("Give me value for p2 [true | false]: ");
					bool2 = scan.nextBoolean();
					scan.nextLine();
				}while(!(bool2 == true || bool2 == false));
				
				System.out.println("+==================================================================+");
				System.out.println("+Logical Table");
				System.out.println("+==================================================================+");
				System.out.print("+ P1 = ");
				System.out.print(bool1?"T":"F");
				System.out.print(", P2 = ");
				System.out.println(bool2?"T":"F");
				System.out.println("+==================================================================+");
				System.out.println("+      !P1       |       !P2       |       &&       |       ||     +");
				System.out.println("+==================================================================+");
				System.out.printf("+%-5b     |%-5b     |%-5b     |%-5b     |",bool1,bool2,bool1==bool2,bool1||bool2);
				System.out.println("+==================================================================+");
			}else if(input == 2)System.out.println("Thank you for using the apps!!");
		}while(input != 2);
		
		
		
		scan.close();
	}
}
