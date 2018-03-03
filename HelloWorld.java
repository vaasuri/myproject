//prints hello world

public class HelloWorld {

  public static void main(String args[]) {
    System.out.println("Hello World");
    System.out.println(Message.getMessage());
    System.out.println("Num args = " + Integer.toString(args.length));
    for (int i=0; i<args.length; i++)
      System.out.println(args[i]);
  }
}

