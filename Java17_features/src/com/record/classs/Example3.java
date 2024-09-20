package com.record.classs;

import java.util.Objects;

class Alien {
	private final int id;
	

	
	
	private final String name;
	
	public Alien(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alien other = (Alien) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}

public class Example3 {
	public static void main(String[] args) {
		
//		string text box
		String s1=     """   
				        hello
                        I am
                        hello
                        heloo   
                        """;
		
		System.out.println(s1);
		Alien alein1=new Alien(89, "jamal");
       System.out.println(alein1);//we will get hashcode value if(to strig method is not there)
       System.out.println(alein1.getName());//we will get actual value
       System.out.println(alein1.getId());//we will get actual value
       
//       but what if we need calling alein getig the name and id so 
//       we have to have tostring method in the class
       
       
		Alien alein2=new Alien(89, "jamal");
		System.out.println(alein2.equals(alein1));//y false ? reason they are not the same object so we can tell java compare the values not the memory location
//		so we need tooveride equals and hashcode method changing the behaviour to check the actuall data
		
//		once after this the line 58 will print true



		
		//now to perform these operations do we need to perfrom these much of lines of code?
//		here comes record class
		
		
//		->ExampleRecordClass	check tghis
		}
	
}
