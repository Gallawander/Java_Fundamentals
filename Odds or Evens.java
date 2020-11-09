public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String c = "Y";
		
		//Basic introduction into the game and setting a name of a player
		System.out.println("Hello, let´s play a game called Odds or Evens");
		System.out.println();
		System.out.println("You will be playing against computer and the rules are following:");
		System.out.println("At first, you need to pick ODDS or EVENS! \nThen, imagine that you play with one hand and choose the number of fingers you will play with.");
		System.out.println("The computer also picks a number of fingers. \nIf you have chosen odds before and the sum of fingers is odd, you win. Otherwise computer wins and vice versa.");
		
		for (int i = 0; i < 150; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Now, let´s play!");
		System.out.print("How should I call you? ");
		

		String name = sc.nextLine();
		
		do {
		System.out.println();
		System.out.print("Hi " + name + " please choose (O)dds or (E)vens! ");
	
		//User choice of ODDS or EVENS
		String choice = sc.nextLine();
		
		while ((!choice.equalsIgnoreCase("o")) && (!choice.equalsIgnoreCase("e"))) {
			System.out.println("Wrong input! Try again!");
			choice = sc.nextLine();
			}
		
		if (choice.equalsIgnoreCase("o")) {
			System.out.println("You have chosen ODDS, computer will be EVENS.");
		}
		
		else {
			System.out.println("You have chosen EVENS, computer will be ODDS.");
		}	
		
		for(int i = 0; i < 150; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println();
	
		//Game procedure
		Random rand = new Random();
		
		System.out.print("How many “fingers” do you put out? ");
		int userFingers = Integer.parseInt(sc.nextLine());
		int computerFingers = rand.nextInt(6);
		
		System.out.println("You play with " + userFingers + " finger(s).");
		
		System.out.println();
		System.out.println("Computer will play with "+ computerFingers + " finger(s)");
		
		for (int i = 0; i < 150; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		System.out.println();
		
		int sum = userFingers + computerFingers;
		System.out.println(userFingers + " + " + computerFingers + " = " + sum);
		
		int result = sum % 2;
		
		if (result == 1) {
			System.out.println(sum + " is ....ODD!");
		} else {
			System.out.println(sum + " is ....EVEN!");
		}
		
		//Result
		if ((choice.equalsIgnoreCase("o")) && (result == 1)) {
			System.out.println(name + " wins!");
		} else if ((choice.equalsIgnoreCase("e")) && (result == 0)) {
			System.out.println(name + " wins!");
		} else {
			System.out.println("Computer wins!");
		}
		
		for (int i = 0; i < 150; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Do you want to continue? [Y/N] ");
		c = sc.nextLine();
		
		if ((!c.equalsIgnoreCase("n")) && (!c.equalsIgnoreCase("y"))) {
			System.out.println();
			System.out.println("Wrong answer, please try again!");
			c = sc.nextLine();
		}
		
		} while (c.equalsIgnoreCase("y"));
		
		System.out.println();
		System.out.println("Thank you for a great game!");
	}