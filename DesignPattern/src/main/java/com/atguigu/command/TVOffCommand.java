package com.atguigu.command;

public class TVOffCommand implements Command{

	//聚合LightReceiver 
	TVReceiver tvReceiver;
	
	
	public TVOffCommand(TVReceiver tvReceiver) {
		super();
		this.tvReceiver = tvReceiver;
	}

	@Override
	public void execute() {
		//调用接收者的方法 
		tvReceiver.on();
	}

	@Override
	public void undo() {
		//调用接收者的方法 
		tvReceiver.off();
	}


}
