package com.uncia.loop.model;

import java.util.ArrayList;
import java.util.List;

public class GuarantorDeviation {

	private List<Deviation> listOfDeviation;

	public List<Deviation> getListOfDeviation() {
		return listOfDeviation;
	}

	public void setListOfDeviation(List<Deviation> listOfDeviation) {
		this.listOfDeviation = listOfDeviation;
	}

	 public void addDeviation(Deviation deviation) {  
         if (listOfDeviation == null) {  
        	 listOfDeviation = new ArrayList<Deviation>();  
         }  
         listOfDeviation.add(deviation);
    } 
}
