package com.workflow.activiti.gateway;

import org.activiti.engine.impl.bpmn.behavior.EventBasedGatewayActivityBehavior;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 自定义 事件网关
 * @author xiams
 * @version 1.0
 * @date 2017-06-28 16:19:10
 */
@Component
public class CustomEventGateway extends EventBasedGatewayActivityBehavior{
	private static final long serialVersionUID = 1L;
	private Logger log = LoggerFactory.getLogger(CustomEventGateway.class);
	
	@Override
	public void execute(ActivityExecution execution) throws Exception {
		log.info("自定义 事件网关:---->");
		// the event based gateway doesn't really do anything
	    // ignoring outgoing sequence flows (they're only parsed for the diagram)
	}
	
}
