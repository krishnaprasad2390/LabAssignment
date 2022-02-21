package lambdaAssignmentexe1;

public class TwoNumbers {
	
	Power a = (x, y) -> {
		return (int) (Math.pow(x,y));
	};
	
	public static void main(String[] args) {
		Power i = (x, y) -> {
			return (int) (Math.pow(x,y));
		};
		System.out.println(i.a(2, 3));
	}
}
