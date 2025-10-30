// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int a = (int)(num * Math.random());
		int b = (int)(num * Math.random());
		int c = (int)(num * Math.random());
		System.out.println(a + " " + b + " " + c);

		int maxNum = Math.max(Math.max(a, b), c);
		int minNum = Math.min(Math.min(a, b), c);
		int midNum = (a + b + c) - maxNum - minNum;


		System.out.println(minNum + " " + midNum + " " + maxNum);

	}
}
