public class Calc {
	private int r=0;
	public int add(int x, int y) { //2차커밋을 위한 내용변경
		return x+y;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public void inc(int d){ //
		r += d;
	}
	public int getResult(){ //test
		return r;
	}
}

