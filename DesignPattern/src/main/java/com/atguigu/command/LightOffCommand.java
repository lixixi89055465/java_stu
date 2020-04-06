package com.atguigu.command;

public class LightOffCommand implements Command{
	LightReceiver lightReceiver;
	public LightOffCommand(LightReceiver lightReceiver) {
		super();
		this.lightReceiver=lightReceiver;
	}
	@Override
	public void execute() {
		lightReceiver.off();
	}
	@Override
	public void undo() {
		lightReceiver.on();
	}
	

}
