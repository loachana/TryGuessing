public class TryGuessing {
	public static void main(String[] args){
		//guessed values
		generator p1 = new generator();
		generator p2 = new generator();
	 	generator p3 = new generator();
		
		//target number
		generator target = new generator();
		
		
		//player selection at a success
		boolean p1b = false;
		boolean p2b = false;
		boolean p3b = false;
		
		//round
		int count = 1;
	
		while(true) {
			
			System.out.println("round: " + count);
			count += 1;
		
			//declarations
			int targetNum = target.generate();
			int p1G = target.generate();
			int p2G = target.generate();
			int p3G = target.generate();
			
			//to the screen
			System.out.println("I am thinking of a number between 0-99");
			
			System.out.println("And it is " + targetNum);
			
			System.out.println("---------------------------------");
			
			System.out.println("player 1 guess: " + p1G);
			System.out.println("player 2 guess: " + p2G);
			System.out.println("player 3 guess: " + p3G);
			
			System.out.println("---------------------------------");
			
			if (targetNum == p1G){
				p1b = true;
			}
			if (targetNum == p2G) {
				p2b = true;
			}
			if (targetNum == p3G) {
				p3b = true;
			}
			if (p1b || p2b || p3b){
				System.out.println("player 1 is: " + p1b);
				System.out.println("player 2 is: " + p2b);
				System.out.println("player 3 is: " + p3b);
				System.out.println("we have a winner");
				break;
			}
			
		} 
		
	}
}

class generator {
	int number;
	
	int generate(){
		number = (int) (100 * Math.random());
		return number;
	}
}
