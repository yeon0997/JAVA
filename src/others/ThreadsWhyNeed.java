package others;

public class ThreadsWhyNeed {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0;
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			sum+=i;
		}
		System.out.println("�հ� : " + sum);
		long end = System.currentTimeMillis();
		System.out.println("����ð� : " + (end-start) + "ms");
	}
	
}
