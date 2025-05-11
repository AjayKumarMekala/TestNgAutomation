package TestNGrelated;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidermethod 
{
	
	@Test(dataProvider="ajay2")
	public void ajay(String i)
	{
		//System.out.println(i[0]+"  "+i[1]);
		//indices concept
		System.out.println(i);
	}
//	  @DataProvider(name="logindataHrm")
//	   public String[][] logindata()
//	   {
//		   String[][] data=new String[5][2];
//		   
//		   data[0][0]="Admin";
//		   data[0][1]="admin123";
//		   
//		   data[1][0]="Admin";
//		   data[1][1]="Admin23";
//		   
//		   data[2][0]="adMin";
//		   data[2][1]="admin123";
//		   
//		   data[3][0]=" ";
//		   data[3][1]="Admin23";
//		   
//		   data[4][0]="Aadmin";
//		   data[4][1]="Admin23";
//		   return data;
//		   
//	   }
	//Without provider name just we neeed to give method name to test method like dataprovider="ajay1";
	//if you want to use this data provider in another class just give to test method as like dataproviderclass="classname.class
	
//	@DataProvider
//	public String[] ajay1()
//	{
//		String[] I=new String[] {"Ajay","Kumar","Mekala"};
//		return I;
//	}
//	@DataProvider(name="logindataHRM")
//	public String[] ajay1()
//	{
//		String[] I=new String[] {"Ajay","Kumar","Mekala"};
//		return I;
//	}
	//Iterator<object> 
//	@DataProvider
//	public Iterator<String> ajay1()
//	{
//		List<String> Ajay=new ArrayList<String>();
//		Ajay.add("Ajay");
//		Ajay.add("Mekala");
//		return Ajay.iterator();
//	}
	//Iterator<Object[]>
	@DataProvider
	public Iterator<Integer[]> ajay1()
	{
//		List<String[]> Ajay=new ArrayList<String[]>();
//		Ajay.add(new String[] {"ajay","Mekala"});
//		Ajay.add(new String[] {"ajay1","Mekala1"});
//		return Ajay.iterator();
		Set<Integer[]> Ajay=new HashSet<Integer[]>();
		Ajay.add(new Integer[] {1,2});
		Ajay.add(new Integer[] {1,3});
		return Ajay.iterator();
	}
	@DataProvider(indices= {1,3})
	public String[] ajay2()
	{
		String[] str=new String[] {"Ajay","Kumar","Mekala","fggjf"};
		return str;
	}
}