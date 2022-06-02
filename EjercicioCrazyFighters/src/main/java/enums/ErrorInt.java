package enums;

public enum ErrorInt {

	ERRORINT (-1000);
	
	private int numError;

	private ErrorInt(int numError) {
		this.numError = numError;
	}

	public int getNumError() {
		return numError;
	}
	
	
	
}
