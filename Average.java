/*
Average.java
C Sullivan
28 03 2017
*/

//Create an application that asks the user for 5 numbers and gets the average of those numbers.


import javax.swing.*;
public class Average{
	public static void main(String args[]){

		int arr []; //Declaring an array
		arr=new int[5]; //Creating an array to store 5 numbers
		int sum=0;
		int average=0;

		//Input
			for(int i=0; i<5; i++){ //Creating a loop to run 5 times
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 5 numbers."));
		}

		//Compute
		for(int i=0;i<arr.length;i++){ //Length of the array


	sum=sum+arr[i]; //Working out the total of the numbers
	//i.e. sum=0 + first value and then it goes back into the loop again
	//i.e. sum=1 + second value and hen it goes back into the loop again...etc..

}
	//Work out the average
	average=sum/5;

	//Output
	JOptionPane.showMessageDialog(null, "The average is "+average);

}
}