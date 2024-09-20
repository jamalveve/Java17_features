
package com.sealed.classs;


sealed interface X permits Y{
	
}
non-sealed interface Y extends X {
	
}//CANT BE FINAL

public class Interfacetry {

}
