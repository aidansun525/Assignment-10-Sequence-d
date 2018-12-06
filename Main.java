public class Main {
    public static void main(String[] args) {
        perfectSquare();
        perfectCudes();
        fibonacciSequence();
        primeNumbers();
        triangleNumbers();

    }

    public static void perfectSquare(){
        int a = 1;
        System.out.println("First 10 Perfect Square:");
        while (a<=10) {
            int b = (int)Math.pow(a, 2);
            System.out.printf("%15d\n",b);
            a++;
        }
        System.out.println("-------------------------------\n");

    }

    public static void perfectCudes(){
        int a = 1;
        System.out.println("First 10 Perfect Cube:");
        while (a<=10) {
            int b = (int)Math.pow(a, 3);
            System.out.printf("%15d\n",b);
            a++;
        }
        System.out.println("-------------------------------\n");
    }

    public static void fibonacciSequence() {
        int c = 1;
        int a = 1;
        int b = 1;
        int n = 1;
        System.out.println("First 10 Fibonacci Sequence:");
        while (n <= 10) {
            System.out.printf("%15d\n", c);
            c= a+b;
            a = b;
            b = c;
            n++;
        }
        System.out.println("-------------------------------\n");
    }

    public static void primeNumbers(){
        int a=2;
        int x=1;
        System.out.println("First 10 Prime Numbers:");
        while (x<=10){
            int n=2;
            boolean prime = true;

            //a is divided by every number less than a
            //it's not prime if any mode = 0

             while (n<a) {
                 if (a%n!=0){
                     n++;
                 }
                 else {
                     prime = false;
                     n++;
                 }
             }

            if(prime) {
                System.out.printf("%15d\n",a);
                x++;
                a++;}
            else{
                a++;
                }
        }
        System.out.println("-------------------------------\n");
    }

    public static void triangleNumbers(){
        int a = 1;
        int b = 2;
        int n = 1;
        System.out.println("First 10 Triangle Number:");
        while (n<=10) {
            System.out.printf("%15d\n",a);
            a = a+b;
            b++;
            n++;
        }
        System.out.println("-------------------------------\n");
    }
}
