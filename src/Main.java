import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ExerciseOne();
        //ExerciseTwo();
        // ExerciseThree();
        //ExerciseFour();
       // ExerciseFive();
      //  ExerciseSix();


    }
    public static void ExerciseOne(){
        Scanner input = new Scanner(System.in);

        String userInput = "";
        ArrayList<Integer> numbers = new ArrayList<>();

        do{
            System.out.println("Enter number or type out to exit : ");
            userInput = input.nextLine();
            if(userInput.equals("out")){
                break;
            }
            numbers.add(Integer.parseInt(userInput));
        }while(true);

        System.out.println(numbers );
        if(numbers.get(0) != numbers.get(numbers.size()-1)){
            System.out.println("False");
        }else
            System.out.println("True");


    }

    public static void ExerciseTwo(){
        Scanner input = new Scanner(System.in);

        String userInput = "";
        ArrayList<Integer> numbers = new ArrayList<>();

        do{
            System.out.println("Enter number or type out to exit : ");
            userInput = input.nextLine();
            if(userInput.equals("out")){
                break;
            }
            numbers.add(Integer.parseInt(userInput));
        }while(true);

        int sumNumbers = 0;
        for(int item : numbers){
            sumNumbers += item;
        }
        double Average =(double)(sumNumbers/numbers.size());

        ArrayList<Integer> numbersLargeThenAverage = new ArrayList<>();

        for(int item : numbers){
            if(item > Average){
                numbersLargeThenAverage.add(item);
            }
        }
        System.out.println("Array numbers Entered : "+numbers+"\n"+
                "Average array number : ="+ Average+"\n"+
                "Number large then average array number : "+numbersLargeThenAverage);
    }

    public static void ExerciseThree(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String userInput = "";

        do{
            System.out.println("Enter number or type out to exit : ");
            userInput = input.nextLine();
            if(userInput.equals("out")){
                break;
            }
            numbers.add(Integer.parseInt(userInput));
        }while(true);

        System.out.println(numbers);
        System.out.println("Larger value between first and last element = "
                +(numbers.get(0) > numbers.get(numbers.size()-1) ?numbers.get(0)  : numbers.get(numbers.size()-1)  ));

    }

    public static void ExerciseFour(){
        Scanner input = new Scanner(System.in);
        String userInput = "";
        ArrayList<Integer> numbers = new ArrayList<>();
        do{
            System.out.println("Enter number or type out to exit : ");
            userInput = input.nextLine();
            if(userInput.equals("out")){
                break;
            }
            numbers.add(Integer.parseInt(userInput));
        }while(true);

        ArrayList<Integer> swapNumbers = numbers;
        int firstnumber = numbers.get(0);
        int lastnumber = numbers.get(numbers.size()-1);
        swapNumbers.set(0,lastnumber);
        swapNumbers.set(numbers.size()-1,firstnumber);

        System.out.println("Swapped Array : "+swapNumbers);

    }

    public static void ExerciseFive(){
        Scanner input = new Scanner(System.in);
        String userInput = "";
        ArrayList<Integer> numbers = new ArrayList<>();
        do{
            System.out.println("Enter number or type out to exit : ");
            userInput = input.nextLine();
            if(userInput.equals("out")){
                break;
            }
            numbers.add(Integer.parseInt(userInput));
        }while(true);

        ArrayList<Integer> sortEvenAndOddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for(int item : numbers){
            if(item % 2 == 0){
                evenNumbers.add(item);
            }else oddNumbers.add(item);
        }
        for(int item : oddNumbers){
            sortEvenAndOddNumbers.add(item);
        }
        for(int item : evenNumbers){
            sortEvenAndOddNumbers.add(item);
        }


        System.out.println(sortEvenAndOddNumbers);


    }

    public static void ExerciseSix(){
        int[] numbers1 = {2,3,6,6,4};
        int[] numbers2 = {2,3,6,6,4};
        boolean isEquality = true;

        for (int i = 0; i < numbers1.length; i++) {
            if(numbers1[i] != numbers2[i]){

                isEquality = false;
                break;
            }
        }

        System.out.println(isEquality);
    }
}