////캡슐화의 원칙에 따라 모든 변수는 캡슐화. private 로 한다. 
//public class Car {
//	private String name;
//	private int price;
//
//public void setName(String name) {	//메소드니까 괄호가() 있어야햄  집어넣기만 할꺼니까 void / 변수를 뭐로 받을래? string nameset / 여기 이름 받는다는걸 알려줘야하니 public
//	this.name=name;//this 4바이트 참조변수다. 자기 자신의 주소.(의)name에 입력받은 name을 입력한다. 
//}
////가격을 세팅하기위한 메소드를 만든다.
//public void setPrice(int price) { // 공개된 메소드를 통해서 공개되지 않은 변수에 접근하세요. 
////보이게 하려고 퍼블릭
//	this.price=price; // 이름을 입력받는 변수와 넣을 변수를 다르게 하던가. 지점을 다르게 설정해준다. this 사용해서 
//}
//
//
///* 객체는 
// * 속성과 
// * 
// * 
// * 
// * 
// * 행위로 이루어져있따. 
// */
//
//
////읽어들이는 set이 있으니까 이제 알려주는애가 필요해
//
//public String getName() { //메소드 이름이 뭐야 getname 메소드니까 괄호,스트링 타입, 공개,되돌려주는것은 이름(스트링)
//	return name;
//}
//public int getPrice() {
//	return price;
//}
//} 
일일히 쓰지 않고 툴을 쓴다. 
변수를 지정만 해놓고 . 
우클릭 -resource- Generater getter/setter 사용;; 
16개 메소드를 언제 다 만들꺼냐..  여기서는 이해면된다. 