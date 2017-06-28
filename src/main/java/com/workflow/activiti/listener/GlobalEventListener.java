package com.workflow.activiti.listener;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Activiti的全局事件监听器，即所有事件均需要在这里统一分发处理
 * @author xiams
 *
 */
@Component
public class GlobalEventListener implements ActivitiEventListener{
	private Logger log = LoggerFactory.getLogger(GlobalEventListener.class);
	
	@Override  
	public void onEvent(ActivitiEvent event) {  
		String eventType=event.getType().name();  
		log.info("envent type is ========>{}", eventType); 
	 }  
	  
	 @Override  
	 public boolean isFailOnException() {  
		 return false;  
	 }  
	  
	 

}
