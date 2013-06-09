package com.exemplo.spring.output;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exemplo.spring.beans.SchedulerBo;

@Configuration
public class SchedulerConfig {
	@Bean(name = "scheduler")
	public SchedulerBo schedulerBo() {
		return new SchedulerBo();
	}
}