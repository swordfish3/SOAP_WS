package com.hua.ws;

import com.hua.ws.db.PharmacyManager;

public class AvailabilityWS implements WS_Interface {
	
	PharmacyManager pm = new PharmacyManager();

	@Override
	public int countAvailability(String name) {
		return pm.getAvailability(name);
		
	}

	@Override
	public String searchbyBC(Long barcode) {
		// TODO Auto-generated method stub
		return pm.SearchBarcode(barcode);
	}
	
	@Override
	public void getPurchase(String name) {
		// TODO Auto-generated method stub
		 pm.Purchase(name);
	}

}
