package com.hua.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface WS_Interface {
	
	@WebMethod
	int countAvailability(String name);
	
	
	@WebMethod
	String searchbyBC(Long barcode);
	
	@WebMethod
	String getPurchase(Long barcode);
}
