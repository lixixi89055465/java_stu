package com.atguigu.command;


public class RemoteController {
	// 开按钮的命令数组
	Command[] onCommands;
	Command[] offCommands;

	Command undoCommand;

	// 构造器，完成对按钮的初始化
	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}

	// 给我们的按钮设置你需要的命令
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}

	// 按下开按钮
	public void onButtonWasPushed(int no) {
		// 找到你按下的你开的按钮，并调用对应的方法
		onCommands[no].execute();
		//记录这次的操作，用于撤销 
		undoCommand=onCommands[no];
	}
	//按下关按钮 
	public void offButtonWasPushed(int no) {
		offCommands[no].execute();
		undoCommand=onCommands[no];
	}
	//按下撤销按钮 
	public void undoButtonWasPushed(int no) {
		undoCommand.execute();
		System.out.println("----------命令被撤销 -----------");
	}
}
