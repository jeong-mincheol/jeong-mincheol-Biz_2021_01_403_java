package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1;

public class FileWriter_05 {
	
	public static void main(String[] args) {
		
		RndServiceImplV1 rsiV1 = new RndServiceImplV1();
		
		rsiV1.makeRnd();
		rsiV1.saveFileRnd();
		
	}

}