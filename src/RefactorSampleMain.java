
public class RefactorSampleMain {

	public static void main(String[] args) {
		SurfaceCalculator calc = new SurfaceCalculator();
		calc.field1 = 100;
		
		System.out.println("Cone: " + calc.calculateConeSurface(50, 10));
		System.out.println("Cilinder: " + calc.cylinderArea(50, 10));
	}
}
