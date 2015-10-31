package test;

import sdljava.SDLMain;
import sdljava.video.SDLSurface;
import sdljava.video.SDLVideo;

public class TestSDL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String caption = "SDL Test";
		try {
			SDLMain.init(SDLMain.SDL_INIT_VIDEO);
			SDLVideo.wmSetCaption(caption, caption);
			SDLSurface screen = SDLVideo.setVideoMode(640, 480, 24, 0);
			Thread.sleep(2500);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			SDLMain.quit();
		}
	}

}
