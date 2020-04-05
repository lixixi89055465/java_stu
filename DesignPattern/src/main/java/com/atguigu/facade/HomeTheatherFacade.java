package com.atguigu.facade;

public class HomeTheatherFacade {
	// 定义各个子系统的对象
	private TheatherLight theatherLight;
	private Popcorn popcorn;
	private Stereo stereo;
	private Projector projector;
	private Screen screen;
	private DVDPlayer dvdPlayer;

	public HomeTheatherFacade() {
		super();
		this.theatherLight = TheatherLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.stereo = Stereo.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.dvdPlayer = DVDPlayer.getInstance();
	}

	public void ready() {
		popcorn.on();
		popcorn.pop();
		theatherLight.on();
		screen.down();
		projector.on();
		stereo.on();
		dvdPlayer.on();
		theatherLight.dim();
	}

	public void play() {
		dvdPlayer.play();
	}

	public void pause() {
		dvdPlayer.pause();
	}

	public void end() {
		popcorn.off();
		theatherLight.off();
		screen.down();
		projector.off();
		stereo.off();
		dvdPlayer.off();
		theatherLight.off();
	}

	public static void main(String[] args) {
		// 同爱调用
	}

}
