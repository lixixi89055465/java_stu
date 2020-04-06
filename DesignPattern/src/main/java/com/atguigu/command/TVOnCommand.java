package com.atguigu.command;

public class TVOnCommand implements Command{

	//聚合LightReceiver 
	TVReceiver tvReceiver;
	
	
	public TVOnCommand(TVReceiver tvReceiver) {
		super();
		this.tvReceiver = tvReceiver;
	}

	@Override
	public void execute() {
		//调用接收者的方法 
		tvReceiver.off();
	}

	@Override
	public void undo() {
		//调用接收者的方法 
		tvReceiver.on();
	}


}
