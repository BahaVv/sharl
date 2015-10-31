package sharl;
import sdljava.SDLMain;
import sdljava.video.SDLSurface;
import sdljava.video.SDLVideo;

public class Display {
	public SDLSurface screen;

	public Display() {
		String caption = "SDL Test";
		try {
			SDLMain.init(SDLMain.SDL_INIT_VIDEO);
			SDLVideo.wmSetCaption(caption, caption);
			screen = SDLVideo.setVideoMode(640, 480, 24, 0);
		} catch(Exception e) {
			e.printStackTrace();
			SDLMain.quit();
		}
	}
}
