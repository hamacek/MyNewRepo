//SONAR_4 : Move this file to a named package.

//REFACTOR - Lazy Class
  public class MainClass {

	//REFACTOR - Long Method
  public static void main(String[] args) {
//SONAR_5 : Remove this unused "x" local variable.
//SONAR_6 : Remove this useless assignment to local variable "x".
		int x = 5;
//SONAR_6_END
//SONAR_5_END
//SONAR_7 : Replace this use of System.out or System.err by a logger.
		System.out.println("Hello from my test app!!");
//SONAR_7_END

	}

}
