import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	String continueChoice;
	do {
		Movie movie = new Movie();
		System.out.println("Enter the name of the movie: ");
		String title = keyboard.nextLine();
		movie.setTitle(title);
		
		System.out.println("Enter the movie's rating: ");
		String rating = keyboard.nextLine();
		movie.setRating(rating);
		System.out.println("Enter the number of tickets sold:");
		int tickets = keyboard.nextInt();
		movie.setSoldTickets(tickets);
		keyboard.nextLine();
		
		System.out.println(movie.toString());
		
		System.out.println("Do you want to enter another? (y or n)");
		
		continueChoice = keyboard.nextLine();
	
		
	} while (continueChoice.equalsIgnoreCase("y"));
	System.out.println("GoodBye");
	keyboard.close();

}
}
