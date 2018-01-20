//SONAR_0 : Move this file to a named package.

//SONAR_1 : Add a private constructor to hide the implicit public one.
//REFACTOR - Lazy Class
  public class AnotherClass {
//SONAR_1_END
	
//SONAR_2 : Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'.
	public static void Print(){
//SONAR_2_END
//SONAR_3 : Replace this use of System.out or System.err by a logger.
		System.out.println("x");
//SONAR_3_END
	}
}
