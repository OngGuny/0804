
public class EncapsulationDemo {
public static void main(String[] args) {
	Car sonata = new Car();
//	sonata.name = "소나타";
	sonata.setName("소나타"); // 이름을 지정하지 않고 이름 지정하는 메소드를 콜 해서 이름 지정한다. 
//	sonata.price=30_000_000;
	sonata.setPrice(40_000_000);// 어떻게 이름이 지정되는지 보여줄필요는 없다. 
	//System.out.println("이름은"+sonata.name+", 가격은"+sonata.price+"원 입니다."); // 외부의 조작으로부터 보호하기 위해 락을 검. 엔캡슐화
	System.out.println("이름은 "+sonata.getName()+", 가격은 "+sonata.getPrice()+"원 입니다.");
	
	//오류 not visible 은 권한이 없다는거.	 set(들어가기), get(가져오기) 이 안되는 중 

}
}
