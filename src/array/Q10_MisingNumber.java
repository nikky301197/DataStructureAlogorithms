package array;

public class Q10_MisingNumber {
	public static void main(String[] args) {

//		time complexity - 0(n)
//		space complexity - 0(1)
		
		int a[] = { 1, 2, 4, 5 };
		int n = a.length + 1;
		int total_sum = (n * (n + 1)) / 2;
		int acutal_sum = 0;
		int missing_num;
		for (int i = 0; i < a.length; i++) {
			acutal_sum = acutal_sum + a[i];
		}
		System.out.println(total_sum);
		System.out.println(acutal_sum);

		missing_num = total_sum - acutal_sum;
		System.out.println(missing_num);

	}

}
