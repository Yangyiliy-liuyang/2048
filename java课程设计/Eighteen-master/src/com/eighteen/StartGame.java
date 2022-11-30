package com.eighteen;

import java.io.IOException;

/**
 * 游戏启动类
 */
public class StartGame {
	public static void main(String[] args) throws IOException, InterruptedException {
		GamePanel frame = new GamePanel();
		//设置可见，防止界面看起来一闪一闪的不美观。
		frame.setVisible(true);
	}
}
