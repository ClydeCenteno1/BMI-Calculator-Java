import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int weight;
        double height;

        System.out.println("BMI Calculator");

        System.out.print("Input your weight: ");
        weight = scanner.nextInt();

        System.out.print("Input your height (in meters): ");
        height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        System.out.printf("Your BMI is %.2f%n",bmi);

        //BMI Categories

        System.out.println("BMI Categories");

        if(bmi <= 18.5){
            System.out.println("You are underweight");
        }

        else if (bmi < 25){
            System.out.println("You are healthy");
        }

        else if(bmi <30){
            System.out.println("You are overweight");
        }

        else{
            System.out.println("You are obese");
        }

        scanner.close();

    }
}
