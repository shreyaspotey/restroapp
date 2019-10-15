package com.restro.admin;

import com.restro.bean.Menu;

public class Admin {
	
	public static String MainCourse[]={"Roti","Sabji","Daal","Rice","Salad","--Back menu--"};
	public static String Starter[]={"Papad","Soup","--Back menu--"};
	public static String Dessert[]={"iceCream","--Back menu--"};
	
	public Admin()
	{
		
		Menu m=new Menu(MainCourse, Starter, Dessert);
	}
	
}
