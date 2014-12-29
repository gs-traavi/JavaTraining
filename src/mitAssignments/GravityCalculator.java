package mitAssignments;

public class GravityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double gravity = -9.81;
  double initialVelocity = 0.0;
  double fallingTime = 10.0;
  double initialPosition=0.0;
  double finalPosition=0.0;
  finalPosition = (0.5*gravity*fallingTime*fallingTime)+(initialVelocity*fallingTime)+initialPosition;
  //System.out.println("The object's position after"+fallingTime+"seconds is"+finalPosition+"m.");
	System.out.format("The object's position after %.1f seconds is %.1f m.",fallingTime,finalPosition);
	}

}
/*Output of unmodified program:-
 *    The object's position after10.0seconds is0.0m.
 */

/*Output of modified program:-
 * The object's position after 10.0 seconds is -490.5 m. 
 */