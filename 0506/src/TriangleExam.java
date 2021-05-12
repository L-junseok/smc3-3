
public class TriangleExam {

	public static void main(String[] args) {
		Triangle t = new Triangle(10.2,17.3);
		System.out.println("삼각형 1번 넓이 : " + t.getTriangle());
		t.change(7.5, 9.2);
		System.out.println("삼각형 2번 넓이 : " + t.getTriangle());

	}

}
class Triangle{
	double bottom = 0;
	double height = 0;
	
	public Triangle(double bt, double hg){
		bottom = bt;
		height = hg;
	}
	
	public void change(double bt, double hg){
		bottom = bt;
		height = hg;
	}
	
	public double getTriangle(){
		return ((bottom * height)/2);
	}
}
