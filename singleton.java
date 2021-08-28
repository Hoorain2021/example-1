package com.Examples;

public class singleton {
private static singleton singleton = new singleton( );
/* A private Constructor prevents any other
* class from instantiating.
*/
private singleton() { }
/* Static 'instance' method */
public static singleton getInstance( ) {
return singleton;
}
/* Other methods protected by singleton-ness */
protected static void demoMethod( ) {
System.out.println("demoMethod for singleton");

}
} 