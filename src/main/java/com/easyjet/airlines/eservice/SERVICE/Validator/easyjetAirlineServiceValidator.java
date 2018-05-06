/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.SERVICE.Validator;

import com.easyjet.airlines.eservice.SERVICE.Util.EasReqInvalidException;
import com.easyjet.airlines.schemas.enroll.request.AddressType;
import com.easyjet.airlines.schemas.enroll.request.ClientDetailsType;
import com.easyjet.airlines.schemas.enroll.request.CustomerDetailsType;
import com.easyjet.airlines.schemas.enroll.request.EnrollmentReqType;
import com.easyjet.airlines.schemas.enroll.request.ServiceDetailsType;

/**
 * @author :IRFAN
 *TIME:7:20:59 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlinesSVC-service
 */
public class easyjetAirlineServiceValidator {
	
	public void ValidErrorReq (EnrollmentReqType wsreq) throws EasReqInvalidException{
		
		
	//System.out.println("from validator class cheking data is coming or not"+wsreq.getClientDetails().getClientId());
		if(wsreq==null||wsreq.getClientDetails()==null||wsreq.getCustomerDetails()==null||wsreq.getServiceDetails()==null){
			System.out.println("from drow");
			throw new EasReqInvalidException("EA001", "RequestObject is null");
			
		}
		/*if
			(wsreq.getClientDetails().getClientId().equals(" ")|| wsreq.getClientDetails().getChannelId().equals(" ")|| wsreq.getClientDetails().getRequestId().equals(" ")){
			throw new EasReqInvalidException("EB020", "client Id is invalid");
		}*/
		CustomerDetailsType c=wsreq.getCustomerDetails();
		 ClientDetailsType req=wsreq.getClientDetails();
		ServiceDetailsType st=wsreq.getServiceDetails();
		
		 if
		(req==null||(" ").equals(req.getClientId())|| (" ").equals(req.getRequestId())|| (" ").equals(req.getChannelId())){
		System.out.println("com");
			throw new EasReqInvalidException("EA002", "client Id is invalid");
	}
		 
  
		else if(c==null||(" ").equals(c.getCardNumber())|| (" ").equals(c.getCity())||(" ").equals(c.getCountery())||(" ").equals(c.getDOB())||(" ").equals(c.getExpiryDate())||("").equals(c.getFirstName())||(" ").equals(c.getGender())||(" ").equals(c.getLastName())||(" ").equals(c.getMiddelName())||(" ").equals(c.getPostal())||(" ").equals(c.getTital())){
   	System.out.println("from customer details ");
   	throw new EasReqInvalidException("EA003", "in client somethig is missing");

   }
		 

		else if(st==null||(" ").equals(st.getAPIName())||(" ").equals(st.getServiceName())||(" ").equals(st.getVersion())){
   	System.out.println("from service details ");
   	throw new EasReqInvalidException("AE004", "in client somethig is missing");

   }

	}
}
