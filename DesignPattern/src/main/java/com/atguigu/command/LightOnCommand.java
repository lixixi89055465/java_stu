package com.atguigu.command;

public class LightOnCommand implements Command{


	public LightOnCommand(com.atguigu.command.LightReceiver lightReceiver) {
		super();
		LightReceiver = lightReceiver;
	}

	//聚合LightReceiver 
	LightReceiver LightReceiver;
	@Override
	public void execute() {
		//调用接收者的方法 
		LightReceiver.on();
	}

	@Override
	public void undo() {
		//调用接收者的方法 
		LightReceiver.off();
	}


}
