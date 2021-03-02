package Java8;

public class Addition implements add{

	@Override
	public void add(int a, int b) {
		System.out.println("addtion: "+(a+b));
	}
	public static void main(String[] args) {
		
		add i = (a,b) -> System.out.println("The sum "+(a+b));
		add a = new Addition();
		a.add(10, 20);
		i.add(33, 22);
		
		
		
	}

}


interface add{
public void add(int a, int b);

}