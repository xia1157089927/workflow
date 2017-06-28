package com.workflow.activiti.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.test.ActivitiRule;
import org.activiti.engine.test.Deployment;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.workflow.activiti.AbstractTestBase;

public class Apply2Test extends AbstractTestBase{
	@Autowired
	private RuntimeService runtimeService;  // 注入运行服务类
	@Autowired
	private TaskService taskService; // 注入任务服务类
	
	@Autowired
	@Rule
	public ActivitiRule activitiSpringRule;
	
	/**
	 * 测试部署流程
	 */
	@Test
    @Deployment(resources="processes/apply2.bpmn")
    public void deploymentProcessTest() {
		// 根据key来启动流程实例
		ProcessInstance processInstance =  runtimeService.startProcessInstanceByKey("myProcess");
		// 获取单个任务
        List<Task> tasks = taskService.createTaskQuery().deploymentId(processInstance.getDeploymentId()).taskAssignee("usertask_1").list();
        log.info("tasks.size:==>{}", tasks.size());
		for (Task task : tasks) {
			String taskId = task.getId();
			String assignee = task.getAssignee();
			String taskName = task.getName();
			log.info("taskId: {}, assignee: {}, taskName:{} ", taskId, assignee, taskName);
			Map<String, Object> value = new HashMap<>();
			value.put("skip", 3);
			taskService.complete(taskId, value);
		}
		
    }
	
}
