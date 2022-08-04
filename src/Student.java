
public class Student {
private String name,stu_no;
private int kor,eng,mat,tot;
private double avg;
private char grade;
//툴써서 한번에 set/get한다. 전부다 메소드 하드코딩하지말고 
// 학생을 만들 때는 학번,이름 도 같이 생겨야지
// 
// 관례적으로 변수 / 생성자 / 클래스 씀

//Student 생성 할 때 각 멤버변수 초기화              생성자는 new 할때만 호출한다. 생성자는 메소드.
//public Student(String stu_no,String name,int kor, int eng, int mat) {
//	this.stu_no=stu_no; // 이것도 자동화 가능. 
//}  필드는 멤버변수. 소스가서 constructor 사용하자 using field  
// 이름은 클래스 이름과 같다. 각 변수들을 초기화하는 역할 . constructor;  


public Student(String name, String stu_no, int kor, int eng, int mat) {
	super();//나중에배움 
	this.name = name;
	this.stu_no = stu_no;
	this.kor = kor;
	this.eng = eng;
	this.mat = mat;
}// 이제 학생만들때 이렇게 만들어 놓은대로만 써야함 
// api가면 이름 똑같은거 많은데 그게 overloding 표시방법  
// 생성자들의 이름이 다 같기떄문에. 파라미터로 구분하는거. 오버로딩방식 scanner, string 등등 
/

//------------------------------------------
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStu_no() {
	return stu_no;
}
public void setStu_no(String stu_no) {
	this.stu_no = stu_no;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getMat() {
	return mat;
}
public void setMat(int mat) {
	this.mat = mat;
}
public int getTot() {
	return tot;
}
public void setTot(int tot) {
	this.tot = tot;
}
public double getAvg() {
	return avg;
}
public void setAvg(double avg) {
	this.avg = avg;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
}
