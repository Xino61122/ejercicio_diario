package service;

import enums.ErrorInt;

public class TryService {

	public static int tryInt(String text) {
		try {
			int election = Integer.parseInt(text);
			return election;
		}catch (Exception e) {
			return ErrorInt.ERRORINT.getNumError();
		}
	}
	
}
