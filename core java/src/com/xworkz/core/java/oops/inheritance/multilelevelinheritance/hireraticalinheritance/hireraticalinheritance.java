package com.xworkz.core.java.oops.inheritance.multilelevelinheritance.hireraticalinheritance;

public class hireraticalinheritance {
public static void main (String[] args) {
	engineering engineering =new engineering();
	computerscienceengineering computerscienceengineering =new computerscienceengineering ();
	civilengineering civilengineering =new civilengineering ();
	mechanicalengineering mechanicalengineering=new mechanicalengineering();
	
	computerscienceengineering.branchname="CSE";
	computerscienceengineering.university="VTU";
	civilengineering.branchname="CV";
	civilengineering.university="VTU";
   mechanicalengineering.branchname="MECH";
   mechanicalengineering.university=" VTU " ;
  
System.out.println ("detils of engineering branches");
System.out.println("cse branch name;"+ computerscienceengineering .branchname);
System.out.println("university;"+ computerscienceengineering.university);
System.out.println("function");
computerscienceengineering.developsoftware();


System.out.println ("detils of engineering branches");
System.out.println("CV branch name;"+ civilengineering .branchname);
System.out.println("university;"+ civilengineering.university);
System.out.println("function");
civilengineering.construction();


System.out.println ("detils of engineering branches");
System.out.println("mech branch name;"+ computerscienceengineering .branchname);
System.out.println("university;"+ mechanicalengineering.university);
System.out.println("function");
mechanicalengineering.assemblemechincs();









}
}

   
   
