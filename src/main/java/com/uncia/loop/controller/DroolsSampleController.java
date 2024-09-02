package com.uncia.loop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.loop.model.GuarantorDeviation;
import com.uncia.loop.model.Response;
import com.uncia.loop.service.DroolsService;

@RestController()
@RequestMapping("/ruleservice")
public class DroolsSampleController {

	@Autowired
	 private DroolsService bankService;
	 
	 @PostMapping("/getOD")
	 public ResponseEntity<Response> getRate(@RequestBody GuarantorDeviation guarantorDeviation){
	  Response response = bankService.getResponse(guarantorDeviation);
	  return new ResponseEntity<>(response, HttpStatus.OK);
	 }
	
//	 @PostMapping("/getOD")
//	 public ResponseEntity<Response> getRate(@RequestBody List<Deviation> guarantorList){
//	  Response response = bankService.getResponse(guarantorList);
//	  return new ResponseEntity<>(response, HttpStatus.OK);
//	 }
}
