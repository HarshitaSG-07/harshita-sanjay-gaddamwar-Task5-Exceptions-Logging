package com.code.ConstructionCost;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ConstructionCost test= new ConstructionCost();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Standard or AboveStandard or HighStandard or FullyAutomated :\n"); 
        String material=sc.nextLine();
        System.out.println("Enter Area :\n");
        double Area = sc.nextDouble();
        System.out.println("Enter Automation value(True or False) :\n");
        boolean automation=sc.nextBoolean()
        System.out.println(test.costForConstructionMaterial(material,Area,automation));
    }
}
