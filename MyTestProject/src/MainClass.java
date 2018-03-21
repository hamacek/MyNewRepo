//SMELL: #SmellType(Move this file to a named package. [SONAR])

//REFACTOR - Lazy Class
  //SMELL: #SmellType(Lazy Class)
 public class MainClass {

//SMELL: #SmellType(Remove this useless assignment to local variable "x". [SONAR])
//SMELL: #SmellType(Replace this use of System.out or System.err by a logger. [SONAR])
//SMELL: #SmellType(Remove this unused "x" local variable. [SONAR])
	public static void main(String[] args) {
		int x = 5;
		System.out.println("Hello from my test app!!");

	}

}
