import java.util.Scanner;

public class Prob_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Grade me = new Grade();
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		me.math = scan.nextInt();
		me.science = scan.nextInt();
		me.english = scan.nextInt();
		
		System.out.println("����� " + me.average());
				

	}

}

class Grade{
	int math=0;
	int science=0;
	int english=0;
	
	public int average(){
		return (math+science+english)/3;
	}
}
