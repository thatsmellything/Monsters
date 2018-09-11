package controller;




import model.MarshmallowMonster;
		//This is the same thing as importing the scanner. Controller can cross lanes and go into the other
		//packages but other packages cant go into controller.
public class MonsterController
{
	//--------Data member section---------
	private MarshmallowMonster myMonster;
		//java doesnt know the type aka what it is. NEVER USE AUTOFIX! You must add an import to get the red 
		//ring of death to go away.
	
	//--------Constructor section---------
	public MonsterController()
		//Still same name as class
	{
			//Job 1: initialize data members
		myMonster = new MarshmallowMonster("Boog", 4.0, 3, true, 4);
	}
	//--------Methods section------------
	public void start()
	{
		System.out.println(myMonster);
	
	}
}
