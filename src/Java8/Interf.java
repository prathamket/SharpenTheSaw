package Java8;

@FunctionalInterface
public interface Interf {
public void m1();
//public void m4();

default void m2() {
	System.out.println("default mtd()");
}
public static void m3() {
	System.out.println("static mtd()");
}
}

interface A extends Interf{
	public void m4();	
}
