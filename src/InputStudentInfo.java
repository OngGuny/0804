import java.util.Scanner;

public class InputStudentInfo {
	
	void inputStudentInfo(Student student){
	Scanner sc = new Scanner(System.in);// 만들면 서 
	
	
	System.out.println("Name? : ");	
	String name=sc.nextLine();
	
	System.out.println("Stu_No? : ");
	String stu_no=sc.nextLine();

	System.out.println("Korean? : ");
	int kor = sc.nextInt();
	
	System.out.println("English? : ");
	int eng = sc.nextInt();
	
	System.out.println("Math? : ");
	int mat = sc.nextInt();
	
	Student neo = new Student(name,stu_no,kor,eng,mat);
	
//	
//	System.out.println("Name? : ");	String name=sc.nextLine();
//	student.setName(name); //입력받은 이름을 우회해서 이름변수에 넣음
//	System.out.println("Stu_No? : ");neo.stu_no=sc.nextLine();
//	
//	System.out.println("Korean? : ");neo.kor=sc.nextInt();
//	System.out.println("English? : ");neo.kor=sc.nextInt();
//	System.out.println("Math? : ");neo.kor=sc.nextInt();
//	// 자바로 만든 코드를 검증하기위해 Junit 쓴다. 이건 자바용 라이브러리 외부프로그램. 디버깅용. 이클립스에 내장되있음; 

}
}
