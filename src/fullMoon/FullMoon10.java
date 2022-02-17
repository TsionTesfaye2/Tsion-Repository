package fullMoon;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.util.GregorianCalendar;
//Tsion Tesfaye
//I have exceeded requirements by after getting user input to determine a full moon occurrence with the Calendar package, I,then, created a timed quiz for the user to guess any full moon occurrences in 2022
//In my design, I allow the user to get information about one full moon for 2022, and with that information, they should have the ability to determine future or past full moons based on a 29-30 day time frame between each full moon

public class FullMoon10 { 
	
	//Initializing an initial score for the user
	static int score=0;
	public static void main(String[] args) {
		
		//creating a scanner object
		Scanner x= new Scanner(System.in);
		System.out.println("Welcome to the Full Moon Game!\n You are given one full moon occurence on the month of your choice,\n and will have to determine future or past full moon occurences based on that hint in the year 2022!");
		
		//give the user a chance to know at least one full moon in the year 2022
		System.out.println("Which month would you like a hint for?");
		String answer = x.nextLine();
		
		//Using the calendar object 
		Calendar c =new GregorianCalendar();

		//using a if, else if statement for the next few blocks in the determination for the next 12 full moons
		
		if (answer.equals("January")){
		
		//Initially setting january's full moon  for the 17th of that month 
		c.set(2022,0,17);
		System.out.println(c.getTime());
		}
	
		else if (answer.equals("February")) {
			//set the time equivalent to the last full moon in January
			c.set(2022, 0,17);
			//next full moon won't occur for another 30 days, so added 30 days from the last full moon until February's
			c.add(Calendar.DATE,30);
			//printing out the day that is 30 days from January's Full Moon using Calendar
			System.out.println(c.getTime());
		}
		
		//the logic I have been using continues by using the last month's full moon, adding 29-30 days from that day to determine each month's full moon until December
		
		else if(answer.equals("March")) {
			c.set(2022,1,16);
			c.add(Calendar.DATE, 30);
			System.out.println(c.getTime());
		}
		else if(answer.equals("April")) {
			c.set(2022, 2,18);
		c.add(Calendar.DATE,29);
		System.out.println(c.getTime());
			}

		else if(answer.equals("May")) {
	c.set(2022,3,16);
	c.add(Calendar.DATE,30);
	System.out.println(c.getTime());
		
}
		else if(answer.equals("June")) {
	c.set(2022,4, 16);
	c.add(Calendar.DATE,29);
	System.out.println(c.getTime());
}
		else if(answer.equals("July")) {
	c.set(2022,5,14);
	c.add(Calendar.DATE,29);
	System.out.println(c.getTime());
}
		else if(answer.equals("August")) {
	c.set(2022,6,13);
	c.add(Calendar.DATE,30);
	System.out.println(c.getTime());
	
}
		else if(answer.equals("September")) {
		c.set(2022, 7,12);
		c.add(Calendar.DATE,29);
		System.out.println(c.getTime());
		}
		
		else if(answer.equals("October")) {
			c.set(2022,8,10);
			c.add(Calendar.DATE,29);
			System.out.println(c.getTime());
			}
		
		else if(answer.equals("November")) {
			c.set(2022,9,9);
			c.add(Calendar.DATE,30);
			System.out.println(c.getTime());
			}
		
		else if(answer.equals("December")) {
			c.set(2022,10,8);
			c.add(Calendar.DATE,29);
			System.out.println(c.getTime());
		
	
		
		}
		
		
		//setting up a timer object
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				//after the 30 seconds have elapsed, this method will run
				//it will print out a message and determine the user's percentage of accuracy
				System.out.println("The game is completed");
				int totalquestions=12;
				//Calculates percentage
				double percentage=(100*score)/totalquestions;
				System.out.println("Your percentage is " + percentage );
				
				System.exit(0);
				
			}
		};
		//giving the user 30 seconds to complete the quiz 
		timer.schedule(task,30000);
		
	
		System.out.println("What is the full moon occurence for Janaury?");
		System.out.println("a.January 3rd");
		System.out.println("b.January 17th");
		System.out.println("c.january 1st");
		System.out.println("d.January 4th");
		
		
	//using if statements to determine if the user's input matches the correct answer
		String response= x.nextLine();
		if (response.equals("b"))
				{
			System.out.println("Correct");
			//adding a point to the variable score if correct
			score++;
			System.out.println(score);
				}
		
		
		System.out.println("What is the full moon occurence for May?");
		System.out.println("a.May 16");
		System.out.println("b.May 2");
		System.out.println("c.May 9");
		System.out.println("d.May 14");
		
		
		
		response=x.nextLine();
		if (response.equals("a"))
		{
	System.out.println("Correct");
	score++;
	System.out.println(score);
		}

		
		
		System.out.println("What is the full moon occurence for March?");
		System.out.println("a.March 18th");
		System.out.println("b.March 19");
		System.out.println("c.March 1st");
		System.out.println("d.March 25th");
		
		response= x.nextLine();
		if (response.equals("a"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		
		System.out.println("What is the full moon occurence for June?");
		System.out.println("a.June 22nd");
		System.out.println("b.June 4th");
		System.out.println("c.June 14th");
		System.out.println("d.June 18th");
		
		response= x.nextLine();
		if (response.equals("c"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		System.out.println("What is the full moon occurence for February?");
		System.out.println("a.February 16th");
		System.out.println("b.February 4th");
		System.out.println("c.February 19th");
		System.out.println("d.February 25th");
		
		response= x.nextLine();
		if (response.equals("a"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		System.out.println("What is the full moon occurence for July?");
		System.out.println("a.July 4th");
		System.out.println("b.July 15th");
		System.out.println("c.July 8th");
		System.out.println("d.July 13th");
		
		response= x.nextLine();
		if (response.equals("d"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		System.out.println("What is the full moon occurence for August?");
		System.out.println("a.August 3rd");
		System.out.println("b.August 9th");
		System.out.println("c.August 12th");
		System.out.println("d.August 13th");
		
		response= x.nextLine();
		if (response.equals("c"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		System.out.println("What is the full moon occurence for October?");
		System.out.println("a.October 9th");
		System.out.println("b.October 1st");
		System.out.println("c.October 20th");
		System.out.println("d.October 29th");
		
		response= x.nextLine();
		if (response.equals("a"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		System.out.println("What is the full moon occurence for December?");
		System.out.println("a.December 19th");
		System.out.println("b.Decemebr 5th");
		System.out.println("c.December 7th");
		System.out.println("d.December 30th");
		
		response= x.nextLine();
		if (response.equals("c"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		System.out.println("What is the full moon occurence for November?");
		System.out.println("a.November 9th");
		System.out.println("b.Novemeber 23rd");
		System.out.println("c.November 12th");
		System.out.println("d.November 8th");
		
		response= x.nextLine();
		if (response.equals("d"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		System.out.println("What is the full moon occurence for April?");
		System.out.println("a.April 4th");
		System.out.println("b.April 16th");
		System.out.println("c.April 17th");
		System.out.println("d.April 28th");
		
		response= x.nextLine();
		if (response.equals("b"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		System.out.println("What is the full moon occurence for September?");
		System.out.println("a.September 7th");
		System.out.println("b.September 22nd");
		System.out.println("c.September 8th");
		System.out.println("d.September 10th");
		
		response= x.nextLine();
		if (response.equals("d"))
				{
			System.out.println("Correct");
			score++;
			System.out.println(score);
				}
		
		
		
	
		
		
		
	//closing the scanner
		x.close();
		
	}
	
	}		
				
		
		
		
		
		
		
		
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	