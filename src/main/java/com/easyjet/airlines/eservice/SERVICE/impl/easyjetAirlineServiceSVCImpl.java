/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.SERVICE.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.easyjet.airlines.eservice.SERVICE.Builder.easyjetAirlineServiceReqBuilder;
import com.easyjet.airlines.eservice.SERVICE.Builder.easyjetAirlineServiceRespBuilder;
import com.easyjet.airlines.eservice.SERVICE.Util.EasReqInvalidException;
import com.easyjet.airlines.eservice.SERVICE.Validator.easyjetAirlineServiceValidator;
import com.easyjet.airlines.eservice.process.Impl.EasyJetAirLineSvcProcess;
import com.easyjet.airlines.eservice.process.Impl.EasyJetAirLineSvcProcessImpl;
import com.easyjet.airlines.eservice.process.Valubean.easyjetAirlineProcessVbReq;
import com.easyjet.airlines.eservice.process.Valubean.easyjetAirlineProcessVbResp;
import com.easyjet.airlines.schemas.enroll.request.AddressType;
import com.easyjet.airlines.schemas.enroll.request.ClientDetailsType;
import com.easyjet.airlines.schemas.enroll.request.CustomerDetailsType;
import com.easyjet.airlines.schemas.enroll.request.EnrollmentReqType;
import com.easyjet.airlines.schemas.enroll.request.ServiceDetailsType;
import com.easyjet.airlines.schemas.enroll.responce.EnrollmentResponceType;
import com.easyjet.airlines.schemas.enroll.responce.StatusType;
import com.easyjet.schema.easyjetsvc.Service;

/**
 * @author :IRFAN
 *TIME:7:19:26 pm
 * DATE:11-May-2017
 *PROJECTNAME:EasyjetairlinesSVC-service
 */
@WebService(endpointInterface="com.easyjet.schema.easyjetsvc.Service")
public class easyjetAirlineServiceSVCImpl implements Service {

	/* (non-Javadoc)
	 * @see com.easyjet.schema.easyjetsvc.Service#enroll(com.easyjet.airlines.schemas.enroll.request.EnrollmentReqType)
	 */
	 @WebMethod
	public EnrollmentResponceType enroll(EnrollmentReqType wsreq) {
		
		//validate the class
		easyjetAirlineServiceValidator val=new easyjetAirlineServiceValidator();
		try {
		val.ValidErrorReq(wsreq);
	
		// TODO Auto-generated method stub
		/*easyjetAirlineProcessVbReq vbreq=new easyjetAirlineProcessVbReq();
		
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
		vbreq.setTital(wsreq.getCustomerDetails().getTital());*/
		
		//send the req data to service layer to process layer
		
			easyjetAirlineServiceReqBuilder bui=new easyjetAirlineServiceReqBuilder();
			easyjetAirlineProcessVbReq req=bui.reqbuilder(wsreq);
		EasyJetAirLineSvcProcess process=new EasyJetAirLineSvcProcessImpl();
		easyjetAirlineProcessVbResp res=process.enroll(req);
		
		//get the  responce from process layer
	
			// TODO Auto-generated catch block
			
		
		/*EnrollmentResponceType enrollmentRes=new EnrollmentResponceType();
		
		
		  
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
         enrollmentRes.setStatus(st);*/
     //	System.out.println("succesfull responce is comming from process to service layer"+enrollmentRes.getResponceMessage().getCampignCode());
		
		easyjetAirlineServiceRespBuilder respbld=new easyjetAirlineServiceRespBuilder();
		
		EnrollmentResponceType enrollmentRes=respbld.enroll(res);
		
	return enrollmentRes;
		}
		catch(EasReqInvalidException e){
			
			String errorcode=e.getErrorCode();
			String errormsg=e.getErrorMsg();
			System.out.println(errorcode);
			System.out.println(errormsg);
			EnrollmentResponceType c=new EnrollmentResponceType();
			StatusType s=new StatusType();
			s.setResopnceCode(errorcode);
			
            s.setRespMessage(errormsg);		
		
            c.setStatus(s);
          
            return c;
	}
		
		
	}
 
	
	public static void main(String[] args) {
		easyjetAirlineServiceSVCImpl i=new easyjetAirlineServiceSVCImpl();
		
		EnrollmentReqType r=new EnrollmentReqType();
		ClientDetailsType d=new ClientDetailsType();
		CustomerDetailsType cd=new CustomerDetailsType();
		ServiceDetailsType f=new ServiceDetailsType();
		AddressType a=new AddressType();
		f.setAPIName("sss ");//
		f.setServiceName("hh");//
		f.setVersion(" 2.4");//
		
		a.setAddressLine1(" askj");//
		a.setAddressLine2("masjid road");//
		a.setAddressline3("mh");//
		d.setChannelId("1234 ");//
		d.setClientId("");//
		d.setRequestId("433");//
		cd.setCardNumber("");//
		cd.setCity("latur ");//
		cd.setCountery("india");//
		cd.setDOB("12-11-1992");//
		cd.setExpiryDate("11-11-2070");//
		cd.setGender("male");
		cd.setFirstName("ifran");//
		cd.setMiddelName("jalil");//
		cd.setLastName("patel");//
		cd.setPostal("garsoli");//
		cd.setTital(" demo");//
		cd.setAddress("ghghhg");
		r.setAddress(a);
		
		r.setClientDetails(d);
		r.setCustomerDetails(cd);
		r.setServiceDetails(f);
		
		
		System.out.println(i.enroll(r));
	
		r.setClientDetails(d);
		r.setCustomerDetails(cd);
		r.setServiceDetails(f);
		System.out.println(i.enroll(r));
		
	}
	

}
