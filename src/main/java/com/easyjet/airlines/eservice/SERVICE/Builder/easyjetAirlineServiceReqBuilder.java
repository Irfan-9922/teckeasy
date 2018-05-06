/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.SERVICE.Builder;

import com.easyjet.airlines.eservice.process.Valubean.Addressreqbean;
import com.easyjet.airlines.eservice.process.Valubean.easyjetAirlineProcessVbReq;
import com.easyjet.airlines.schemas.enroll.request.EnrollmentReqType;

/**
 * @author :IRFAN
 *TIME:7:22:33 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlinesSVC-service
 */
public class easyjetAirlineServiceReqBuilder {
	
	public easyjetAirlineProcessVbReq reqbuilder(EnrollmentReqType wsreq){
		System.out.println("data coming from req builder"+wsreq);
easyjetAirlineProcessVbReq vbreq=new easyjetAirlineProcessVbReq();

		Addressreqbean add=new Addressreqbean();
		add.setAddressLine1(wsreq.getAddress().getAddressLine1());
		add.setAddressLine2(wsreq.getAddress().getAddressLine2());
		add.setAddressline3(wsreq.getAddress().getAddressline3());
		vbreq.setApiName(wsreq.getServiceDetails().getAPIName());
		vbreq.setServiceName(wsreq.getServiceDetails().getServiceName());
		vbreq.setVersion(wsreq.getServiceDetails().getVersion());
		vbreq.setClientId(wsreq.getClientDetails().getClientId());
		vbreq.setChannelId(wsreq.getClientDetails().getChannelId());
		vbreq.setRequestId(wsreq.getClientDetails().getRequestId());
		vbreq.setAddress(add);
		vbreq.setCardNumber(wsreq.getCustomerDetails().getCardNumber());
		vbreq.setCity(wsreq.getCustomerDetails().getCity());
		vbreq.setCountery(wsreq.getCustomerDetails().getCountery());
		vbreq.setDob(wsreq.getCustomerDetails().getDOB());
		vbreq.setExpiryDate(wsreq.getCustomerDetails().getExpiryDate());
		vbreq.setFirstName(wsreq.getCustomerDetails().getFirstName());
		vbreq.setGender(wsreq.getCustomerDetails().getGender());
		vbreq.setLastName(wsreq.getCustomerDetails().getLastName());
		vbreq.setMiddelName(wsreq.getCustomerDetails().getMiddelName());
		vbreq.setPostal(wsreq.getCustomerDetails().getPostal());
		vbreq.setTital(wsreq.getCustomerDetails().getTital());
		System.out.println("data coming from req builder"+vbreq);
		return vbreq;
	}

}
