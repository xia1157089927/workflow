package com.workflow.activiti.listener.task;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 默认 任务监听器
 * @author xiams
 * @version 1.0
 * @date 2017-06-29 09:48:17
 */
@Component
public class DefaultUserTaskListener implements TaskListener{
	private static final long serialVersionUID = 1L;
	private Logger log = LoggerFactory.getLogger(DefaultUserTaskListener.class);
	
	@Override
	public void notify(DelegateTask delegateTask) {
		String eventName = delegateTask.getEventName();
		String name = delegateTask.getName();
		log.info("默认 任务监听器 eventName:-->{}, name：{} ", eventName, name);
	}

}
