/* 생성자의 역할은 멤버변수(필드, Property)의 초기화
 * parameter가 없는 생성자를 기본생성자
 * 파라미터가 없는 기본 생성자는 어케초기화?
 * 0 / 0.0 / false / \0 or \u0000 / null 로 초기화함 
 * 기본 생성자는 항상 해당클래스의 생성자가 한개도 없을 떄 자동으로 만들어준다
 * 만일 한개라도 생성자가 존재하면 컴파일러는 자동으로 생성하지 않는다.  이게 자바 문법 
 */

public class CostructorDemo2 {
public static void main(String[] args) {
	//Tiger tiger = new Tiger();       //기본 생성자.  new 로 생성할 때 초기화.
//	System.out.println(tiger.grade);
	MyCalender mc = new MyCalender(); //생성자가 따로 있기에 컴파일러는 기본 생성자 안만듦 . 필요하면 걍 기본 생성자를 만들면됨 오버로딩 되니까
	System.out.println(mc.year);

}
}
// 이런애들은 어뜨캄? 기본생성은 0 인데 0년0일같은건 없음. 
class MyCalender { // 그래서 초기화값을 지정해줌 = Override(재정의)

	int year, month, day;
	public MyCalender() {} // 세미콜론은 안쓰고 중괄호쓴다. 
	public MyCalender(int year) {}
	public MyCalender(int year, int month ) {}
	public MyCalender(int year, int month, int day) {//기본생성자가 아님 
		this.year=year;
		this.month=month;
		this.day=day;
		
	}
}








class Tiger{
	String name;
	int age;
	boolean flag;
	double weight;
	char grade;
}

