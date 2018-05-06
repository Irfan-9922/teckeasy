/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.SERVICE.Util;

/**
 * @author :IRFAN
 *TIME:11:41:29 am
 * DATE:12-May-2017
 *PROJECTNAME:EasyjetairlinesSVC-service
 */
public class EasReqInvalidException extends Exception {
	private String errorCode;
	private String errorMsg;
	/**
	 * @return the errorCode
	 */
	public EasReqInvalidException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * @param errorCode
	 * @param errorMsg
	 */

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
