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
	public String getPurchase(Long barcode) {
		// TODO Auto-generated method stub
		return pm.Purchase(barcode);
	}

}
