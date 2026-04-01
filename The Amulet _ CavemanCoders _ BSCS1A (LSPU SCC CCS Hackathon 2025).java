import java.util.Scanner;

public class Main {
	
	private static final int MAX_GUESSES = 5;
    private static final String ANSWER = "AMULET";
	
	public static void main(String[] args) {
		The_End();
		Animation_Thanks ();
		
		Animation_Title_Sequence();
		
		// Menu
		int input = Menu();
		
		if (input == 1) {
			Intro();
			Scene1 ();
		}
		else if (input == 2){
			
			System.out.println(" ========================= ");
			System.out.println("  ");
			System.out.println(" ***** Program Ended ***** ");
			System.out.println("  ");
			System.out.println(" ========================= ");
		}
		else{
			System.out.println(" ========================= ");
			System.out.println("  ");
			System.out.println(" ***** Invalid Input ***** ");
			System.out.println("  ");
			System.out.println(" ========================= ");
		}
		
	}
	

	public static void Intro () {

		space(150);
		System.out.println(" ======================================== ");
		String sentence1 = 
				  
				           "\n  You're a tourist travelling across the "
						  +"\n  Philippines in a cheap rental scooter "
						  +"\n         that you found online.";
		
		for (int i = 0; i < sentence1.length(); i++) {
            System.out.print(sentence1.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence2 = 
				  
				         "\n    The day has been long and the dusk "
				       + "\n               creeps in.";
						 
		
		for (int i = 0; i < sentence2.length(); i++) {
            System.out.print(sentence2.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence3 = 
				  
				           
					     "\n  Eventually, you take a wrong turn into "
					   + "\n       a narrow road to the forest.";
						  
		
		for (int i = 0; i < sentence3.length(); i++) {
            System.out.print(sentence3.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence4 = 
				  
				           
						  
						 "\n   You kept going straight for an hour, "
				  	   + "\n         the road feels endless.";
		
		for (int i = 0; i < sentence4.length(); i++) {
            System.out.print(sentence4.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		int i = 0;
		while(i < 2) {
			Animation_Scooter_Riding();
			i++;
		}
		
		// bridge
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence5 = 
				  
				         "\n    Suddenly the scooter starts slowing"
				       + "\n   down and broke by a mysterious bridge.";
				 
		
		for (int k = 0; k < sentence5.length(); k++) {
            System.out.print(sentence5.charAt(k));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		Animation_Bridge();
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence6 = 
				  
				          
				         "\n   Across the bridge sits a dilapidated "
				       + "\n     pair of houses, eerily quiet and "
				       + "\n           no people on sight. ";
		
		for (int k = 0; k < sentence6.length(); k++) {
            System.out.print(sentence6.charAt(k));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		
		
		Animation_Old_House ();
		
	}
	

	public static void Scene1 () {

		space(150);
		System.out.println(" ======================================== ");
		String sentence1 = 
				  
				         "\n          The streets are empty. "
				       + "\n           The air feels heavy. ";
		
		for (int i = 0; i < sentence1.length(); i++) {
            System.out.print(sentence1.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence2 = 
				  
				         "\n            As the night falls, "
				       + "\n        you decide to find shelter. ";
		
		for (int i = 0; i < sentence2.length(); i++) {
            System.out.print(sentence2.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		Animation_Choice();
		Animation_Choice();
		Animation_Choice();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("             Choose Shelter               ");
		System.out.println("                                          ");
		System.out.println("  [1] A broken-down house nearby          ");
		System.out.println("  [2] A distant cottage with a dim light  ");
		System.out.println("                                          ");
		System.out.println(" ======================================== ");
		int option = sc.nextInt();
		
		if (option == 1) {
			Scene2A();
		}
		else if (option == 2 ){
				Scene2B();
		}
		else {
			System.out.println(" ========================= ");
			System.out.println("  ");
			System.out.println(" ***** Invalid Input ***** ");
			System.out.println("  ");
			System.out.println(" ========================= ");
			Scene1();
		}
		
	}
	
	public static void Scene2A() {
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence1 = 
				  
				         "\n       You opened the creaking door. "
				       + "\n   Inside you see the dust covered floors "
				       + "\n           and shattered windows.";
		
		for (int i = 0; i < sentence1.length(); i++) {
            System.out.print(sentence1.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence2 = 
				  
				         "\n   You notice an out-of-place necklace,"
				       + "\n  by the table in the center of the room. \r\n"
				       + "\n          You feel drawn to it..";
		
		for (int i = 0; i < sentence2.length(); i++) {
            System.out.print(sentence2.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		Animation_Enter_House ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("                 Options                  ");
		System.out.println("                                          ");
		System.out.println("  [1] Pick up the mysterious necklace     ");
		System.out.println("  [2] Leave it alone                      ");
		System.out.println("                                          ");
		System.out.println(" ======================================== ");
		int option = sc.nextInt();
		
		if (option == 1) {
			
			
			Animation_First_Pick_Up();
			
			space(150);
			System.out.println(" ======================================== ");
			String sentence3 = 
					  
					         "\n  As you try to pick it up, you feel an"
					       + "\n   intense pain stabbing on your chest. "
					       + "\n     Your head spins and everything "
					       + "\n               goes black";
			
			for (int i = 0; i < sentence3.length(); i++) {
	            System.out.print(sentence3.charAt(i));
	            try {
	    			Thread.sleep(50);
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	            
	        }
			
			System.out.println("\n\n ======================================== \n");
			space(2000);
			
			
			int result = Death2();

			if (result == 1) {
				BridgeV2();	
			}
			else if (result == 2) {
			    Scene1();
			}
			else {
				System.out.println(" ========================= ");
				System.out.println("  ");
				System.out.println(" ***** Invalid Input ***** ");
				System.out.println("  ");
				System.out.println(" ========================= ");
				Scene2A();
			}
			
		}
		else {
			
			Animation_Leave_House();
			
			space(150);
			System.out.println(" ======================================== ");
			String sentence3 = 
					  
					         "\n     You didn’t touch the necklace and"
					       + "\n             decided to leave."
					       + "\n             As you go outside,    \n "
					       + "\n         you hear a strange voice.";
			
			for (int i = 0; i < sentence3.length(); i++) {
	            System.out.print(sentence3.charAt(i));
	            try {
	    			Thread.sleep(50);
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	            
	        }
			
			System.out.println("\n\n ======================================== \n");
			space(2000);
			
			space(150);
			System.out.println(" ======================================== ");
			String sentence4 = 
					  
					        "\n                 “Coward” ";
			
			for (int i = 0; i < sentence4.length(); i++) {
	            System.out.print(sentence4.charAt(i));
	            try {
	    			Thread.sleep(50);
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	            
	        }
			
			System.out.println("\n\n ======================================== \n");
			space(2000);
			
			System.out.println("\n\n ======================================== \n");
			space(2000);
			
			space(150);
			System.out.println(" ======================================== ");
			String sentence5 = 
					  
					         "\n       The door slams shut and the   " 
					       + "\n          darkness swallows you. ";
			
			for (int i = 0; i < sentence5.length(); i++) {
	            System.out.print(sentence5.charAt(i));
	            try {
	    			Thread.sleep(50);
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	            
	        }
			
			System.out.println("\n\n ======================================== \n");
			space(2000);
			
			int result = Death2();

			if (result == 1) {
				BridgeV2();	
			}
			else if (result == 2) {
			    Scene1();
			}
			else {
				System.out.println(" ========================= ");
				System.out.println("  ");
				System.out.println(" ***** Invalid Input ***** ");
				System.out.println("  ");
				System.out.println(" ========================= ");
				Scene2A();
			}
			
		}
		
	}
	
	public static void Scene2B() {
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence3 = 
				  
				         "\n This cottage is old but is not as broken"
				       + "\n            as the first house.     \r\n"
				       + "\n  You feel relief that you can rest here.      \r\n"
				       + "\n        You sit on the dusty chair…"
				       + "\n            and you fall asleep.    \r\n";
		 
		for (int i = 0; i < sentence3.length(); i++) {
            System.out.print(sentence3.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		Animation_Enter_Cottage();
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence4 = 
				  
				         "\n           And then you feel it…         \r\n"
				       + "\n    A pair of claws clawing at your skin "
				       + "\n             from the inside.     \r\n"
				       + "\n  Agonizing pain floods your body and you"
				       + "\n            can’t even scream.   \r\n";
	
		for (int i = 0; i < sentence4.length(); i++) {
            System.out.print(sentence4.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		int result = Death2();

		if (result == 1) {
			BridgeV2();	
		}
		else if (result == 2) {
		    Scene1();
		}
		else {
			System.out.println(" ========================= ");
			System.out.println("  ");
			System.out.println(" ***** Invalid Input ***** ");
			System.out.println("  ");
			System.out.println(" ========================= ");
			Scene2B();
		}
	}
	
	
	public static void BridgeV2 () {
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence3 = 
				  
				         "\n   After the weird occurrence, you find"
				       + "\n       yourself back at the bridge.";
		
		for (int i = 0; i < sentence3.length(); i++) {
            System.out.print(sentence3.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		

		space(150);
		System.out.println(" ======================================== ");
		String sentence1 = 
				  
				         "\n        The Scooter is still broken,  "
				       + "\n    with the night closing in again you "
				     + "\n             have a choice to make:";
		
		for (int i = 0; i < sentence1.length(); i++) {
            System.out.print(sentence1.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n ======================================== ");
		System.out.println("                                          ");
		System.out.println("                 Options                  ");
		System.out.println("                                          ");
		System.out.println("        [1] Enter the house again         ");
		System.out.println("        [2] Go to the cottage again       ");
		System.out.println("                                          ");
		System.out.println(" ======================================== ");
		int option = sc.nextInt();
		
		
		
		if (option == 1) {
			SceneV2A();
		}
		else if (option == 2){
			SceneV2B();
		}
		else {
			System.out.println(" ========================= ");
			System.out.println("  ");
			System.out.println(" ***** Invalid Input ***** ");
			System.out.println("  ");
			System.out.println(" ========================= ");
			BridgeV2();
		}
	
	}

public static void SceneV2A() {
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence1 = 
			  
			         "\n   You decide to enter this house again, "
			       + "\n       hoping for a different outcome.    \r\n"
			       + "\n  Still scared, you open the door and see "
			       + "\n       the mysterious necklace again. ";
	
	for (int i = 0; i < sentence1.length(); i++) {
        System.out.print(sentence1.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	Animation_Enter_House ();
	
	
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence2 = 
			  
			         "\n   Something in your insides tell you to "
			       + "\n  pick it up...you flinch remembering the "
			       + "\n             pain but still you- ";
	 
	for (int i = 0; i < sentence2.length(); i++) {
        System.out.print(sentence2.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" ======================================== ");
	System.out.println("                                          ");
	System.out.println("                 Options                  ");
	System.out.println("                                          ");
	System.out.println("     [1] Take the necklace again          ");
	System.out.println("     [2] Leave it alone                   ");
	System.out.println("                                          ");
	System.out.println(" ======================================== ");
	int option = sc.nextInt();
	
	if (option == 1) {
		
		
		Animation_First_Pick_Up();
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence3 = 
				  
				         "\n              Nothing happens…                    \r\n";
		
		for (int i = 0; i < sentence3.length(); i++) {
            System.out.print(sentence3.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence6 = 
				  
				         "\n   You sighed in relief, but the silence "
				       + "\n            still feels heavy.     \r\n"
				       + "    You sit in the corner of the room with"
				       + "\n          7the moonlight seeping in      \r\n"
				       + "      watching every window and entrance "
				       + "\n         where danger might come....     \r\n";
		
		for (int i = 0; i < sentence6.length(); i++) {
            System.out.print(sentence6.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence7 = 
				  
				         "\n    ........you fall asleep…….........";
		
		for (int i = 0; i < sentence7.length(); i++) {
            System.out.print(sentence7.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		Enclosed_Room();
		
	}
	else if (option == 2){
		
		Animation_Leave_House();
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence3 = 
				  
				         "\n     You didn’t touch the necklace and"
				       + "\n              decided to leave. "
				       + "\n        As you go outside you hear a "
				       + "\n               strange voice.";
		
		for (int i = 0; i < sentence3.length(); i++) {
            System.out.print(sentence3.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence4 = 
				  
				         "  \n                 “Coward” ";
		
		for (int i = 0; i < sentence4.length(); i++) {
            System.out.print(sentence4.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);

		
		space(150);
		System.out.println(" ======================================== ");
		String sentence5 = 
				  
				 			"\n      The door slams shut and the   " 
					       + "\n        darkness swallows you. ";
		
		for (int i = 0; i < sentence5.length(); i++) {
            System.out.print(sentence5.charAt(i));
            try {
    			Thread.sleep(50);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
            
        }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence9 = 
				  
				           "\n             Condolences ";
		
		for (int i = 0; i < sentence9.length(); i++) {
	        System.out.print(sentence9.charAt(i));
	        try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        
	    }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		space(150);
		System.out.println(" ======================================== ");
		String sentence10 = 
				  
				           "\n    Route Taken: Early Bad Ending ";
		
		for (int i = 0; i < sentence10.length(); i++) {
	        System.out.print(sentence10.charAt(i));
	        try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        
	    }
		
		System.out.println("\n\n ======================================== \n");
		space(2000);
		
		int result = Death1();

		if (result == 1) {
			if (Menu() == 1) {
				Intro();
				Scene1 ();
			}
			else {
			}
		}
		else if (result == 2){
			The_End ();
			Animation_Thanks ();
		}
		else {
			System.out.println(" ========================= ");
			System.out.println("  ");
			System.out.println(" ***** Invalid Input ***** ");
			System.out.println("  ");
			System.out.println(" ========================= ");
			SceneV2A();
		}
		
	}
	else {
		System.out.println(" ========================= ");
		System.out.println("  ");
		System.out.println(" ***** Invalid Input ***** ");
		System.out.println("  ");
		System.out.println(" ========================= ");
		SceneV2A();
	}
	
}

public static void SceneV2B() {
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence3 = 
			  
			         "\n You decided to stay in the cottage again ";
	
	for (int i = 0; i < sentence3.length(); i++) {
        System.out.print(sentence3.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	Animation_Enter_Cottage();
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence4 = 
			  
			         "\n   You fall asleep…the same clawing pain"
			         + "\n         returns…but stronger.   \r\n";
	
	for (int i = 0; i < sentence4.length(); i++) {
        System.out.print(sentence4.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(150);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence8 = 
			  
			         "\n                   ... ";
	
	for (int i = 0; i < sentence8.length(); i++) {
        System.out.print(sentence8.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence9 = 
			  
			         "\n          You feel your body split.   "
			       + "\n                 You scream.              \r\n";
	
	for (int i = 0; i < sentence9.length(); i++) {
        System.out.print(sentence9.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	int result = Death1();

	if (result == 1) {
	    BridgeV2();
	}
	else  {
		
	}
	
	
}




public static void Enclosed_Room() {
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence1 = 
			  
			          "\n               You wake up                 \r\n";
	
	for (int i = 0; i < sentence1.length(); i++) {
        System.out.print(sentence1.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence2 = 
			  
			          "\n      The door you initially walked"
			        + "\n            into is gone                \r\n";
	
	for (int i = 0; i < sentence2.length(); i++) {
        System.out.print(sentence2.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence3 = 
			  
			          "\n       The windows are bricked up       \r\n";
	
	for (int i = 0; i < sentence3.length(); i++) {
        System.out.print(sentence3.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence4 = 
			  
			          "\n             YOU’RE TRAPPED!!              \r\n";
	
	for (int i = 0; i < sentence4.length(); i++) {
        System.out.print(sentence4.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	Animation_Enclosed_Room ();
	
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence5 = 
			  
			          "\n          Then, a voice seeped"
			        + "\n          through the darkness:       \r\n";
	
	for (int i = 0; i < sentence5.length(); i++) {
        System.out.print(sentence5.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	

	Anmation_Speak ();
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence8 = 
			  
			          "\n       (you look at the necklace)       \r\n";
	
	for (int i = 0; i < sentence8.length(); i++) {
        System.out.print(sentence8.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	The_Puzzle ();
	
}

public static void The_Puzzle () {
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence1 = 
			  
			          "\n     A blood red glow fills the room       \r\n";
	
	for (int i = 0; i < sentence1.length(); i++) {
        System.out.print(sentence1.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence2 = 
			  
			          "\n     The mysterious necklace floats"
			        + "\n            in front of you                \r\n";
	
	for (int i = 0; i < sentence2.length(); i++) {
        System.out.print(sentence2.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence3 = 
			  
			          "\n         The voice speaks again:              \r\n";
	
	for (int i = 0; i < sentence3.length(); i++) {
        System.out.print(sentence3.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	Anmation_Speak2 ();
	
	Riddle();
	
}

public static void Good_Ending () {
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence1 = 
			  
			          "\n         The voice falls silent.           \r\n";
	
	for (int i = 0; i < sentence1.length(); i++) {
        System.out.print(sentence1.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence2 = 
			  
			          "\n       The Amulet glows bright then"
		            + "\n           it shatters into dust                  \r\n";
	
	for (int i = 0; i < sentence2.length(); i++) {
        System.out.print(sentence2.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence3 = 
			  
			          "\n     A blinding light surrounds you       \r\n";
	
	for (int i = 0; i < sentence3.length(); i++) {
        System.out.print(sentence3.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence4 = 
			  
			          "\n   You open your eyes and you’re back"
		            + "\n          at the main road…                   \r\n";
	
	for (int i = 0; i < sentence4.length(); i++) {
        System.out.print(sentence4.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	Animation_Good_EndingP1 ();
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence5 = 
			  
			          "\n   The scooter engine turns on again.     \r\n";
	
	for (int i = 0; i < sentence5.length(); i++) {
        System.out.print(sentence5.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence6 = 
			  
			          "\n       It all feels like a dream         \r\n";
	
	for (int i = 0; i < sentence6.length(); i++) {
        System.out.print(sentence6.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence7 = 
			  
			          "\n    You feel something in your pocket     \r\n";
	
	for (int i = 0; i < sentence7.length(); i++) {
        System.out.print(sentence7.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence8 = 
			  
			          "\n   The Amulet’s chain is still there..      \r\n";
	
	for (int i = 0; i < sentence8.length(); i++) {
        System.out.print(sentence8.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	
	Animation_Good_EndingP2 ();
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence9 = 
			  
			           "\n           Congratulations ";
	
	for (int i = 0; i < sentence9.length(); i++) {
        System.out.print(sentence9.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence0 = 
			  
			           "\n           Y O U    L I V E D ";
	
	for (int i = 0; i < sentence0.length(); i++) {
        System.out.print(sentence0.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence10 = 
			  
			           "\n       Route Taken: Good Ending ";
	
	for (int i = 0; i < sentence10.length(); i++) {
        System.out.print(sentence10.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	The_End ();
	Animation_Thanks ();
	//good engine title
	
}

public static void Bad_Ending() {
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence1 = 
			  
			          "\n       The room shakes and rumbles        \r\n";
	
	for (int i = 0; i < sentence1.length(); i++) {
        System.out.print(sentence1.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence2 = 
			  
			          "\n      The voice laughs sinisterly..      \r\n";
	
	for (int i = 0; i < sentence2.length(); i++) {
        System.out.print(sentence2.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence3 = 
			  
			          "\n    “YOU WERE NEVER MEANT TO LEAVE!”           \r\n";
	
	for (int i = 0; i < sentence3.length(); i++) {
        System.out.print(sentence3.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	Animation_Bad_Ending_PRoute ();
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence4 = 
			  
			          "\n     The Amulet melts into your face      \r\n";
	
	for (int i = 0; i < sentence4.length(); i++) {
        System.out.print(sentence4.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence5 = 
			  
			          "\n    You scream, but your voice fades"
			        + "\n   as the darkness swallows you again      \r\n";
	
	for (int i = 0; i < sentence5.length(); i++) {
        System.out.print(sentence5.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	
	Animation_Bad_Ending_PRoute ();
	
	
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence9 = 
			  
			           "\n            Condolences ";
	
	for (int i = 0; i < sentence9.length(); i++) {
        System.out.print(sentence9.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	space(150);
	System.out.println(" ======================================== ");
	String sentence10 = 
			  
			           "\n       Route Taken: Bad Ending ";
	
	for (int i = 0; i < sentence10.length(); i++) {
        System.out.print(sentence10.charAt(i));
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
    }
	
	System.out.println("\n\n ======================================== \n");
	space(2000);
	
	int result = Death1();

	if (result == 1) {
		
		int input = Menu();
		
		if (input == 1) {
			Intro();
			Scene1 ();
		}
		else if (input == 2){
			
			System.out.println(" ========================= ");
			System.out.println("  ");
			System.out.println(" ***** Program Ended ***** ");
			System.out.println("  ");
			System.out.println(" ========================= ");
		}
		else{
			System.out.println(" ========================= ");
			System.out.println("  ");
			System.out.println(" ***** Invalid Input ***** ");
			System.out.println("  ");
			System.out.println(" ========================= ");
		}
		
		
	}
	else {
		The_End ();
		Animation_Thanks ();
	}
	
	// bad ending title
	// try again sa bridge 1
	
}

public static void Riddle() {
	var input = new Scanner(System.in);

	// Prompt the user whether to proceed to the Riddle Game
	boolean play = promptConfirmation(input);
	if (!play) {
		gameEnd(false);
		return;
	}
	gameStart(input);

	input.close();
}

public static boolean promptConfirmation(Scanner input) {

	System.out.println("=============================");
	System.out.println("");
	System.out.println("     Riddle to the Death     ");
	System.out.println("");
	System.out.println("        Proceed: (y/n)?");
	System.out.println("");
	System.out.println("=============================");

	System.out.print("Chose your Fate: ");

	if (!input.hasNext())
		return false;

	String choice = input.next();

	return choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes");
}

public static void gameStart(Scanner input) {
	boolean guessed = false;

	for (int i = 0; i < MAX_GUESSES; ++i) {
		clearConsole();

		System.out.printf(
				"----------------------------------------Riddle to the Death [%d/%d]-------------------------------------------------",
				i + 1, MAX_GUESSES);
		System.out.println("");
		System.out.println(
				"                                      I am worn ,yet not clothes. \n                                       I protect, yet can curse \n                                       I am small, yet powerful.");
		System.out.println("");
		System.out.println("                                       | _ | _ | _ | _ | _ | _ |");
		System.out.println("");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");

		System.out.print("Enter your answer: ");
		String answer = input.next();

		if (ANSWER.equalsIgnoreCase(answer)) {
			guessed = true;
			break;
		}

		System.out.println("You Guessed Incorrectly. Press [Enter] to Try Again...");

		input.nextLine();
		input.nextLine();
	}

	gameEnd(guessed);
}

public static void clearConsole() {
	System.out.print("\033[H\033[2J");
}

public static void gameEnd(boolean guessed) {
	if (guessed)
		Good_Ending();
	else
		Bad_Ending();
}
	
	
	// Assets
	
	public static void space (int speed) {
		try {
			Thread.sleep(speed);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
	}
	
	public static int Menu () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("                 Menu                     ");
		System.out.println("                                          ");
		System.out.println("             [1] Start Game               ");
		System.out.println("             [2] Exit                     ");
		System.out.println("                                          ");
		System.out.println(" ======================================== ");
		int option = sc.nextInt();
		return option;
		
	}
	
	
public static int Death1 () {
		
		Animation_Death ();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("              Try Again?                 ");
		System.out.println("                                          ");
		System.out.println("             [1] Yes                      ");
		System.out.println("             [2] Quit                     ");
		System.out.println("                                          ");
		System.out.println(" ======================================== ");
		int option = sc.nextInt();
		return option;
		
	}
	
public static int Death2 () {
		
		Animation_Death ();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("               Continue?                  ");
		System.out.println("                                          ");
		System.out.println("             [1] Yes                      ");
		System.out.println("             [2] Retry                     ");
		System.out.println("             [3] Quit                     ");
		System.out.println("                                          ");
		System.out.println(" ======================================== ");
		int option = sc.nextInt();
		return option;
		
	}
	
	
	// Animations
	
	public static void Animation_Title_Sequence () {
		
		space(500);
		System.out.println(" == ");
		System.out.println("                                          ");
		System.out.println("  * ");
		System.out.println("                                          ");
		System.out.println("    ");
		System.out.println("                                          ");
		System.out.println("  * ");
		System.out.println(" == ");

		space(500);
		
		System.out.println(" ====");
		System.out.println("                                          ");
		System.out.println("  ***");
		System.out.println("                                          ");
		System.out.println("     ");
		System.out.println("                                          ");
		System.out.println("  ***");
		System.out.println(" ====");

		space(500);
		
		System.out.println(" =======");
		System.out.println("                                          ");
		System.out.println("  ******");
		System.out.println("                                          ");
		System.out.println("        ");
		System.out.println("                                          ");
		System.out.println("  ******");
		System.out.println(" =======");

		space(500);
		
		System.out.println(" ===========");
		System.out.println("                                          ");
		System.out.println("  **********");
		System.out.println("                                          ");
		System.out.println("          T ");
		System.out.println("                                          ");
		System.out.println("  **********");
		System.out.println(" ===========");

		space(500);
		
		System.out.println(" =============");
		System.out.println("                                          ");
		System.out.println("  ************");
		System.out.println("                                          ");
		System.out.println("          T H ");
		System.out.println("                                          ");
		System.out.println("  ************");
		System.out.println(" =============");

		space(500);
		
		System.out.println(" ===============");
		System.out.println("                                          ");
		System.out.println("  **************");
		System.out.println("                                          ");
		System.out.println("          T H E ");
		System.out.println("                                          ");
		System.out.println("  **************");
		System.out.println(" ===============");

		space(500);
		
		System.out.println(" ==================");
		System.out.println("                                          ");
		System.out.println("  *****************");
		System.out.println("                                          ");
		System.out.println("          T H E    ");
		System.out.println("                                          ");
		System.out.println("  ***************** ");
		System.out.println(" ==================");

		space(500);
		
		System.out.println(" ======================");
		System.out.println("                                          ");
		System.out.println("  *********************");
		System.out.println("                                          ");
		System.out.println("          T H E      A ");
		System.out.println("                                          ");
		System.out.println("  *********************");
		System.out.println(" ======================");

		space(500);
		
		System.out.println(" ========================");
		System.out.println("                                          ");
		System.out.println("  ***********************");
		System.out.println("                                          ");
		System.out.println("          T H E      A M ");
		System.out.println("                                          ");
		System.out.println("  ***********************");
		System.out.println(" ========================");

		space(500);
		
		System.out.println(" ==========================");
		System.out.println("                                          ");
		System.out.println("  *************************");
		System.out.println("                                          ");
		System.out.println("          T H E      A M U ");
		System.out.println("                                          ");
		System.out.println("  *************************");
		System.out.println(" ==========================");


		space(500);
		
		System.out.println(" ============================");
		System.out.println("                                          ");
		System.out.println("  ***************************");
		System.out.println("                                          ");
		System.out.println("          T H E      A M U L ");
		System.out.println("                                          ");
		System.out.println("  ***************************");
		System.out.println(" ============================");

		space(500);
		
		System.out.println(" ==============================");
		System.out.println("                                          ");
		System.out.println("  *****************************");
		System.out.println("                                          ");
		System.out.println("          T H E      A M U L E ");
		System.out.println("                                          ");
		System.out.println("  *****************************");
		System.out.println(" ==============================");

		space(500);
		
		System.out.println(" ================================");
		System.out.println("                                          ");
		System.out.println("  *******************************");
		System.out.println("                                          ");
		System.out.println("          T H E      A M U L E T ");
		System.out.println("                                          ");
		System.out.println("  *******************************");
		System.out.println(" ================================");

		space(500);
		
		System.out.println(" =================================== ");
		System.out.println("                                          ");
		System.out.println("  **********************************");
		System.out.println("                                          ");
		System.out.println("          T H E      A M U L E T          ");
		System.out.println("                                          ");
		System.out.println("  ********************************** ");
		System.out.println(" ===================================");

		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("  **************************************  ");
		System.out.println("                                          ");
		System.out.println("          T H E      A M U L E T          ");
		System.out.println("                                          ");
		System.out.println("  **************************************  ");
		System.out.println(" ======================================== ");
		
		space(5000);
	}
	
	public static void The_End () {
		
		space(500);
		System.out.println(" == ");
		System.out.println("                                          ");
		System.out.println("  * ");
		System.out.println("                                          ");
		System.out.println("    ");
		System.out.println("                                          ");
		System.out.println("  * ");
		System.out.println(" == ");

		space(500);
		
		System.out.println(" ====");
		System.out.println("                                          ");
		System.out.println("  ***");
		System.out.println("                                          ");
		System.out.println("     ");
		System.out.println("                                          ");
		System.out.println("  ***");
		System.out.println(" ====");

		space(500);
		
		System.out.println(" =======");
		System.out.println("                                          ");
		System.out.println("  ******");
		System.out.println("                                          ");
		System.out.println("        ");
		System.out.println("                                          ");
		System.out.println("  ******");
		System.out.println(" =======");

		space(500);
		
		System.out.println(" ===========");
		System.out.println("                                          ");
		System.out.println("  **********");
		System.out.println("                                          ");
		System.out.println("             T");
		System.out.println("                                          ");
		System.out.println("  **********");
		System.out.println(" ===========");

		space(500);
		
		System.out.println(" =============");
		System.out.println("                                          ");
		System.out.println("  ************");
		System.out.println("                                          ");
		System.out.println("             T    ");
		System.out.println("                                          ");
		System.out.println("  ************");
		System.out.println(" =============");

		space(500);
		
		System.out.println(" ===============");
		System.out.println("                                          ");
		System.out.println("  **************");
		System.out.println("                                          ");
		System.out.println("             T H E       ");
		System.out.println("                                          ");
		System.out.println("  **************");
		System.out.println(" ===============");

		space(500);
		
		System.out.println(" ==================");
		System.out.println("                                          ");
		System.out.println("  *****************");
		System.out.println("                                          ");
		System.out.println("             T H E           ");
		System.out.println("                                          ");
		System.out.println("  ***************** ");
		System.out.println(" ==================");

		space(500);
		
		System.out.println(" ======================");
		System.out.println("                                          ");
		System.out.println("  *********************");
		System.out.println("                                          ");
		System.out.println("             T H E             ");
		System.out.println("                                          ");
		System.out.println("  *********************");
		System.out.println(" ======================");

		space(500);
		
		System.out.println(" ========================");
		System.out.println("                                          ");
		System.out.println("  ***********************");
		System.out.println("                                          ");
		System.out.println("             T H E      E          ");
		System.out.println("                                          ");
		System.out.println("  ***********************");
		System.out.println(" ========================");

		space(500);
		
		System.out.println(" ==========================");
		System.out.println("                                          ");
		System.out.println("  *************************");
		System.out.println("                                          ");
		System.out.println("             T H E      E N          ");
		System.out.println("                                          ");
		System.out.println("  *************************");
		System.out.println(" ==========================");


		space(500);
		
		System.out.println(" ============================");
		System.out.println("                                          ");
		System.out.println("  ***************************");
		System.out.println("                                          ");
		System.out.println("             T H E      E N D            ");
		System.out.println("                                          ");
		System.out.println("  ***************************");
		System.out.println(" ============================");

		space(500);
		
		System.out.println(" ==============================");
		System.out.println("                                          ");
		System.out.println("  *****************************");
		System.out.println("                                          ");
		System.out.println("             T H E      E N D            ");
		System.out.println("                                          ");
		System.out.println("  *****************************");
		System.out.println(" ==============================");

		space(500);
		
		System.out.println(" ================================");
		System.out.println("                                          ");
		System.out.println("  *******************************");
		System.out.println("                                          ");
		System.out.println("             T H E      E N D            ");
		System.out.println("                                          ");
		System.out.println("  *******************************");
		System.out.println(" ================================");

		space(500);
		
		System.out.println(" =================================== ");
		System.out.println("                                          ");
		System.out.println("  **********************************");
		System.out.println("                                          ");
		System.out.println("             T H E      E N D            ");
		System.out.println("                                          ");
		System.out.println("  ********************************** ");
		System.out.println(" ===================================");

		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("  **************************************  ");
		System.out.println("                                          ");
		System.out.println("             T H E      E N D            ");
		System.out.println("                                          ");
		System.out.println("  **************************************  ");
		System.out.println(" ======================================== ");
		
		space(5000);
		
	}
	
	public static void Animation_Scooter_Riding() {
		
space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("  o                               ");
		System.out.println("--___                            ");
		System.out.println("__mmmmo<                                   ");
		System.out.println("      (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("       o                               ");
		System.out.println("     --___                            ");
		System.out.println(" ___j__mmmmo<                                   ");
		System.out.println("o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("            o                               ");
		System.out.println("          --___                            ");
		System.out.println("      ___j__mmmmo<                                   ");
		System.out.println("     o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		

		
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                o                               ");
		System.out.println("              --___                            ");
		System.out.println("          ___j__mmmmo<                                   ");
		System.out.println("         o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                    o                               ");
		System.out.println("                  --___                            ");
		System.out.println("              ___j__mmmmo<                                   ");
		System.out.println("             o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                       o                               ");
		System.out.println("                      --___                            ");
		System.out.println("                   __j__mmmmo<                                   ");
		System.out.println("                 o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                            o                               ");
		System.out.println("                           --___                            ");
		System.out.println("                        __j__mmmmo<                                   ");
		System.out.println("                      o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                        o ");
		System.out.println("                                     --___");
		System.out.println("                                 __j__mmmm");
		System.out.println("                                 o)       ");
		System.out.println("----------------------------------------- ");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                        ");
		System.out.println("                                     ");
		System.out.println("                                     __j__");
		System.out.println("                                    o)    ");
		System.out.println("----------------------------------------- ");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
	}
	
	public static void Animation_Bridge () {
		
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("     o                                    ");
		System.out.println("     T        ____________________________");
		System.out.println("_____________|____________________________");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("          o                               ");
		System.out.println("          T  _____________________________");
		System.out.println("_____________|____________________________");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(" =========================================");
		
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("               o                          ");
		System.out.println("            ___T__________________________");
		System.out.println("_____________|____________________________");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                    o                     ");
		System.out.println("            ________T_____________________");
		System.out.println("_____________|____________________________");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(" ========================================= ");
		
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                  <stop>  ");
		System.out.println("                                          ");
		System.out.println("                         o                ");
		System.out.println("            _____________T________________");
		System.out.println("_____________|____________________________");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(" ========================================= ");
		
		space(1000);
	}
	
	public static void Animation_Old_House () {
		
space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                    ");
		System.out.println("                                          ");
		System.out.println("                              o                ");
		System.out.println("            __________________T___________");
		System.out.println("_____________|____________________________");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(" ========================================= ");
		
space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                    ");
		System.out.println("                                          ");
		System.out.println("                                   o                ");
		System.out.println("            _______________________T______");
		System.out.println("_____________|____________________________");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(" ========================================= ");
		
space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                    ");
		System.out.println("                                          ");
		System.out.println("                                        o                ");
		System.out.println("            ____________________________T_");
		System.out.println("_____________|____________________________");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("                                          ");
		System.out.println("  ~     ~       ________       ~                             ");
		System.out.println("               /        |        _________                     ");
		System.out.println("o       ~      |        |       /         |    ~      ");
		System.out.println("T__  ~         |        |       |         |     ~       ");
		System.out.println("  |____________|________|_______|_________|_____________");
		System.out.println("                                          ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("                                          ");
		System.out.println("       ~    ~    ________       ~            ~                 ");
		System.out.println("               /        |        _________                     ");
		System.out.println("  o     ~      |        |       /         |    ~       ");
		System.out.println("__T       ~    |        |       |         |      ~      ");
		System.out.println("__n____________|________|_______|_________|_____________");
		System.out.println("                                          ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("                                                         ");
		System.out.println("     ~      ~   ________                   ~             ");
		System.out.println("               /        |        _________           ~    ");
		System.out.println("    o     ~    |        |       /         |     ~         ");
		System.out.println("___ T     ~    |        |       |         |          ~    ");
		System.out.println("__|_n__________|________|_______|_________|_____________ ");
		System.out.println("                                                         ");
		System.out.println(" ======================================================= ");
		
		space(1000);
	}
	
	public static void Animation_Choice() {
		
space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("                                                         ");
		System.out.println("    ~       ~   ________      ~          ~        ~        ");
		System.out.println("               /        |        _________               ");
		System.out.println("    o   ~      |        |  ~    /         |     ~         ");
		System.out.println("___ T      ~   |        |       |         |          ~    ");
		System.out.println("__|_n__________|________|_______|_________|_____________ ");
		System.out.println("                                                         ");
		System.out.println(" ======================================================= ");
		
space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("                                                         ");
		System.out.println("   ~      ~     ________     ~         ~       ~        ");
		System.out.println("               /        |        _________               ");
		System.out.println("    o  ~       |        | ~     /         |    ~         ");
		System.out.println("___ T     ~    |        |       |         |         ~    ");
		System.out.println("__|_n__________|________|_______|_________|_____________ ");
		System.out.println("                                                         ");
		System.out.println(" ======================================================= ");
		
space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("                                                         ");
		System.out.println("  ~     ~       ________    ~        ~      ~        ");
		System.out.println("               /        |        _________               ");
		System.out.println("    o ~        |        |~      /         |   ~         ");
		System.out.println("___ T    ~     |        |       |         |       ~    ");
		System.out.println("__|_n__________|________|_______|_________|_____________ ");
		System.out.println("                                                         ");
		System.out.println(" ======================================================= ");
	}
	
	public static void Animation_Enter_House () {
		
		space(1000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("      o         __|                          |         ");
		System.out.println("      T         | |                   __*__  |    ");
		System.out.println("      n         | |                   |   |  | ");
		System.out.println(" =======================================================");
		
		space(1000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("           o    __|                          |         ");
		System.out.println("           T    | |                   __*__  |    ");
		System.out.println("           n    | |                   |   |  | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|   o                      |         ");
		System.out.println("                | |   T               __*__  |    ");
		System.out.println("                | |   n               |   |  | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|         o                |         ");
		System.out.println("                | |         T         __*__  |    ");
		System.out.println("                | |         n         |   |  | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|            o             |           ");
		System.out.println("                | |            T      __*__  |          ");
		System.out.println("                | |            n      |   |  |           ");
		System.out.println(" =======================================================");
		
		space(1000);
	}
	
	public static void Animation_Death () {
		
space(500);
		
		System.out.println(" ========================================= ");
		System.out.println(" ");
		System.out.println("                                          ");
		System.out.println("                     o                ");
		System.out.println("                     T");
		System.out.println("                     n");
		System.out.println("");
		System.out.println(" ========================================= ");
		
space(500);
		
		System.out.println(" ========================================= ");
	
		System.out.println("                                          ");
		System.out.println("                     o                ");
		System.out.println("                     T");
		System.out.println("                     n");
		
		System.out.println(" ========================================= ");
		
space(500);
		
		System.out.println(" ========================================= ");
		
		System.out.println("                     o                ");
		System.out.println("                     T");
		
		System.out.println(" ========================================= ");
		
space(500);
		
		System.out.println(" ========================================= ");
		System.out.println(" ========================================= ");
		
space(500);
		
		System.out.println(" ========================================= ");
		System.out.println("           Y O U         D I E D             ");
		System.out.println(" ========================================= ");
	}
	
	public static void Animation_First_Pick_Up() {
		

        space(2000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|            o             |           ");
		System.out.println("                | |            T      __*__  |          ");
		System.out.println("                | |            n      |   |  |           ");
		System.out.println(" =======================================================");
		
		space(2000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|                o         |           ");
		System.out.println("                | |                T  __*__  |          ");
		System.out.println("                | |                n  |   |  |           ");
		System.out.println(" =======================================================");
		
		space(2000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|                o         |           ");
		System.out.println("                | |               *T  _____  |          ");
		System.out.println("                | |                n  |   |  |           ");
		System.out.println(" =======================================================");
		
		space(2000);
	}
	
	public static void Animation_Leave_House() {
		
space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|            o             |           ");
		System.out.println("                | |            T      __*__  |          ");
		System.out.println("                | |            n      |   |  |           ");
		System.out.println(" =======================================================");
		
		
	space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|         o                |         ");
		System.out.println("                | |         T         __*__  |    ");
		System.out.println("                | |         n         |   |  | ");
		System.out.println(" =======================================================");
		
space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("                __|   o                      |         ");
		System.out.println("                | |   T               __*__  |    ");
		System.out.println("                | |   n               |   |  | ");
		System.out.println(" =======================================================");
		
	space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("    *Coward*      /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("           o    __|                          |         ");
		System.out.println("           T    | |                   __*__  |    ");
		System.out.println("           n    | |                   |   |  | ");
		System.out.println(" =======================================================");
		
		space(2000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |      [***    ]           |             ");
		System.out.println("      o         __|                          |         ");
		System.out.println("      T         | |                   __*__  |    ");
		System.out.println("      n         | |                   |   |  | ");
		System.out.println(" =======================================================");
		
		space(2000);
	}
	
	public static void Animation_Enter_Cottage() {
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |   [***    ]  [***    ]   |             ");
		System.out.println("      o         __|                          |         ");
		System.out.println("      T         | |                          |    ");
		System.out.println("      n         | |                          | ");
		System.out.println(" =======================================================");
		
space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |   [***    ]  [***    ]   |             ");
		System.out.println("          o     __|                          |         ");
		System.out.println("          T     | |                          |    ");
		System.out.println("          n     | |                          | ");
		System.out.println(" =======================================================");
		
space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |   [***    ]  [***    ]   |             ");
		System.out.println("                __|   o                      |         ");
		System.out.println("                | |   T                      |    ");
		System.out.println("                | |   n                      | ");
		System.out.println(" =======================================================");
		
space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                   ___________________________                       ");
		System.out.println("                  /                          |          ");
		System.out.println("                  |   [***    ]  [***    ]   |             ");
		System.out.println("                __|  		 o            |         ");
		System.out.println("                | |   		 T            |    ");
		System.out.println("                | |   		 n            | ");
		System.out.println(" =======================================================");
		
space(1000);
		
	

	}
	
	public static void Animation_Enclosed_Room () {
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |          o               |         ");
		System.out.println("    |          T               |    ");
		System.out.println("    |          n               | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |                o         |         ");
		System.out.println("    |                T         |    ");
		System.out.println("    |                n         | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |          o               |         ");
		System.out.println("    |          T               |    ");
		System.out.println("    |          n               | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
	
		space(1000);
	}
	
	public static void Anmation_Speak () {
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("   You have trespassed my domain and stole what is mine" );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o            0       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                 you shall not leave this place!!!     " );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o           __       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o            0       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(400);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o           __       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o            0       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o           __       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o            0       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o           __       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");

		space(1000);
	}
	
public static void Anmation_Speak2 () {
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("   Since I am merciful I shall give you a chance        " );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o            0       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                 to fix your mistakes       " );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o           __       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o            0       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                 Answer this, mortal…     " );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o           __       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                 I am worn, yet not clothes.     " );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o            0       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                 I protect, yet can curse     " );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o           __       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                 I am small, yet powerful     " );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o            0       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(4000);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("                          What am I?     " );
		System.out.println("     ___________________________                       ");
		System.out.println("    /               _     _    |          ");
		System.out.println("    |               o     o    |             ");
		System.out.println("    |     o           __       |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");

		space(1000);
		
}
	
	public static void Animation_Good_EndingP1 () {
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("");
		System.out.println("     ___________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                    |    ");
			System.out.println(" =======================================================");
			
			space(500);
			
			System.out.println(" ======================================================= ");
			
			System.out.println("    |                          |             ");
			System.out.println("    |     o                    |         ");
	
				System.out.println(" =======================================================");
		
				
				space(500);
				
				System.out.println(" ======================================================= ");
				
				
		
					System.out.println(" =======================================================");
		
					space(500);
		
		System.out.println(" =======");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                        ");
		System.out.println("      ");
		System.out.println("_______");
		System.out.println("                                          ");
		System.out.println(" ======");
		
		space(500);
		
		System.out.println(" =========");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                              ");
		System.out.println("           ");
		System.out.println("___________");
		System.out.println("                                          ");
		System.out.println(" ========== ");
		
		space(500);
		
		System.out.println(" =================");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                                        ");
		System.out.println("            ______");
		System.out.println("_____________|____");
		System.out.println("                                          ");
		System.out.println(" =================");
		
		space(500);
		
		System.out.println(" =========================== ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                         o                                      ");
		System.out.println("            _____________T__");
		System.out.println("_____________|______________");
		System.out.println("                                          ");
		System.out.println(" ===========================");
		
		space(500);
		
		System.out.println(" ================================== ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                         o                                      ");
		System.out.println("            _____________T_________");
		System.out.println("_____________|_____________________");
		System.out.println("                                          ");
		System.out.println(" ================================== ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                          ");
		System.out.println("                                          ");
		System.out.println("                         o                                      ");
		System.out.println("            _____________T________________");
		System.out.println("_____________|____________________________");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(2000);
	}
	
	public static void Animation_Good_EndingP2 () {
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("  o                               ");
		System.out.println("--___                            ");
		System.out.println("__mmmmo<                                   ");
		System.out.println("      (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("       o                               ");
		System.out.println("     --___                            ");
		System.out.println(" ___j__mmmmo<                                   ");
		System.out.println("o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("            o                               ");
		System.out.println("          --___                            ");
		System.out.println("      ___j__mmmmo<                                   ");
		System.out.println("     o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		

		
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                o                               ");
		System.out.println("              --___                            ");
		System.out.println("          ___j__mmmmo<                                   ");
		System.out.println("         o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                    o                               ");
		System.out.println("                  --___                            ");
		System.out.println("              ___j__mmmmo<                                   ");
		System.out.println("             o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                       o                               ");
		System.out.println("                      --___                            ");
		System.out.println("                   __j__mmmmo<                                   ");
		System.out.println("                 o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                            o                               ");
		System.out.println("                           --___                            ");
		System.out.println("                        __j__mmmmo<                                   ");
		System.out.println("                      o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                        o ");
		System.out.println("                                     --___");
		System.out.println("                                 __j__mmmm");
		System.out.println("                                 o)       ");
		System.out.println("----------------------------------------- ");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                        ");
		System.out.println("                                     ");
		System.out.println("                                     __j__");
		System.out.println("                                    o)    ");
		System.out.println("----------------------------------------- ");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("  o                               ");
		System.out.println("--___                            ");
		System.out.println("__mmmmo<                                   ");
		System.out.println("      (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("       o                               ");
		System.out.println("     --___                            ");
		System.out.println(" ___j__mmmmo<                                   ");
		System.out.println("o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("            o                               ");
		System.out.println("          --___                            ");
		System.out.println("      ___j__mmmmo<                                   ");
		System.out.println("     o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		

		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                o                               ");
		System.out.println("              --___                            ");
		System.out.println("          ___j__mmmmo<                                   ");
		System.out.println("         o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                    o                               ");
		System.out.println("                  --___                            ");
		System.out.println("              ___j__mmmmo<                                   ");
		System.out.println("             o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                       o                               ");
		System.out.println("                      --___                            ");
		System.out.println("                   __j__mmmmo<                                   ");
		System.out.println("                 o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		
		System.out.println(" ======================================== ");
		System.out.println("                            o                               ");
		System.out.println("                           --___                            ");
		System.out.println("                        __j__mmmmo<                                   ");
		System.out.println("                      o)       (o                                      ");
		System.out.println("-----------------------------------------");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                        o ");
		System.out.println("                                     --___");
		System.out.println("                                 __j__mmmm");
		System.out.println("                                 o)       ");
		System.out.println("----------------------------------------- ");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(500);
		
		System.out.println(" ======================================== ");
		System.out.println("                                        ");
		System.out.println("                                     ");
		System.out.println("                                     __j__");
		System.out.println("                                    o)    ");
		System.out.println("----------------------------------------- ");
		System.out.println("                                          ");
		System.out.println(" ========================================= ");
		
		space(5000);
		
	}
	
	
	public static void Animation_Bad_Ending_PRoute () {
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("      ___________________________                       ");
		System.out.println("     /                          |          ");
		System.out.println("     |                          |             ");
		System.out.println("     |     o                    |         ");
		System.out.println("     |     T                    |    ");
		System.out.println("     |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("     _______________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                       |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                   |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("      __________________________                       ");
		System.out.println("     /                       |          ");
		System.out.println("     |                          |             ");
		System.out.println("     |     o                  |         ");
		System.out.println("       |   T                    |    ");
		System.out.println("     |     n                   | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("     ________________________                       ");
		System.out.println("    /                        |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                   |         ");
		System.out.println("      |   T                 |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("      ___________________________                       ");
		System.out.println("     /                          |          ");
		System.out.println("     |                          |             ");
		System.out.println("     |     o                    |         ");
		System.out.println("     |     T                    |    ");
		System.out.println("     |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("     ___________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("     ________________________                       ");
		System.out.println("    /                       |          ");
		System.out.println("    |                          |             ");
		System.out.println("      |   o                |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("      |   n                  | ");
		System.out.println(" =======================================================");
		
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("      ___________________________                       ");
		System.out.println("     /                          |          ");
		System.out.println("     |                          |             ");
		System.out.println("     |     o                    |         ");
		System.out.println("     |     T                    |    ");
		System.out.println("     |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("     ___________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("      ________________________                       ");
		System.out.println("     /                          |          ");
		System.out.println("     |                        |             ");
		System.out.println("     |     o                    |         ");
		System.out.println("     |     T                   |    ");
		System.out.println("     |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("     ________________________                       ");
		System.out.println("    /                          |          ");
		System.out.println("    |                        |             ");
		System.out.println("      |   o                    |         ");
		System.out.println("    |     T                 |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("      _________________________                       ");
		System.out.println("     /                          |          ");
		System.out.println("       |                      |             ");
		System.out.println("     |     o                    |         ");
		System.out.println("     |     T                  |    ");
		System.out.println("     |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("     _________________________                       ");
		System.out.println("    /                        |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                   |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("     _________________________                       ");
		System.out.println("    /                        |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                    |    ");
		System.out.println("    |     n                    | ");
		System.out.println(" =======================================================");
		
		space(500);
		
		System.out.println(" ======================================================= ");
		System.out.println("    /                          |          ");
		System.out.println("    |                          |             ");
		System.out.println("    |     o                    |         ");
		System.out.println("    |     T                    |    ");
			System.out.println(" =======================================================");
			
			space(500);
			
			System.out.println(" ======================================================= ");
			
			System.out.println("    |                          |             ");
			System.out.println("    |     o                    |         ");
	
				System.out.println(" =======================================================");
		
				
				space(500);
				
				System.out.println(" ======================================================= ");
				
				
		
					System.out.println(" =======================================================");
	}
	
	public static void Animation_Thanks () {
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("");
		System.out.println(      "          Charlestan D. Arroyo          ");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("");
		System.out.println(      "          Charlestan D. Arroyo          ");
		System.out.println("");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("");
		System.out.println(      "          Charlestan D. Arroyo          ");
		System.out.println("");
		System.out.println(      "       Ralph Rexiel R. Lubuguin          ");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("");
		System.out.println(      "          Charlestan D. Arroyo          ");
		System.out.println("");
		System.out.println(      "       Ralph Rexiel R. Lubuguin          ");
		System.out.println("");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("");
		System.out.println(      "          Charlestan D. Arroyo          ");
		System.out.println("");
		System.out.println(      "       Ralph Rexiel R. Lubuguin          ");
		System.out.println("");
		System.out.println(      "         Sean Fraser I. Castro          ");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("");
		System.out.println(      "          Charlestan D. Arroyo          ");
		System.out.println("");
		System.out.println(      "       Ralph Rexiel R. Lubuguin          ");
		System.out.println("");
		System.out.println(      "         Sean Fraser I. Castro          ");
		System.out.println("");
		System.out.println("\n\n ========================================= \n");
		
		space(500);
		System.out.println("\n\n ========================================= \n");
		System.out.println("  ");
		System.out.println(    "    *****        DEVELOPERS:     *****    ");
		System.out.println("  ");
		System.out.println("\n\n ========================================= \n");
		System.out.println("\n\n ========================================= \n");
		System.out.println("");
		System.out.println(      "          Kelsen Gile S. Conel          ");
		System.out.println("");
		System.out.println(      "          Charlestan D. Arroyo          ");
		System.out.println("");
		System.out.println(      "       Ralph Rexiel R. Lubuguin          ");
		System.out.println("");
		System.out.println(      "         Sean Fraser I. Castro          ");
		System.out.println("");
		System.out.println(      "         Xavier Kent C. Ortega          ");
		System.out.println("\n\n ========================================= \n");
		
		space(5000);
		System.out.println(" ========================================= ");
		System.out.println("");
		String sentence1 = 
				  
				          "\n   T H A N K S   F O R   P L A Y I N G           ";
		
		for (int i = 0; i < sentence1.length(); i++) {
	        System.out.print(sentence1.charAt(i));
	        try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        
	    }
		
		System.out.println("");
		System.out.println("\n\n ========================================= \n");
		space(5000);
		
		
		
	}
	
	
}
