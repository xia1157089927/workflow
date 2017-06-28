package com.workflow.activiti.gateway;

import org.activiti.engine.impl.bpmn.behavior.InclusiveGatewayActivityBehavior;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 自定义 相容网关
 * @author xiams
 * @version 1.0
 * @date 2017-06-28 15:58:56
 */
@Component
public class CustomInclusiveGateway extends InclusiveGatewayActivityBehavior{
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(CustomInclusiveGateway.class);

	public void execute(ActivityExecution execution) throws Exception {
		log.info("自定义 相容网关:--->");
		super.execute(execution);
	}
}
