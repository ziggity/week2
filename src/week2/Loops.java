package week2;

public class Loops {

	public static void main(String[] args) {
		
		//ifEvenPrintNum();
		//subtract3From100whileloop();
		//everyOtherNumTo100();
		everyNumTo100divisibleBy3And5();
	}
		     
	public static void ifEvenPrintNum() {
		int i = 0;
		while(i<=100) {
			if(i % 2 == 0) {
				System.out.println(i); 
		}
		i++;
	 }
 }
	public static void subtract3From100whileloop() {
		int i = 100;
		while(i>=0) {
			i -= 3;
			if(i>=0) {
			System.out.println(i); 
			}
	 }
 }
	public static void everyOtherNumTo100() {
		for(int i = 1; i<=100;i+=2)
			System.out.println(i); 
			}
	public static void everyNumTo100divisibleBy3And5() {
		for(int i = 0; i <= 100; i++) { 
			if((i%3==0) && (i%5==0)) {
				System.out.println("HelloWOrld");
			} 
			if(i % 5 == 0) {
				System.out.println("World"); 
			}
			else if(i % 3 == 0) {
				System.out.println("Hello");
			}
			 else {
				System.out.println(i);
			}
			
		}
	}
	     
}

