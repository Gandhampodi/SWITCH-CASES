package SwitchCase;

public class Colour {
    public static void main(String[] args) {
            String colour="B";
            switch(colour){
                case "R":
                    System.out.println("Red colour");
                    break;
                case "B":
                    System.out.println("Blue colour");
                    break;
                case "g":
                    System.out.println("Green colour");
                default:
                    System.out.println("Unknown colour");
            }
    }
}
