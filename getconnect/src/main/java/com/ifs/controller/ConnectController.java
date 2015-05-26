package com.ifs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ifs.domain.DT1;
import com.ifs.domain.ST1;
import com.ifs.service.Service;

@Controller
public class ConnectController {
	
	private static final Logger logger = LoggerFactory.getLogger(ConnectController.class);
	
	@Autowired
	private Service service;
	
	@RequestMapping(value = "/getsourcetable", method = RequestMethod.GET)
	public ResponseEntity<List<Object>> getAllSourceTable() {
		logger.info("Starts to get all Source Table");
		return new ResponseEntity<List<Object>>(service.getAllSourceTable(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getsourcetable/{tablename}", method = RequestMethod.GET)
	public @ResponseBody ST1 getSourceTableByName(@PathVariable("tablename") String tablename) {
		logger.info("Starts to get " + tablename + " Source Table");
		ST1 connect = (ST1)service.getSourceTableByName(tablename);
		return connect;
	}
	
	@RequestMapping(value = "/getdestinationtable", method = RequestMethod.GET)
	public ResponseEntity<List<Object>> getAllDestinationTable(){
		logger.info("Starts to get all Destination Table");
		return new ResponseEntity<List<Object>>(service.getAllDestinationTable(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getdestinationtable/{tablename}", method = RequestMethod.GET)
	public  @ResponseBody DT1 getDestinationTableByName(@PathVariable("tablename") String tablename){
		logger.info("Starts to get " + tablename + " Destination Table");
		DT1 connect = (DT1)service.getDestinationTableByName(tablename);
		return connect;
	}

}
