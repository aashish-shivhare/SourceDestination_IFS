package com.ifs.service;

import java.util.ArrayList;
import java.util.List;

import com.ifs.domain.DT1;
import com.ifs.domain.DT2;
import com.ifs.domain.ST1;
import com.ifs.domain.ST2;

@org.springframework.stereotype.Service
public class Service {
	
	public List<Object> getAllSourceTable()
	{
		List<Object> list = new ArrayList<>();
		list.add(new ST1("Aashish", "ashivhare@nisum.com", 0987654321D));
		list.add(new ST2("Akshadha", "akadam@nisum.com", 0987654321D));
		
		return list;
	}
	
	public Object getSourceTableByName(String TableName)
	{
		return new ST1("Aashish", "ashivhare@nisum.com", 0987654321D);
	}
	
	
	public List<Object> getAllDestinationTable()
	{
		List<Object> list = new ArrayList<>();
		list.add(new DT1("Aashish", "ashivhare@nisum.com", 0987654321D));
		list.add(new DT2("Akshadha", "akadam@nisum.com", 0987654321D));
		
		return list;
	}
	
	public Object getDestinationTableByName(String TableName)
	{
		return new DT1("Aashish", "ashivhare@nisum.com", 0987654321D);
	}
		

}
