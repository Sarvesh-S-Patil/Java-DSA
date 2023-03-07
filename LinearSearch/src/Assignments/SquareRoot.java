package Assignments;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(squareroot(num));
    }

     static int squareroot(int num) {
        int root = (int)Math.sqrt(num);
        return  root;
    }
}
