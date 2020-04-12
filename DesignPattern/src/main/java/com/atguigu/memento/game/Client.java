package com.atguigu.memento.game;

/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class Client {

	public static void main(String[] args) {
		// 创建游戏角色
		GameRole gameRole = new GameRole();
		gameRole.setVit(100);
		gameRole.setDef(100);
		System.out.println("和boss 大战前的状态");
		gameRole.display();
		// 把当前状态保存到caretaker
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(gameRole.createMemento());

		System.out.println("和boss大战～～～～");
		gameRole.setDef(30);
		gameRole.setVit(30);
		gameRole.display();
		System.out.println("大战后，使用备忘录对象恢复到战前  ");
		gameRole.recoverGameRole(caretaker.getMemento());
		System.out.println("恢复后的状态");
		gameRole.display();
	}

}
