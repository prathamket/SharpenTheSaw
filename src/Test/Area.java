package Test;

public interface Area {

	final static float pi = 3.14f;

	float compute(float x, float y);
}
class Rect implements Area {
	public float compute(float x, float y) {
		return (x * y);
	}
}
class Circle implements Area{

	@Override
	public float compute(float x, float y) {
		// TODO Auto-generated method stub
		return (pi*x*y);
	}
	
}

