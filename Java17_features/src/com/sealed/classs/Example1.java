package com.sealed.classs;

//final class A{
//	
//}
sealed class A  extends Thread implements Cloneable permits B,C,D{//you can do extend any other class also and interface also//permitshpudl be the last thing
	
}
sealed class B extends A permits E{//either sealed
			
}


non-sealed class C extends A{//either non -selaed (which can be extened by any class)
	
}
final class D extends A{
	
}
final class E extends B{//cant inheritvfrom final classs
	
}
class F extends C{
	
}
class G extends A{////not possible
	
}

//abstact level
abstract sealed class Example2 permits K,L,M{
	
}
abstract non-sealed class K extends Example2{
	
}
final class M extends Example2{
	
}

non-sealed class L extends Example2{
	
}
public class Example1 {

}
