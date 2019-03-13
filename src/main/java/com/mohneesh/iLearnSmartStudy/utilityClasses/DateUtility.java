package com.mohneesh.iLearnSmartStudy.utilityClasses;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class DateUtility {

	 
		
		@Bean
		public Date getCreateDate() {
			return new Date();
		}
		
		@Bean
		public Date getUpdatedDate() {
			return new Date();
		}
		
}
