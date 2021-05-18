package CollcetionOfAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		ArrayList<Participant> participants = new ArrayList<>();
		int n_participants = 0;
		int count_participants = 0;
		do {
			System.out.println("+======================+");
			System.out.println("+Options               +");
			System.out.println("+======================+");
			System.out.println("+1. Start Sharing      +");
			System.out.println("+2. Update Participant +");
			System.out.println("+3. Delete Participant +");
			System.out.println("+4. Close App          +");
			System.out.println("+======================+");
			System.out.print("Choice >> ");
			try {
				input = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Your input must be numeric");
				scan.nextLine();
			}
			scan.nextLine();
			
			if(input == 1) {
				int shareNum = -1;
				String name;
				
				do {
					System.out.print("Input a number [0 - 100]: ");
					try {
						shareNum = scan.nextInt();
					} catch (Exception e) {
						System.out.println("Your input must be numeric");
//						scan.nextLine();
					}
					scan.nextLine();
				}while(shareNum < 0 || shareNum > 100);
				boolean duplicateName = false;
				do {
					duplicateName = false;
					System.out.print("Could you give me your username [5 - 20 Characters]? ");
					name = scan.nextLine();
					for(int i = 0;i < participants.size();i++) {
						if(participants.get(i).username.equals(name)) {
							duplicateName = true;
							System.out.println("Username has already been taken");
							scan.nextLine();
							break;
						}
					}
				}while(name.length() < 5 || name.length() > 20 || duplicateName);
				n_participants += 1;
				count_participants += 1;
				Participant temp = new Participant(shareNum,n_participants,name);
				participants.add(temp);
				System.out.printf("You are the %d that joins the game\n",count_participants);
				System.out.printf("Your share number: %d",shareNum);
				scan.nextLine();
			}
			else if (input == 2) {
				if(n_participants == 0) {
					System.out.println("There is no participant");
					scan.nextLine();
				}
				else {
					System.out.println("+======================================+");
					System.out.println("+Share List                            +");
					System.out.println("+======================================+");
					for(int i = 0;i < participants.size();i++) {
						System.out.printf("| %-3d| %-20s| %-5d|\n",i+1,participants.get(i).username,participants.get(i).shareNumber);
					}
					System.out.println("+======================================+");
					int getInput = -1;
					do {
						System.out.printf("Which participant you would like to update [1 - %d][0 to exit]? ",n_participants);
						
						try {
							getInput = scan.nextInt();
						} catch (Exception e) {
							System.out.println("Your input must be numeric");
							scan.nextLine();
						}
						scan.nextLine();
						if(getInput == 0) {
							break;
						}
					}while(getInput < 1 || getInput > participants.size());
					if(getInput == 0)continue;
					int shareNum = -1;
					
					do {
						System.out.print("Input a number [0 - 100]: ");
						try {
							shareNum = scan.nextInt();
						} catch (Exception e) {
							System.out.println("Your input must be numeric");
//							scan.nextLine();
						}
						scan.nextLine();
					}while(shareNum < 0 || shareNum > 100);
					participants.get(getInput-1).shareNumber = shareNum;
					System.out.println("Update successful");
					scan.nextLine();
				}
			}
			else if(input == 3) {
				if(n_participants == 0) {
					System.out.println("There is no participant");
					scan.nextLine();
				}
				else {
					System.out.println("+======================================+");
					System.out.println("+Share List                            +");
					System.out.println("+======================================+");
					for(int i = 0;i < participants.size();i++) {
						System.out.printf("| %-3d| %-20s| %-5d|\n",i+1,participants.get(i).username,participants.get(i).shareNumber);
					}
					System.out.println("+======================================+");
					int getInput = -1;
					do {
						System.out.printf("Which participant you would like to delete [1 - %d][0 to exit]? ",n_participants);
						
						try {
							getInput = scan.nextInt();
						} catch (Exception e) {
							System.out.println("Your input must be numeric");
//							scan.nextLine();
						}
						scan.nextLine();
						if(getInput == 0) {
							break;
						}
					}while(getInput < 1 || getInput > participants.size());
					if(getInput == 0)continue;
					participants.remove(getInput-1);
					n_participants -= 1;
					System.out.println("Participant successfully removed from event");
					scan.nextLine();
				}
			}
			else if(input == 4) {
				int n = participants.size();
				for(int i = 0;i<n-1;i++) {
					for(int j = 0; j < n-i-1;j++) {
						if(participants.get(j).username.compareTo(participants.get(j+1).username) > 0) {
							Collections.swap(participants, j, j+1);
						}
					}
				}
				ArrayList <Participant> Arr2 = new ArrayList<>();
				for (Participant participant : participants) {
					Arr2.add(participant);
				}
				Collections.shuffle(Arr2);
				Collections.reverse(Arr2);
				
				System.out.println("Here's the completed share list");
				System.out.println("Remember, sharing is caring, happy sharing :D");
				System.out.println("+===============================================+");
				System.out.println("+ Share List                                    +");
				System.out.println("+===============================================+");
				System.out.println("+ Username             |   Before   |   After   +");
				System.out.println("+===============================================+");
				for(int i = 0;i < participants.size();i++) {
					System.out.printf("| %-20s | %-10d | %-9d |\n",participants.get(i).username,participants.get(i).shareNumber,Arr2.get(i).shareNumber);
				}
				System.out.println("+===============================================+");
				scan.nextLine();
				
			}
		}while(input != 4);
		
		
		
		
		
		
		
		scan.close();
	}

}
