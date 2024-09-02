package com.uncia.loop.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncia.loop.model.GuarantorDeviation;
import com.uncia.loop.model.Response;


@Service
public class DroolsService {

	@Autowired
	private KieContainer kieContainer;

//	public Rate getRate(Participant applicantRequest) {
//		Rate rate = new Rate();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("rate", rate);
//		kieSession.insert(applicantRequest);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return rate;
//	}

	public Response getResponse(GuarantorDeviation guarantorDeviation) {
		Response response = new Response();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.setGlobal("response", response);
		kieSession.insert(guarantorDeviation);
		kieSession.fireAllRules();
		kieSession.dispose();
		return response;
	}
	
//	public Response getResponse(List<Deviation> guarantorList) {
//		Response response = new Response();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("response", response);
//		kieSession.insert(guarantorList);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return response;
//	}
	
}
