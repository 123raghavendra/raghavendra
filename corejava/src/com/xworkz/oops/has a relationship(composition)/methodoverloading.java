package com.xworkz.oops.methodoverloading;

public class methodoverloading {
public static void main (String [] args) {
	human human =new human();
	human.Heart=new Heart();
	human.eyecolour="Green";
	human.lang="Kannada";
	human.location="Gadag";
	human.haircolour="Black";
	human.Heart.btimes="72";
	human.Heart.colour="Red";
	human.Heart.pumpblood();
	human.Heart.receiveblood();
	human.dark();
	human.see();
	
	System.out.println("The hair colour is:"+human.haircolour);
	System.out.println("The eye colour is:"+human.eyecolour);
	System.out.println("The speak language is:"+human.lang);
	System.out.println("The location is:"+human.location);
	System.out.println("The heart brats per min is:"+human.Heart.btimes+"pm");
	System.out.println("The colour of heart is:"+human.Heart.colour);
	
	
	
}

}
