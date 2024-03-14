import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //creating array
        int numbars[] = new int[1000];

        Scanner scan = new Scanner(System.in);

        //placeholder variable
        int empty = 0;

        //looping until ctrl+d
        while(scan.hasNextLine()){

            String line = scan.nextLine();
            int currentNum = Integer.parseInt(line);

            //checking for duplicates
            if(!check(numbars, currentNum)){
                numbars[empty++] = currentNum;
            }



        }
        //creating new shortened array that will get printed
        int newArr[] = new int[empty];

        for(int j = 0; j < empty; j++){
            newArr[j] = numbars[j];


        }
        //printing final array
        System.out.println("Final array: "+Arrays.toString(newArr));

    }
    public static boolean check(int[] arr, int num){
        for(int k = 0; k < arr.length; k++){
            //if number has been written before
            if(arr[k] == num){
                System.out.println("duplicate detected");
                return true;
            }
        }
        System.out.println("new number");
        return false;
    }
}