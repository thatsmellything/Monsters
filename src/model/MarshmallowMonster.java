package model;

public class MarshmallowMonster
{

	//-------Data member section----------
	//Always private
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	
	
	
	
	
	public MarshmallowMonster()
	//constructor matches the class name
	{
		//Default values are 0 and null sad day :(
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
		//assigning the parameter into the data member
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	//Getters
	
	public String getName()
	{
		return name; //return is the automatic end point of the method. Return exits the method no turning back
	}
	
	public double getLegCount() 
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	//Setters
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setlegCount(double legs)
	{
		this.legCount =legs;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount=eyes;
	}
	
	public void setHasNoses(boolean hasNose)
	{
		this.hasNoses = hasNose;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	
	
	public String toString()
	//super simple for printing/compiling
	{
		String description = "My Monsters name is " + name + " he " +legCount + " legs and "
				+ armCount + " arms. He is very scary, he uses windows";

		return description;
	}
	
}

