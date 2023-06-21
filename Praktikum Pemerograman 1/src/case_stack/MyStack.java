package case_stack;

public class MyStack extends AbstractStack {

	public MyStack(int capacity) {
		super(capacity);
	}

//	@Override
	public void displayStack(String s) {
		System.out.println(s);
		System.out.println("Stack (bottom -> Top): ");
		for (int i = 0; i < size(); i++) {
			System.out.print(peekN(i));
//			System.out.print(' ');
		}
		System.out.print("");
	}

//	@Override
	public int peekN(int n) {
		return arr[n];
	}

}
