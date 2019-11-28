/*
* Stat.java
* Author: Aditya Deokar
* Submission Date: 11/17/17
*
* Purpose: Creates an array of data for the user to store and make calculations of
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on a programming project created by the Department of
* Computer Science at the University of Georgia. Any publishing
* of source code for this project is strictly prohibited without
* written consent from the Department of Computer Science.
*/
public class Stat
{
	private double [] data;
	
	// Default Constructor that creates empty array
	public Stat ()
	{
		double [] array = new double [0];
		data = array;
	}
	
	// Overloaded Constructor
	public Stat (double [] d)
	{
		
		if (d == null)
		{
			data = new double [0];
		}
		else 
		{
			double [] array = new double [d.length];
			
			for (int i = 0; i < d.length; i++)
			{
				array [i] = d [i];
			}
			
			data = array;
		}
	}
	
	// Stat constructor with int parameter
	public Stat (int [] i)
	{
		
		if (i == null)
		{
			data = new double [0];
		}
		else 
		{
			double [] array = new double [i.length];
			
			for (int j = 0; j < i.length; j++)
			{
				array [j] = i [j];
			}
			
			data = array;
		}
	}
	
	// stat constructor with long parameter
	public Stat (long [] lo)
	{
		
		if (lo == null)
		{
			data = new double [0];
		}
		else 
		{
			double [] array = new double [lo.length];
			
			for (int i = 0; i < lo.length; i++)
			{
				array [i] = lo [i];
			}
			
			data = array;
		}
	}
	
	// Stat constructor with float parameter
	public Stat (float [] f)
	{
		
		if (f == null)
		{
			data = new double [0];
		}
		else 
		{
			double [] array = new double [f.length];
			
			for (int i = 0; i < f.length; i++)
			{
				array [i] = f [i];
			}
			
			data = array;
		}
	}
	
	// returns array with data
	public double [] getData()
	{
		double [] array = new double [data.length];
		
		for (int i = 0; i < data.length; i++)
		{
			array [i] = data [i];
		}	
		
		return array;
	}
	
	//sets data array to array inputted
	public void setData (double [] d)
	{
		if (d != null)
		{
			double [] array = new double [d.length];
			
			for (int i = 0; i < d.length; i++)
			{
				array [i] = d [i];
			}	
			
			data = array;
		}
		
		else
		{
			data = new double [0];
		}
	}
	
	// setter for data with int paramter
	public void setData (int [] i)
	{
		if (i != null)
		{
			double [] array = new double [i.length];
			
			for (int j = 0; j < i.length; j++)
			{
				array [j] = i [j];
			}	
			
			data = array;
		}
		
		else
		{
			data = new double [0];
		}
	}
	
	// setter for data with long parameter
	public void setData (long [] lo)
	{
		if (lo != null)
		{
			double [] array = new double [lo.length];
			
			for (int i = 0; i < lo.length; i++)
			{
				array [i] = lo [i];
			}	
			
			data = array;
		}
		
		else
		{
			data = new double [0];
		}
	}
	
	// setter for data with float parameter
	public void setData (float [] f)
	{
		if (f != null)
		{
			double [] array = new double [f.length];
			
			for (int i = 0; i < f.length; i++)
			{
				array [i] = f [i];
			}	
			
			data = array;
		}
		
		else
		{
			data = new double [0];
		}
	}
	
	// resets the data array
	public void reset()
	{
		double [] array = new double [0];
		data = array;
	}
	
	// joins 2 arrays
	public void append (double [] d)
	{
		if (d == null)
		{
			
		}
		
		else
		{
			double [] array = new double [this.data.length + d.length];
			for (int i = 0; i < this.data.length; i++)			
			{
				array [i] = this.data [i];
			}
			
			for (int i = this.data.length; i < this.data.length + d.length; i++)
			{
				array [i] = d [i - this.data.length];
			}
			
			data = array;
		}
		
	}
	
	//joins 2 arrays
	public void append (int [] d)
	{
		if (d == null)
		{
			
		}
		
		else
		{
			double [] array = new double [this.data.length + d.length];
			for (int i = 0; i < this.data.length; i++)			
			{
				array [i] = this.data [i];
			}
			
			for (int i = this.data.length; i < this.data.length + d.length; i++)
			{
				array [i] = d [i - this.data.length];
			}
			
			data = array;
		}
		
	}
	
	//joins 2 arrays
	public void append (long [] d)
	{
		if (d == null)
		{
			
		}
		
		else
		{
			double [] array = new double [this.data.length + d.length];
			for (int i = 0; i < this.data.length; i++)			
			{
				array [i] = this.data [i];
			}
			
			for (int i = this.data.length; i < this.data.length + d.length; i++)
			{
				array [i] = d [i - this.data.length];
			}
			
			data = array;
		}
		
	}
	
	//joins 2 arrays
	public void append (float [] d)
	{
		if (d == null)
		{
			
		}
		
		else
		{
			double [] array = new double [this.data.length + d.length];
			for (int i = 0; i < this.data.length; i++)			
			{
				array [i] = this.data [i];
			}
			
			for (int i = this.data.length; i < this.data.length + d.length; i++)
			{
				array [i] = d [i - this.data.length];
			}
			
			data = array;
		}
		
	}
	
	
	// checks if data variable is empty
	public boolean isEmpty()
	{
		if (this.data.length == 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	// Compares two Stat objects to see if they are equal
	public boolean equals (Stat s)
	{
		if (s != null)
		{
			if (s.data.length == this.data.length)
			{
				for (int i = 0; i < s.data.length; i++)
				{
					if (s.data [i] != this.data[i])
					{
						return false;
					}
				}
				
				return true;
			}
			
			else
			{
				return false;
			}
		}
		
		else
		{
			return false;
		}
	}
	
	// Prints data
	public String toString ()
	{
		String s = "[";
		for (int i = 0; i < this.data.length; i++)
		{
			if (i == 0)
			{
				s = s + this.data[i];
			}
			
			else
			{
			    s = s + ", " + this.data[i];
			}
		}
		
		s = s + "]";
		return s;
	}
	
	// returns the min number in the data
	public double min ()
	{
		if (this.data.length == 0)
		{
			return Double.NaN;
		}
		
		else
		{
			double min = this.data [0];
			for (int i = 0; i < this.data.length; i++)
			{
				if (this.data [i] < min)
				{
					min = this.data [i];
				}
			}
			
			return min;
		}
	}
	
	// returns the max number in the data
	public double max ()
	{
		if (this.data.length == 0)
		{
			return Double.NaN;
		}
		
		else
		{
			double max = this.data [0];
			for (int i = 0; i < this.data.length; i++)
			{
				if (this.data [i] > max)
				{
					max = this.data [i];
				}
			}
			
			return max;
		}
	}
	
	// returns the average of the data
	public double average ()
	{
		if (this.data.length == 0)
		{
			return Double.NaN;
		}
		
		else
		{
			double sum = 0;
			for (int i = 0; i < this.data.length; i++)
			{
				sum = this.data [i] + sum;
			}
			
			return sum / this.data.length;
		}
	}

	// returns the most often of the data
	public double mode()
	{
		int mainCounter = 0;
		int secondaryCounter = 0;
		double num = 0;
		double tempNum = 0;
		if (this.data.length == 0)
		{
			return Double.NaN;
		}
		
		else
		{
			for (int i = 0; i < this.data.length; i++)
			{
				secondaryCounter = 0;
				
				for (int j = 0; j < this.data.length; j++)
				{
					if (this.data [i] == this.data [j])
					{
						secondaryCounter++;
					}
				}
					
				if (secondaryCounter > mainCounter)
				{
					mainCounter = secondaryCounter;
					num = this.data [i];
				}
		    }

		for (int i = 0; i < this.data.length; i++)
		{
			secondaryCounter = 0;
			
			for (int j = 0; j < this.data.length; j++)
			{
				if (this.data [i] == this.data [j])
				{
					secondaryCounter++;
				}
				tempNum = this.data[i];
			}
				if ((int)secondaryCounter == mainCounter && ((int)tempNum != (int)num))
				{
					return Double.NaN;
				}
		}
		
		return num;
		}
	}
	
	// counts number of times value is in the array
	public int occursNumberOfTimes(double value)
	{
		int counter = 0;
		for (int i = 0; i < this.data.length; i++)
		{
			if (this.data [i] == value)
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	// counts number of times value is in the array
	public double variance()
	{
		if (this.data.length == 0)
		{
			return Double.NaN;
		}
		
		else
		{
			double sum = 0.0;
			for (int i = 0; i < this.data.length; i++)
			{
				sum = sum + Math.pow((this.data [i] - this.average()), 2);
			}
			
			return sum/this.data.length;
		}
	}
	
	// calculates standard deviation of an array
	public double standardDeviation()
	{
		if (this.data.length == 0)
		{
			return Double.NaN;
		}
		
		else
		{
			return Math.sqrt(this.variance());
		}
	}
	
	
	public static void main (String [] args)
	{
		
	}
}