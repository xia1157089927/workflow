package com.workflow.activiti.identity;

import org.activiti.engine.impl.persistence.entity.GroupEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.workflow.service.CustomGroupService;

@Component
public class CustomGroupEntityManager extends GroupEntityManager{
	@Autowired
	private CustomGroupService customGroupService;
	
	public void temp(){
		customGroupService.hashCode();
	}
	
}
