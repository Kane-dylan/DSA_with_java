package basic;
import java.util.*;
public class Switch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    switch(button) {
      case 1:
        System.out.println("hi");
        break;
      case 2:
        System.out.println("namaste");
        break;
      case 3:
        System.out.println("bonjour");
        break;
    
      default:
        System.out.println("You ate pressing wrong button !!!\n try agin");
        break;
    }

    sc.close();
  }
}
