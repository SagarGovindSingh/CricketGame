package cricket;

import java.util.Random;
import java.util.Scanner;

public class CricketGame {

public static void main(String[] args) {
	int runs1 = 0;
	int wickets1 = 0;
	int runs2 = 0;
	int wickets2 = 0;
	int y = 0;
	int z = 0;
	int x = 0;
	Scanner scn;
	do {
	
	// Rules
	System.out.println("WELCOME TO THE GAME OF CRICKET.");
	System.out.println("YOU vs COMPUTER.");
	System.out.print("Enter the number of wicket you want to play (1 - 10): ");
	 scn = new Scanner(System.in);
	int w = scn.nextInt();
	if(w > 10) {
		System.out.println("INVALID CHOICE");
		 System.exit(0);
	}
	System.out.println("******************************************************************\n");
	System.out.println("GAME RULES");
	System.out.println("1. The team who scores the highest runs will win.\n"
				     + "2. Each team will get " + w + " wickets.\n"
				     + "3. The input during the game should be in between 0 to 6.\n"
				     + "4. If the input during the batting is greater than 6, it will be counted as 0.\n"
				     + "********************************************************************\n");
	
	
	// Toss
	System.out.println("TOSS BEGIN.");
	System.out.println("0 - HEAD.\n"
				           + "1 - TAIL.");
	System.out.print("Enter your choice: ");
	int t = scn.nextInt();
		if(t > 1) {
			System.out.println("Your choice is INVALID. ");
			 System.exit(0);
		}
		if(t == 0){
			System.out.println("Your choice is HEAD.\n");
		}
		else  {
			System.out.println("Your choice is TAIL.\n");
		}
		
	System.out.print("TOSSING");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e1) {
	}
	System.out.print("........");
	try {
		Thread.sleep(300);
	} catch (InterruptedException e1) {
	}
	System.out.print("..........");
	try {
		Thread.sleep(200);
	} catch (InterruptedException e1) {
	}
	System.out.print(".......................");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e1) {
	}
	System.out.println("....\n");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
	}
	Random rand = new Random();    
	int rd = rand.nextInt(2);
	z = rd;
		if(z == t) {
		System.out.println("YOU WON THE TOSS.");
		System.out.println("SELECT 0 FOR BATTING \n SELECT 1 FOR BOWLING.");
		System.out.print("ENTER YOUR CHOICE: ");
		int c = scn.nextInt();
		y = c;
		if(y == 0) {
			System.out.println("YOU CHOOSE TO BAT\n");
		}
		else if(y == 1) {
			System.out.println("YOU CHOOSE TO BOWL\n");
		}
		else {
			System.out.println("INVALID CHOICE\n");
		}
		}
		if ((z != t) && z == 0) {
			System.out.println("COMPUTER HAS WON THE TOSS AND CHOOSEN TO BAT\n");
		}
		else if ((z != t) && z == 1) {
			System.out.println("COMPUTER HAS WON THE TOSS AND CHOOSEN TO BOWL\n");
		}
			
		System.out.print("LOADING");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
		}
		System.out.print("........");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e1) {
		}
		System.out.print(".....................");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e1) {
		}
		System.out.print(".............");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
		}
		System.out.println("....\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
		}
	
	// your batting
	if(y== 0 && z == t || z == 1 && z != t) {
	System.out.println("YOUR BATTING");
	System.out.println("SCORE");
	System.out.println("RUNS = " + runs1 + "                                  WICKETS = " + wickets1);
	
	while(wickets1 < w) {
		System.out.print("input: ");
		int d = scn.nextInt();
		Random rand1 = new Random();    
        int rd1 = rand1.nextInt(6);
		if(d != rd1 && d < 7) {
			runs1 = runs1 + d;
		}
		else if(d > 6) {
			runs1 = runs1 + 0;
		}
		else if(d == rd1){
			wickets1 = wickets1 + 1;
			System.out.println("RUNS = " + runs1 + "                                 WICKETS = " + wickets1);
			System.out.println("*************************************************************\n");	
		}
			}
	System.out.println("END OF 1st INNING");
	System.out.println("YOUR SCORE           " +  runs1 + "/" + wickets1);
	System.out.println("COMPUTER NEED " + (runs1 + 1) +" TO WIN");
	System.out.println("*************************************************************\n");
	System.out.println("SECOND INNING BEGINS\n");
	System.out.print("LOADING");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e1) {
	}
	System.out.print("........");
	try {
		Thread.sleep(300);
	} catch (InterruptedException e1) {
	}
	System.out.print(".....................");
	try {
		Thread.sleep(200);
	} catch (InterruptedException e1) {
	}
	System.out.print(".............");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e1) {
	}
	System.out.println("....\n");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
	}
	
	// computer batting
	System.out.println("COMPUTER BATTING");
	System.out.println("SCORE");
	System.out.println("RUNS = " + runs2 + "                                   WICKETS = " + wickets2);
			
	while(wickets2 < w && runs2 <= (runs1+1)){
		System.out.print("input:");
		int e = scn.nextInt();
		Random rand2 = new Random();    
		int rd2 = rand2.nextInt(6);
		if(e != rd2 && e < 7) {
			runs2 = runs2 + rd2;
		}
		else if(e > 6) {
			runs2 = runs2 + rd2;
		}
		else if(e == rd2) {
			wickets2 = wickets2 + 1;
			System.out.println("RUNS = " + runs2 + "                                  WICKETS = " + wickets2);
			System.out.println("*************************************************************\n");	
		}
	}
	System.out.println("END OF 2nd INNING");
	System.out.println("COMPUTER SCORE           " + runs2 +"/"+wickets2);
	System.out.println("*****************************************************************\n");	
	
	// game decision
	if(runs1 < runs2) {
		System.out.println("COMPUTER WON");
		int k = w - wickets2;
		System.out.println("COMPUTER WON BY " + k +" WICKETS");
	}
	else if(runs1 > runs2) {
		System.out.println("YOU WON");
		int l = runs1 - runs2;
		System.out.println("YOU WON BY " + l +" RUNS");
	}
	else {
		System.out.println("GAME DRAW");
	}
		}
			
	// computer batting		
	else if(y== 1 && z == t || z == 0 && z != t) {
		System.out.println("COMPUTER BATTING");
		System.out.println("SCORE");
		System.out.println("RUNS = " + runs2 + "                                   WICKETS = " + wickets2);
		
	while(wickets2 < w) {
		System.out.print("input: ");
		int d = scn.nextInt();
		Random rand1 = new Random();    
		int rd1 = rand1.nextInt(6);
		if(d != rd1 && d < 7) {
			runs2 = runs2 + rd1;
		}
		else if(d > 6) {
			runs2 = runs2 + 0;
		}
		else if (d == rd1) {
			wickets2 = wickets2 + 1;
			System.out.println("RUNS = " + runs2 + "                                 WICKETS = " + wickets2);
			System.out.println("*************************************************************\n");	
		}
		 }
	System.out.println("END OF 1st INNING");
	System.out.println("COMPUTER SCORE           " +  runs2 + "/" + wickets2);
	System.out.println("YOU NEED " + (runs2+1) +" TO WIN");
	System.out.println("******************************************************************\n");
	System.out.println("SECOND INNING BEGINS\n");
	System.out.print("LOADING");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e1) {
	}
	System.out.print("........");
	try {
		Thread.sleep(300);
	} catch (InterruptedException e1) {
	}
	System.out.print(".....................");
	try {
		Thread.sleep(200);
	} catch (InterruptedException e1) {
	}
	System.out.print(".............");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e1) {
	}
	System.out.println("....\n");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
	}
	// your batting
	System.out.println("YOUR BATTING");
	System.out.println("SCORE");
	System.out.println("RUNS = " + runs1 + "                                   WICKETS = " + wickets1);
	while(wickets1 < w && (runs2+1) >= runs1){
		System.out.print("input: ");
		int e = scn.nextInt();
		Random rand2 = new Random();    
		int rd2 = rand2.nextInt(6);
		if(e != rd2 && e < 7) {
			runs1 = runs1 + e;
		}
		else if(e > 6) {
			runs1 = runs1 + 0;
		}
		else if (e == rd2 ) {
			wickets1 = wickets1 + 1;
			System.out.println("RUNS = " + runs1 + "                                WICKETS = " + wickets1);
			System.out.println("***************************************************************\n");	
		}
			}
	System.out.println("END OF 2nd INNING");
	System.out.println("YOUR SCORE           " + runs1 +"/"+ wickets1);
	System.out.println("**********************************************************************\n");	
	
	// game decision
	if(runs1 < runs2) {
	     System.out.println("COMPUTER WON");
	     int l = runs2 - runs1;
			System.out.println("COMPUTER WON BY " + l +" RUNS");
	}
	else if(runs1 > runs2) {
		System.out.println("YOU WON");
		int k = w - wickets1;
		System.out.println("you WON BY " + k +" WICKETS");
	}
	else {
		System.out.println("GAME DRAW");
	}
		}
	System.out.println("**********************************************************************\n");	
	System.out.println("MATCH SUMMARY");
	System.out.println("YOUR SCORE           " +  runs1 + "/" + wickets1);
	System.out.println("COMPUTER SCORE           " +  runs2 + "/" + wickets2);
    System.out.println("******************GAME OVER******************************\n");
    System.out.println("TAP 0 FOR EXIT \n OR \n TAP 1 FOR PLAYING ONE MORE TIME");
    System.out.print("input: ");
	int N = scn.nextInt();
	x = N;
	}while(x==1);
	scn.close();
	}
}
