
public class Car2툴사용 {
	private String name;
	private int price;
	
	public Car2툴사용(){ // 기본 생성자. 괄호안에 아무것도 없는애 String 등 api 가면 constructor 가 따로 있다. 
		System.out.println("방금 객체가 생성되었습니다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void myPrint() {
		System.out.println(this);
	}
}
