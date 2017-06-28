package com.workflow.activiti.delegate;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 默认的serviceTask
 * @author xiams
 * @version 1.0
 * @date 2017-06-28 17:27:00
 */
@Component
public class DefaultServiceTaskDelegate implements JavaDelegate {
	private Logger log = LoggerFactory.getLogger(DefaultServiceTaskDelegate.class);
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		log.info("默认的serviceTask:DefaultServiceTaskDelegate:---> {} ", execution.getEventName());
	}

}
