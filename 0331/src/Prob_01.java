import java.util.Scanner;

public class Prob_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Grade me = new Grade();
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		me.math = scan.nextInt();
		me.science = scan.nextInt();
		me.english = scan.nextInt();
		
		System.out.println("평균은 " + me.average());
				

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
