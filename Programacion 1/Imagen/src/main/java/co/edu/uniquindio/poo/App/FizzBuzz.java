package co.edu.uniquindio.poo.App;

public class Main2 {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        for (int num = 0; num < 51; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (num % 3 == 0) {
                System.out.println("Fizz");
            }else if (num % 5 == 0) {
                System.out.println("Buzz");
            }else{
                System.out.println(num);
            }
        }
    }
}


