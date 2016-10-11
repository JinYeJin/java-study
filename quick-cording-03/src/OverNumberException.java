
public class OverNumberException extends Exception{
	public OverNumberException() {
		// TODO Auto-generated constructor stub
		super();
	}
	public OverNumberException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
    static OverNumberException forInputString(String s) {
        return new OverNumberException("under 1000.");
    }

}
