package package1;
import package2.SecondClass;


public class Main {
  public static void main(String[] args) {
    System.out.println("Now accessing Main");
    
    SecondClass secondClass = new SecondClass();
    secondClass.call();
  }
}
