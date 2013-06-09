package com.exemplo.spring.output;

public class OutputHelper {
	private IOutputGenerator outputGenerator;
	
	public OutputHelper(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
	
	public void generateOuput() {
		outputGenerator.generateOutput();
	}
	
//	public void setOutputGenerator(IOutputGenerator outputGenerator) {
//		this.outputGenerator = outputGenerator;
//	}
}