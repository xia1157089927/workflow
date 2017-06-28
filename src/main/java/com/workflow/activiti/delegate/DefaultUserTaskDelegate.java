package com.workflow.activiti.delegate;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 默认自定义UserTask
 * @author xiams
 *
 */
@Component
public class DefaultUserTaskDelegate implements JavaDelegate {
	private Logger log = LoggerFactory.getLogger(DefaultUserTaskDelegate.class);
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		log.info("默认的UserTask:DefaultUserTaskDelegate:---> {} ", execution.getCurrentActivityName() );
	}

}
