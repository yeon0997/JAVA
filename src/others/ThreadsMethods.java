/*
 * �������� �ֿ� �޼���
 * run() : �������� �������� �ڵ� ��
 * setDaemon() : ���� �����尡 ����Ǿ��� �� �ڵ� ����ǵ��� ����
 * start() : �ش� �������� ����
 * sleep(long) : �־��� �и��� ���� ������ �۵� �Ͻ� ����
 * interrupt() : ������ ���� ����
 * isAlive() : �����尡 ����ִ��� Ȯ��
 * join() :  �� �����尡 ����� �� ���� ��ٸ� �Ŀ� ����
 * yield() : ������ �ߴ��ϰ� �ٸ� �����忡�� cpu �ڿ��� �纸
 */
package others;

public class ThreadsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<100;i++) {
				Threadm th = new Threadm(i);
				th.start();
				th.join();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Threadm extends Thread {
	private int x;
	public Threadm(int x) {
		this.x = x;
	}
	@Override
	public void run() {
		System.out.println(x + "��° ������ ����!!");
	}
}