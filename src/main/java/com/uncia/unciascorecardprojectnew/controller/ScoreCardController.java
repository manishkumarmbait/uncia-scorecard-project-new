package com.uncia.unciascorecardprojectnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uncia.unciascorecardprojectnew.model.BankReport;
import com.uncia.unciascorecardprojectnew.model.EmployeeSalary;
import com.uncia.unciascorecardprojectnew.service.ScorecardService;

@RestController
@RequestMapping("/api")
public class ScoreCardController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private ScorecardService scorecardService;
	
	@GetMapping("/bankReport")
	public ResponseEntity<BankReport> getCreditSummaryScore(@RequestParam String id)
			throws JsonMappingException, JsonProcessingException {
		BankReport bankReport = scorecardService.getCreditSummaryScore(id);
		return new ResponseEntity<>(bankReport, HttpStatus.OK);
	}

	@GetMapping("/salaryReport")
	public ResponseEntity<EmployeeSalary> getsalaryReport(@RequestParam String id)
			throws JsonMappingException, JsonProcessingException {
		EmployeeSalary salaryReport = scorecardService.getsalaryReport(id);
		return new ResponseEntity<>(salaryReport, HttpStatus.OK);
	}
	
}
