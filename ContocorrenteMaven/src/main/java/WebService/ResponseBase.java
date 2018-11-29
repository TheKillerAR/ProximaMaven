package WebService;

import java.io.Serializable;

public class ResponseBase implements Serializable {
	
	private static final long serialVersionUTD = 1L;
	
	private String result;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public static long getSerialversionutd() {
		return serialVersionUTD;
	}
	private int errorCode;
	private String errorDesc;

}
