package week4project;

import java.util.Arrays;

public class Week4CodingProjectRedo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Number 1.
			//this is new array called ages
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			//subtracting the value of the first element in the array from the last element
			int difference = ages[ages.length - 1] - ages[0];
			System.out.println("The difference between the first and last age is: " + difference);
			//new array with 9 elements
			int[] ages2 = new int[9];
			System.out.println("The length of the ages2 array is: " + ages2.length);
			//repeat subtraction
			int difference2 = ages2[ages2.length - 1] - ages2[0];
			System.out.println("The difference between the first and last age is: " + difference2);
			//showing value index is dynamic
			System.out.println("The difference between the first and last age using dynamic values is: " + (ages[ages.length - 1] - ages[0]));
			//Loop for calculating the average age
			int sum = 0;
			for (int age : ages) {
				sum += age;
			}
			double averageAge = sum / ages.length;
			System.out.println("The average age is: " + averageAge);
			
			
			//Number 2
			//this is a new array called names
			String[] names = {"Sam", "Tommy", "Tim", " Sally", "Buck", "Bob"};
			//Loop to calculate the average number of letters per name
			int totalLetters = 0;
			for (String name : names) {
				totalLetters += name.length();
			}
			double averageLetters = totalLetters / names.length;
			System.out.println("The average number of letters per name is: " + averageLetters);
			//Another loop but this time to concatenate the names together
			String allNames = "";
			for (String name : names) {
				allNames += name + " ";
			}
			System.out.println(allNames);
			
			//Number 3
			//You can access the last element of any array by the use of the get(index). For example int last = list.get(list.size() - 1);
			
			//Number 4
			//You can access the first element of any array by the use of the get(index). For example int first = list.get(0);
			
			//Number 5
			
			int[] nameLengths = new int[names.length];
			
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			
			//Number 6
			
			int sumOfNameLengths = 0;
			for (int nameLength : nameLengths) {
				sumOfNameLengths += nameLength;
			}
			System.out.println("The sum of all the name lengths is: " + sumOfNameLengths);
		}
			
				//Number 7 
			public static String concat(String string, int number) {
				return string.concat(string);
			}
		
			//Number 8
			public static String fullName(String firstName, String lastName) {
				return fullName(firstName, lastName);
			}
		
		
				//Number 9
				//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
					public static boolean isSumGreaterThan100(int[] numbers) {
						int sum = 0;
						for (int number : numbers) {
							sum += number;
						}
						return sum > 100; 
					}
					
					//Number 10
						public static double getAverage(double[] numbers) {
							double sum = 0; {
							for (double number : numbers) {
								sum += number;
							}
							return sum / numbers.length; 
						}
			}
					
						//Number 11
						public static boolean isArrayAverageGreater(double[] arr1, double[] arr2) {
						double avg1 = Arrays.stream(arr1).average().orElse(0.0);
						double avg2 = Arrays.stream(arr2).average().orElse(0.0); {
						return avg1 > avg2;
						}
			}
						//Number 12
						public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
							return isHotOutside && moneyInPocket > 10.50;
						}	
						
						//Number 13
						//This method calculates the area of a triangle. It's a simple problem that can be solved with this formula.
						public static double calculateTriangleArea(double base, double height) {
							return 0.5 * base * height;
				
		
						
		
	

	}

}
