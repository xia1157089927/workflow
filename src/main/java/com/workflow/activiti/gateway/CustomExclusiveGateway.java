package com.workflow.activiti.gateway;

import org.activiti.engine.impl.bpmn.behavior.ExclusiveGatewayActivityBehavior;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 对网关的条件判断，优先使用扩展的配置
 * 自定义排他网关
 * @author xiams
 * @version 1.0
 * @date 2017-06-28 11:55:34
 */
@Component
public class CustomExclusiveGateway extends ExclusiveGatewayActivityBehavior{
	private static final long serialVersionUID = 1L;
	private Logger log = LoggerFactory.getLogger(CustomExclusiveGateway.class);
	
	@Override
	protected void leave(ActivityExecution execution){
		log.info("自定义网关ActivityBehaviorExtExclusiveGateway-------------");
		
		//执行父类的写法，以使其还是可以支持旧式的在跳出线上写条件的做法  
		super.leave(execution);
	}

}
