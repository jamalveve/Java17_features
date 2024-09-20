package com.Switch.cases;

//1.syntax of switch
public class Examplle1 {
	public static void main(String[] args) {

		// existing
		String day = "sunday";
		switch (day) {
		case "Monday":
			System.out.println("wakeup fast");
			break;
		case "Tuesday":
			System.out.println("wakeup fast");

			break;
		case "Wednesday":
			System.out.println("wakeup fast");

			break;// if youdidnotgive break it will rint along the remainig things also
		case "Thursday":
			System.out.println("wakeup fast");

			break;
		case "Friday":
			System.out.println("wakeup fast");

			break;
		//
		default:
			System.out.println("wakeup slow");

		}

		String days = "sunday";
		switch (days) {
		case "Monday" -> System.out.println("wakeup fast");
		case "Tuesday" -> System.out.println("wakeup fast");

		case "Wednesday" -> System.out.println("wakeup fast");

		case "Thursday" -> System.out.println("wakeup fast");

		case "Friday" -> System.out.println("wakeup fast");

//			break;
		default -> System.out.println("wakeup slow");

		}
		String days1 = "sunday";
		String result="";
		result=switch (days1) {
		
		
		case "Monday"->{ yield "wakeup fast";}
		};
		

	}
}
