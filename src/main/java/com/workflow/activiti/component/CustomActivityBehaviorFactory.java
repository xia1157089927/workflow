package com.workflow.activiti.component;

import org.activiti.bpmn.model.ExclusiveGateway;
import org.activiti.engine.impl.bpmn.parser.factory.DefaultActivityBehaviorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.workflow.activiti.gateway.CustomExclusiveGateway;

/**
 * 扩展缺省的流程节点默认工厂类，实现对Activiti节点的执行的默认行为的更改
 * @author xiams
 * @version 1.0
 * @date 2017-06-28 15:10:37
 */
@Component
public class CustomActivityBehaviorFactory extends DefaultActivityBehaviorFactory {
	@Autowired
	private CustomExclusiveGateway customExclusiveGateway; //自定义 排他网关
	
	//重写父类中的分支条件行为执行类
	@Override
	public CustomExclusiveGateway createExclusiveGatewayActivityBehavior(ExclusiveGateway exclusiveGateway) {
		return customExclusiveGateway;
	}
	
}
