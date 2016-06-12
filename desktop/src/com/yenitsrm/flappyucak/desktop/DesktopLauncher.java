package com.yenitsrm.flappyucak.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.yenitsrm.flappyucak.FlappyUcak;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = 800;
        config.height = 480;

		new LwjglApplication(new FlappyUcak(), config);
	}
}
