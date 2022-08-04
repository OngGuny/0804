//1. 7개의 피보나치 수열을 출력하시오 .       
//  반복문으로 하는 방법
// 재귀호출로 하는 방법 2가지 
public class Task0804 {
public static void main(String[] args) {
	int sum=0;
	int [] pi= new int[7];
	pi[0] = 1;
	pi[1] = 1; 
	
	
	for(int i=2 ;i<pi.length;i++) {
			pi[i]=pi[i-1]+pi[i-2];
	}
	System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d"
			+ "\t",pi[0],pi[1],pi[2],pi[3],pi[4],pi[5],pi[6]);
}

/*    1
 * 	  1 
 *  0  2=1+1
 *  1  3=2+1
 *  2  5=3+2
 *  3  8=5+3
 *  4  13=8+5
 */

}
