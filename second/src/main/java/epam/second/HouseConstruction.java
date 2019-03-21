package epam.second;

 class House
{
	private int materialStandard;
	private int totalArea;
	private boolean automated;
	House(int standard,int totalArea,boolean automated)
	{
		this.materialStandard=standard;
		this.totalArea=totalArea;
		this.automated=automated;
	}
	
	int getStandard()
	{
		return materialStandard;
	}
	int getTotalArea()
	{
		return totalArea;
	}
	boolean isAutomated()
	{
		return automated;
	}
	
}

public class HouseConstruction {

	//1:standard
	//2:above standard
	//3:high standard
	private House newHouse;
	private int costPerSquareFeet;
	private int totalCost;
	HouseConstruction(int standard,int totalArea,boolean automated)
	{
		costPerSquareFeet=0;
		newHouse=new House(standard,totalArea,automated);
	}
	void setCostPerSquareFeet()
	{
		switch(newHouse.getStandard())
		{
			case 1:
				costPerSquareFeet=1200;
				break;
			case 2:
				costPerSquareFeet=1500;
				break;
			case 3:
				if(newHouse.isAutomated())
				{
					costPerSquareFeet=2500;
				}
				else
				{
					costPerSquareFeet=1800;
				}
				break;
			default:
				costPerSquareFeet=1200;
		}
	}
	
	int getCostPerSquareFeet()
	{
		return costPerSquareFeet;
	}
	
	int getTotalCost()
	{
		totalCost=costPerSquareFeet*newHouse.getTotalArea();
		return totalCost;
	}
}
