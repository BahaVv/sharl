package sharl;

import sdljava.SDLException;
import sdljava.image.SDLImage;
import sdljava.ttf.SDLTTF;
import sdljava.ttf.SDLTrueTypeFont;
import sdljava.video.SDLColor;
import sdljava.video.SDLSurface;

/*
 * General Structure:
 * 		1) Show title card until key pressed
 * 		2) Prompt user for difficulty
 * 		3) Display difficulty intro
 * 		4) Generate world
 * 		5) Set necessary state variables for difficulty
 * 			-Turn timer, player injuries/inventory, etc
 * 		5) Enter main event loop
 * 		6) When player dies or wins, display ending text. Allow for exit or replay.
 */

/*
 * main event loop:
 * 		1) Begin counting down from 5 seconds.
 * 		2) If the player pushes a valid key during that five seconds, refresh the timer.
 * 			-If they do not, assume their command was 'wait'.
 * 			-Later we could do something here to make sure they aren't exploiting the inventory or something, but not now
 * 		3) Simulate world 
 * 			-Monster movement/decisions, player movement/decision, etc.
 * 		4) When player enters new floor, kick back to step 4 of general structure
 * 			-When doing so, increase difficulty modifier, and enable any systems as necessary
 * 		5) When player wins or dies, kick out to step 6 of general structure
 */

// Main function to run game.
public class Main {
	public static void main(String[] args) throws InterruptedException{
		Display display = new Display();
		try {
			//SDLTTF.init();
			//SDLTrueTypeFont font = SDLTTF.openFont("/usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf", 16);
			//SDLSurface text = font.renderTextSolid("", new SDLColor(255, 0, 0));
			//text.blitSurface(display.screen);
			SDLSurface image = SDLImage.load("/home/csguest/Downloads/Canterlot_Castle_Twilight_Sparkle_1.png");
			image.blitSurface(display.screen);
			display.screen.flip();
			Thread.sleep(5000);
		} catch (SDLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
