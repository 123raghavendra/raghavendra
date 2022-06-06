package com.xworkz.oops.methodoverloading;

public class Speakdetails {
	public static void main (String[] args) {
		speak sp=new speak();
		friend friend =new friend();
		unknown unknown=new unknown();
		sp.talk(friend);
		sp.talk(unknown);
	}

}
