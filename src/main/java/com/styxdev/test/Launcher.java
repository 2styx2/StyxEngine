package com.styxdev.test;

import com.styxdev.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {
    public static void main(String[] args) {
        System.out.println(Version.getVersion());
        WindowManager window = new WindowManager("STYX ENGINE", 1600, 900, false);
        window.init();

        while (!window.windowShouldClose()) {
            window.update();
        }

        window.cleanup();

    }
}
