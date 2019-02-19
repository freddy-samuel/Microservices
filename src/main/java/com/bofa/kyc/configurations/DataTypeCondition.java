package com.bofa.kyc.configurations;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataTypeCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
		// TODO Auto-generated method stub
		String type = System.getProperty("dbType");
		return (type != null);
	}

}
