import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
//협업하기 위해서 Junit 배운다. 
public class InputTest {
	Student neo;
	
	@Before
	public void init() {
		neo = new Student();
	}
	
	@Test//@=annotation  여기서는 junit에서만 쓰는 @다. 검사하려는 메소드 위에 쓴다. 
	public void testMain() {
		Student neo = new Student();
		InputStudentInfo input = new InputStudentInfo();
		input.inputStudentInfo(neo);
		assertEquals("Neo", neo.name); // input 왜 안되는지 다시보기 
	}

	@Test // 테스트 건너뛰고 하려면 @ignore 를 @test앞에 붙여줌
	public void testInput() {
	InputStudentInfo input = new InputStudentInfo();
	input.inputStudentInfo(neo);
	}

	@Test
	public void testCalc() {
		Calc calc=new Calc();
		neo.kor=40; neo.eng=40; neo.mat=40;
		calc.calc(neo);
		//assertEquals(278, neo.tot);
		//assertEquals((int)(278/3), (int)(neo.avg));
		assertEquals('B', neo.grade);
}
}
