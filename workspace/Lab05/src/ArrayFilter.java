import java.util.ArrayList;

public class ArrayFilter 
{
	private ArrayList<String> stringList = new ArrayList<String>();
	private ArrayList<Integer> integerList = new ArrayList<Integer>();
	private ArrayList<Double> doubleList = new ArrayList<Double>();
	private ArrayList<Boolean> booleanList = new ArrayList<Boolean>();
	
	public void add(Integer x)
	{
		integerList.add(x);
	}
	
	public void add(String x)
	{
		stringList.add(x); 
	}
	
	public void add(Double x)
	{
		doubleList.add(x);
	}
	
	public void add(Boolean x)
	{
		booleanList.add(x);
	}
	
	public int minimumInt()
	{
		int i, min;
		
		if(integerList.size() == 0)
		{
			min = 0;
			return min;
		}
		else
		{	
			min = integerList.get(0);
			for(i = 1; i < integerList.size(); i++)
			{
				if(integerList.get(i) < min)
				{
					min = integerList.get(i);
				}
			}
		}
		return min;
	}
	
	public double averageDouble()
	{
		double average;
		int i, sum = 0;
		
		if(doubleList.size() == 0)
		{
			average = 0;
			return average;
		}
		else
		{
			for(i = 0; i < doubleList.size(); i++)
			{
				sum += doubleList.get(i);
			}
			average = sum/i;
			return average;
		}
	}
	
	public int numberOfTrues()
	{
		int i, numTrues = 0;
		
		if(booleanList.size() == 0)
		{
			return numTrues;
		}
		else
		{
			for(i = 0; i < booleanList.size(); i++)
			{
				if(booleanList.get(i))
				{
					numTrues ++;
				}
			}
		}
		return numTrues;
	}
	
	public int numberOfStrings()
	{
		int numString = 0, i;
				
		if(stringList.size() == 0)
		{
			return numString;
		}
		else
		{
			for(i = 0; i < stringList.size(); i++)
			{
				numString = i;
			}
		}
		return numString;
	}

}
