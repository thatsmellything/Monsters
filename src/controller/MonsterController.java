package controller;
import java.util.Scanner;
import javax.swing.JOptionPane;


import model.MarshmallowMonster;
		//This is the same thing as importing the scanner. Controller can cross lanes and go into the other
		//packages but other packages cant go into controller.

public class MonsterController
{
	//--------Data member section---------
	private MarshmallowMonster myMonster;
		//java doesnt know the type aka what it is. NEVER USE AUTOFIX! You must add an import to get the red 
		//ring of death to go away.
	private MarshmallowMonster userMonster;
	//--------Constructor section---------
	public MonsterController()
		//Still same name as class
	{
		myMonster = new MarshmallowMonster("Boog", 4.0, 3, true, 4);
		Scanner userThings = new Scanner(System.in);
		//System.out.println("What is the name of your monster");
		String a = JOptionPane.showInputDialog(null,"What is the name of your monster?");
		//String a = userThings.nextLine();
		//System.out.println("How may legs?");
		double b = JOptionPane.showInputDialog(null,"How may legs?");
		//double b = userThings.nextDouble();
		//System.out.println("How many eyes?");
		int c = JOptionPane.showInputDialog(null,"How many eyes?");
		//int c = userThings.nextInt();
		//System.out.println("Does it have a nose?");
		boolean d = JOptionPane.showInputDialog(null,"Does it have a nose?");
		//boolean d = userThings.nextBoolean();
		//System.out.println("How many arms?");
		int e = JOptionPane.showInputDialog(null, "How many arms?");
		//int e = userThings.nextInt();

			//Job 1: initialize data members
		userMonster = new MarshmallowMonster(a , b, c, d, e);
		userThings.close();
			//Make a new instance by calling the constructor
	}
	//--------Methods section------------
	public void start()
	{
		//--------JOptionPane-----
		JOptionPane.showMessageDialog(null, "Show message here :D()");
		//Use this method instead of System.out.println("words");
		JOptionPane.showMessageDialog(null, myMonster);
		// backslash n (\n) breaks the line on the java window
		
		System.out.println(myMonster);
		myMonster.setArmCount(9999);
		
		JOptionPane.showMessageDialog(null, "My Monster has" + myMonster.getArmCount() + " arms!");
		System.out.println("My monster has " + myMonster.getArmCount() + " arms!");
		
		JOptionPane.showMessageDialog(null, userMonster);
		System.out.println(userMonster);
		
		
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type an actual number value!!!");
			
		}
		return isValid;
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid= false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type a double value aka a decimal point boi");
		}
		return isValid;
	}
}
