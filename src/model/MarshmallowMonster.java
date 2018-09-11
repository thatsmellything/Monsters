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
	
	
	
	public String toString()
	//super simple for printing/compiling
	{
		String description = "My Monsters name is " + name + " he " +legCount + " legs and "
				+ armCount + " arms. He is very scary, he uses windows";
		return description;
	}
}
