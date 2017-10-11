public class Assessment {

    public static int square(int x){
        return x * x;
    }

    public static double sum(int a, int b){
        return a + b;
    }

    public static double average(int[] numbers){
        int sum = 0;
        for(Integer average : numbers){
            sum += average;
        }
        double total = sum / (double)numbers.length;
        return total;
    }

    public static void main(String[] args){
        Person myPerson = new Person("Alex", "Potter");

        System.out.println("5 squared is: " + square(10));
        System.out.println("The sum of two numbers: " + sum(20,15));

        int[] arrayOfNumbers = {2, 4, 5, 6, 5, 10,};
        System.out.println("the average of the array is: " + average(arrayOfNumbers));

        myPerson.sayHello();

    }



}
