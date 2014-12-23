package basics;
/*Guessing Game:-
 *                The Guessing Game invovles a 'game' object and three 'player' objects.
 *                The game generates a number between 0 and 9,
 *                the three player objects try to guess it
 */

public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	GuessGame game = new GuessGame();
	game.startGame();
	}
}
/*output:-
 *
I'm thinking of a number between 0 and 9...
Number to guess is3
I'm Guessing0
I'm Guessing9
I'm Guessing8
Player one guessed is 0
Player two guessed is 9
Player three guessed is 8
Player will have to try again
Number to guess is3
I'm Guessing4
I'm Guessing1
I'm Guessing1
Player one guessed is 4
Player two guessed is 1
Player three guessed is 1
Player will have to try again
Number to guess is3
I'm Guessing9
I'm Guessing0
I'm Guessing7
Player one guessed is 9
Player two guessed is 0
Player three guessed is 7
Player will have to try again
Number to guess is3
I'm Guessing3
I'm Guessing9
I'm Guessing0
Player one guessed is 3
Player two guessed is 9
Player three guessed is 0
We have winner!
Player one got it Right?true
Player two got it Right?false
Player three got it Right?false
Game is over .
 *  
 *  
 *  */

