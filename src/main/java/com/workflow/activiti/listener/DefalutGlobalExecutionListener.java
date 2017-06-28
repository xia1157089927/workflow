package com.workflow.activiti.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * activiti默认 全局监听
 * @author xiams
 * @version 1.0
 * @date 2017-06-28 11:15:31
 */
@Component
public class DefalutGlobalExecutionListener implements ExecutionListener{
	private static final long serialVersionUID = 1L;
	private Logger log = LoggerFactory.getLogger(DefalutGlobalExecutionListener.class);
	
	/**
	 * start、end、take的时候调用。take是监控连线的时候使用的。
	 */
	@Override
	public void notify(DelegateExecution execution) throws Exception {
		String eventName = execution.getEventName();
		log.info("DefalutGlobalExecutionListener --> eventName: {} ", eventName);
	}

}
