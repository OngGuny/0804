// this 3번째 용법 
/*
 *  this() : new 없이 생성자를 호출하기 위한 메소드 
 *  반드시 생성자 메소드에서만 사용해야함 
 *  생성자 메소드 내의 '첫 줄'에만 사용가능 
 */
public class ConstructorDemo3 {
public static void main(String[] args) {
	Sawon neo = new Sawon("Neo",1000000);
	System.out.println(neo.name); // 돈만넣고 이름안넣으니 이름 null값 뜸  기본값을 주면 해결할수있따. (?)
	System.out.println(neo.salay);
}
}
class Sawon{ //옵션도 잘 넣고싶다. 이름만. 둘다. 넣을경우도 
	 String name;
	 int salay;
	 public Sawon(String name, int salay) {
		 this.name=name;
		 this.salay=salay;
	 }
	 public Sawon(String name) {
		 this(name,500000);// new를 한번더 넣어서 안뜨는거. 뉴 해서 일로왔는데 뉴 해서 또 주소가 바뀜, 초기화됨. 그러면 new를 안쓰고 호출하면 됨. 그게 this 
	//	 this.name=name;
	 }
	 public Sawon( int salay) {
		 this("Unkouwn",salay);     
//		 this.salay=salay;
		 }
	 public Sawon() {
		 this("Unkouwn",500000);
	 }
	 
}

