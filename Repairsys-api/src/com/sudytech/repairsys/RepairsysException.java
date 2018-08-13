package com.sudytech.repairsys;

public class RepairsysException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public RepairsysException() {
		super();
	}

	public RepairsysException(String message, Throwable cause) {
		super(message, cause);
	}

	public RepairsysException(String message) {
		super(message);
	}

	public RepairsysException(Throwable cause) {
		super(cause);
	}
	
}