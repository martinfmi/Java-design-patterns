package com.toshev.martin.patterns.behavioral.interpreter;

public class MultilineCiscoIOSExpression extends CiscoIOSExpression {

	private CiscoIOSExpression[] expressions;
	
	public MultilineCiscoIOSExpression(CiscoIOSExpression[] expressions) {
		this.expressions = expressions;
	}
	
	public void execute(CiscoIOSContext context) {
		for( CiscoIOSExpression expession : expressions) {
			expession.execute(context);
		}
	}
	
}
