package Day5;

import java.io.*;
import java.util.*;

public class Student0
{
	private ArrayList<String> names=new ArrayList<String>();

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public void setNames(int num) throws IOException
	{
		for(int i=0;i<num;i++)
		{
			System.out.print("Enter Student Name: ");
			names.add(br.readLine());
		}
	}
	
	public void searchName(String stuName)
	{
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals(stuName))
			{
				System.out.println("The student name exists in the list");
				break;
			}	
		}
	}
	
	public void searchName(int index)
	{
		if(names.get(index-1)!=null)
		{
			System.out.println("The student name "+names.get(index-1)+" exists in the list");
		}
	}
	
	public void printNames()
	{
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println("Student Name:"+itr.next());
		}
	}
	
	public void removeName(String stuName)
	{
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals(stuName))
			{
				System.out.println("The name is removed from the list");
				itr.remove();
				break;
			}	
		}
	}
}
