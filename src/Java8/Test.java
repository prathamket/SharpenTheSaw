package Java8;


public class Test implements Interf {
public static void main(String[] args) {

	Test t = new Test();
	t.m1();
	Interf i = new Test();
	i.m1();
	Interf i1 = () -> System.out.println("m1() called using lymbda");
	i1.m1();
}

@Override
public void m1() {
	// TODO Auto-generated method stub
	
}


}
