//James Volino
//JobPricing.java
//Date: 2/14/2020

import java.util.Scanner;
public class JobPricing{
	public static void main(String[] args)
	{
		//Variable and Constant;
		int materials;
		int pph = 35;
		int travel = 12;
		String jobName;
		int workHours;
		int travelHours;
		
		//Objects
		Scanner input = new Scanner(System.in);
		
		//inout
		System.out.print("Name of job >> ");
			jobName = input.nextLine();
		System.out.print("Cost of materials >> ");
			materials = input.nextInt();
		System.out.print("How many hours did you work >> ");
			workHours = input.nextInt();
		System.out.print("How many hours did you travel >> ");
			travelHours = input.nextInt();
			
		//output
		System.out.println("You did " + jobName + " for " + workHours + " hours today!");
		System.out.println("Cost of materials was $ " + materials + " and you traveled " + travelHours);
		System.out.println("Youre final pay on the day is $" + (materials + (pph * workHours) 	+ (travelHours * travel)));
	}
}