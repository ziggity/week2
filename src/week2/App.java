package week2;

public class App {

	public static void main(String[] args) {
		boolean trueAndFalse = true && false;
		System.out.println("true and false" + trueAndFalse);
		boolean trueOrFalse = false || true ; // short circuit happens when conditional is met before evaluate the whole
												// thing
		System.out.println("true or false " + trueOrFalse);
		boolean falseAndFalse = false && false;
		System.out.println("false and false " + falseAndFalse);
		boolean trueAndFalseOrTrue = true && (false || true);
		System.out.println("true and false or true " + trueAndFalseOrTrue);
		boolean falseOrTrueAndFalse = false || (true && false);
		System.out.println("false or true and false " + falseOrTrueAndFalse);
		boolean falseOr1less5 = false || 1 < 5;
		System.out.println("false or 1 less than 5 " + falseOr1less5);
		boolean fiveGreater4And1g3 = 5 >= 4 && 1 > 3;
		System.out.println("5 greater than 4 and 1 greater than 3 " + fiveGreater4And1g3);
		boolean tenLessthan = 10 < 4 || 1 > 4;
		System.out.println("10 less than 4 or 1 greater 4 " + tenLessthan);
		boolean twelveGreaterThan = 12 >= 2 && 1 < 24;
		System.out.println("12 greater 2 and 1 less 24 " + twelveGreaterThan);
		boolean hello = "Hello".charAt(0) == 'h';
		System.out.println("hello charAt(0) = h" + hello);
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		int costOfMilk = 5;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		double moneyInWallet = 55.50;
		int thirstLevel = 5;
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println("should i buy icecream " + shouldByIcecream);
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println("willGoSwimming " + willGoSwimming);
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println("is a good day " + isAGoodDay);
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet > (2 * costOfMilk);
		System.out.println("will buy milk " + willBuyMilk);
//shouldByIcecream – this should be true if it is hot outside and there is money in your pocket
//		willGoSwimming – this should be true if it is hot outside and it is not a weekday
//		isAGoodDay – this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
//		willBuyMilk – this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet is greater than or equal to 2 times the cost of milk.
		

		
		

	}
	
	    	 
   }


/*
 * Create a new class called Loops. In the main method of this class, create the following loops with any variables you feel are needed:
A while loop that prints all even numbers from 0 to 100
A while loop that prints every 3rd number going backwards from 100 until we reach 0
A for loop that prints every other number from 1 to 100
A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
*/
