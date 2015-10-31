package sharl;

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

	
}
