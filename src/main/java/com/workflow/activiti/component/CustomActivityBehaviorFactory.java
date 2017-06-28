package com.workflow.activiti.component;

import org.activiti.bpmn.model.EventGateway;
import org.activiti.bpmn.model.ExclusiveGateway;
import org.activiti.bpmn.model.InclusiveGateway;
import org.activiti.bpmn.model.ParallelGateway;
import org.activiti.engine.impl.bpmn.behavior.EventBasedGatewayActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.ExclusiveGatewayActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.InclusiveGatewayActivityBehavior;
import org.activiti.engine.impl.bpmn.behavior.ParallelGatewayActivityBehavior;
import org.activiti.engine.impl.bpmn.parser.factory.DefaultActivityBehaviorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.workflow.activiti.gateway.CustomEventGateway;
import com.workflow.activiti.gateway.CustomExclusiveGateway;
import com.workflow.activiti.gateway.CustomInclusiveGateway;
import com.workflow.activiti.gateway.CustomParallelGateway;

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
	@Autowired
	private CustomEventGateway customEventGateway; // 自定义 事件网关
	@Autowired
	private CustomInclusiveGateway customInclusiveGateway; // 自定义 相容网关
	@Autowired
	private CustomParallelGateway customParallelGateway; // 自定义 并行网关
	
	//重写父类中的分支条件行为执行类
	@Override
	public ExclusiveGatewayActivityBehavior createExclusiveGatewayActivityBehavior(ExclusiveGateway exclusiveGateway) {
		return customExclusiveGateway;
	}
	
	@Override
	public ParallelGatewayActivityBehavior createParallelGatewayActivityBehavior(ParallelGateway parallelGateway) {
	    return customParallelGateway;
	}

	@Override
	public InclusiveGatewayActivityBehavior createInclusiveGatewayActivityBehavior(InclusiveGateway inclusiveGateway) {
		return customInclusiveGateway;
	}

	@Override
	public EventBasedGatewayActivityBehavior createEventBasedGatewayActivityBehavior(EventGateway eventGateway) {
		return customEventGateway;
	}
	
}
