/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.easyjet.airlines.eservice.SERVICE.Validator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.easyjet.airlines.eservice.SERVICE.Util.EasReqInvalidException;
import com.easyjet.airlines.schemas.enroll.request.AddressType;
import com.easyjet.airlines.schemas.enroll.request.ClientDetailsType;
import com.easyjet.airlines.schemas.enroll.request.CustomerDetailsType;
import com.easyjet.airlines.schemas.enroll.request.EnrollmentReqType;
import com.easyjet.airlines.schemas.enroll.request.ServiceDetailsType;

/**
 * @author :IRFAN
 *TIME:7:10:29 pm
 * DATE:05-Jun-2017
 *PROJECTNAME:EasyjetairlineSVC-Service
 */
public class easyjetAirlineServiceValidatorTest {
	 easyjetAirlineServiceValidator validator=null;
	EnrollmentReqType req=null;

	
	

	
	@Before
	public void setUp() throws Exception {
		validator=new easyjetAirlineServiceValidator();
		req=test();
	}

	/**
	 * @return
	 */
	private EnrollmentReqType test() {
		// TODO Auto-generated method stub
		EnrollmentReqType r=new EnrollmentReqType();
		ClientDetailsType d=new ClientDetailsType();
		CustomerDetailsType cd=new CustomerDetailsType();
		ServiceDetailsType f=new ServiceDetailsType();
		AddressType a=new AddressType();
		/*f.setAPIName(" 12");//
		f.setServiceName(" st");//
		f.setVersion("12.3");//
		*/
		a.setAddressLine1(" askj");//
		a.setAddressLine2("masjid road");//
		a.setAddressline3("mh");//
		d.setChannelId("123 ");//
		d.setClientId("122");//
		d.setRequestId("433");//
		cd.setCardNumber("1234");//
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
	
		r.setClientDetails(d);
		r.setCustomerDetails(cd);
		r.setServiceDetails(f);
		return r;
	}
	@Test
	public void Test_Client_req_empty() {
		try {
			validator.ValidErrorReq(req);
			req.getClientDetails().setChannelId(" ");
			req.getClientDetails().setClientId(" ");
			req.getClientDetails().setRequestId(" ");
			
		} catch (EasReqInvalidException e) {
			// TODO Auto-generated catch block
			assertEquals("EA002", e.getErrorCode());
			e.printStackTrace();
		}
	}

	@Test
	public void Test_Customer_req_empty() {
		try {
			validator.ValidErrorReq(req);
			req.getCustomerDetails().setCardNumber(" ");
			req .getCustomerDetails().setCity(" ");
			req.getCustomerDetails().setCountery(" ");
			req.getCustomerDetails().setDOB(" ");
			req.getCustomerDetails().setExpiryDate(" ");
			req.getCustomerDetails().setFirstName(" ");
			req.getCustomerDetails().setLastName(" ");
			req.getCustomerDetails().setMiddelName(" ");
			req.getCustomerDetails().setPostal(" ");
			req.getCustomerDetails().setTital(" ");
			
			
		} catch (EasReqInvalidException e) {
			// TODO Auto-generated catch block
			assertEquals("EA003", e.getErrorCode());
			e.printStackTrace();
		}
	}
	@Test
	public void Test_Service_req_empty() {
		try {
			
			validator.ValidErrorReq(req);
			req.getServiceDetails().setAPIName(" " );
			req.getServiceDetails().setServiceName(" ");
			req.getServiceDetails().setVersion(" ");
		} catch (EasReqInvalidException e) {
			assertEquals("AE004", e.getErrorCode());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
