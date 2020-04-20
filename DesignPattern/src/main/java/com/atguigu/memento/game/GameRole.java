package com.atguigu.memento.game;


/**
 * @author LiXiang
 * @version 创建时间：Apr 12, 2020 类说明
 */
public class GameRole {
	// 攻击力
	private int vit;
	// 防御力
	private int def;


	// 创建memento,即根据当前的状态得到Memento
	public Memento createMemento() {
		return new Memento(vit, def);
	}

	// 从备忘录对象，恢复GameRole的状态
	public void recoverGameRole(Memento memento) {
		this.vit = memento.getVit();
		this.def = memento.getDef();
	}

	// 显示当前游戏角色的状态
	public void display() {
		System.out.println("游戏角色当前的攻击力:" + this.vit + " 防御力: " + this.def);
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	
}
