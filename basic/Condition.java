package basic;
import java.util.*;

public class Condition {
  public static void main(String args []){
    Scanner sc =  new Scanner(System.in);
    int age = sc.nextInt();

    if (age<18) {
      System.out.println("You are not an adult");
    } else {
      System.out.println("You are an adult");
      System.out.println("You can vote");
    }
    sc.close();
  }
}
