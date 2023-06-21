package p11;

public class Vertex {
	private char lebel;
	private boolean wasVisited;

	public Vertex(char lab) {
		lebel = lab;
		wasVisited = false;
	}

//	setter & getter
	public void setLebel(char lebel) {
		this.lebel = lebel;
	}

	public char getLebel() {
		return this.lebel;
	}

	public void setWasVisited(boolean wasVisited) {
		this.wasVisited = wasVisited;
	}

	public boolean getNext() {
		return this.wasVisited;
	}
}
