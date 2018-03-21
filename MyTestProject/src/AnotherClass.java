//SMELL: #SmellType(Move this file to a named package. [SONAR])
//SMELL: #SmellType(Add a private constructor to hide the implicit public one. [SONAR])

//SMELL: #SmellType(Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. [SONAR])
//SMELL: #SmellType(Replace this use of System.out or System.err by a logger. [SONAR])
//REFACTOR - Lazy Class
  //SMELL: #SmellType(Lazy Class)
 public class AnotherClass {
	
	public static void Print(){
		System.out.println("x");
	}
}
