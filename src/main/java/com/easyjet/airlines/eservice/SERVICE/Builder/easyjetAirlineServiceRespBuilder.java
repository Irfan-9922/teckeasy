/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.SERVICE.Builder;

import com.easyjet.airlines.eservice.process.Valubean.easyjetAirlineProcessVbResp;
import com.easyjet.airlines.schemas.enroll.responce.EnrollmentResponceType;
import com.easyjet.airlines.schemas.enroll.responce.ResponceType;
import com.easyjet.airlines.schemas.enroll.responce.StatusType;

/**
 * @author :IRFAN
 *TIME:7:22:03 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlinesSVC-service
 */
public class easyjetAirlineServiceRespBuilder {
	public EnrollmentResponceType enroll(easyjetAirlineProcessVbResp res){
		System.out.println("coming from resp builder####################################"+res);
		
		EnrollmentResponceType enrollmentRes=new EnrollmentResponceType();
		
		
		  
		ResponceType r=new ResponceType();
		StatusType st=new StatusType();
		r.setCampignCode(res.getResponceMessage().getCampignCode());
		r.setCardNumber(res.getResponceMessage().getCardNumber());
		r.setFirstName(res.getResponceMessage().getFirstName());
		r.setLastName(res.getResponceMessage().getLastName());
		r.setPan(res.getResponceMessage().getPan());
		r.setPartnerCode(res.getResponceMessage().getPartnerCode());
         st.setResopnceCode(res.getStatus().getResopnceCode());
         st.setRespMessage(res.getStatus().getRespMessage());
		
		
		
        //
         enrollmentRes.setResponceMessage(r);
         enrollmentRes.setStatus(st);
		return enrollmentRes;
		
	}

}
