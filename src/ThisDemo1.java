
public class ThisDemo1 {
public static void main(String[] args) {
	Lion lion = new Lion();
	Lion another = lion.getLion();
	System.out.println(another.name);
	System.out.println(another.age);
}
}
class Lion{
	String name="한지민";
	int age=26;
	Lion getLion(){
		return this; // 라이언 클래스 자체를 넘김. 스스로를. 자기전체를 넘김. 
	}//	return this.name : 이러면 바로위 Lion getLion 은 String 앞에써주고 string이 되는것
	}//	return this.age 도 마찬가지로. 이렇게 하나만 지정해서 데리고가면 하나만감. this하면 이름하고 나이 전체를 가져감 