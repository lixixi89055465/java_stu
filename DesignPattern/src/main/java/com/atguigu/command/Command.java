package com.atguigu.command;

//创建命令接口 
public interface Command {
	//执行某个命令
	public void  execute() ;
	//撤销某个命令
	public void  undo() ;

}
