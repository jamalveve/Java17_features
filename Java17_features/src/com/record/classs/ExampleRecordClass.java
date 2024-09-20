package com.record.classs;

// so if want to create a class which contains/holds onnly data(data carrier clas w can say_) we cna go for record
record Aliens(int ids, String names) {//state varibles we can say ->it is default final so we cant change it by getmethods
//	->parameterised constructor which assigning the valye
//	->to String method
//	->hasvcode and equals
	
	
	
}// 40 + lines of of code int to singleline of code


public class ExampleRecordClass {

	public static void main(String[] args) {
		Aliens alein1=new Aliens(1, "jamuu");
       System.out.println(alein1);
//       System.out.println(alein1.getName());
//       System.out.println(alein1.getId());
       
		Aliens alein1=new Aliens();//you cant call default zero param constructor bcz once you tell your recprd class there are two state variavles

       
		Aliens alein2=new Aliens(1, "jamuu");
		System.out.println(alein2.equals(alein1));
		}

}
