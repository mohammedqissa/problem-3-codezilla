/**
 * Created by mohammedissa on 5/19/16.
 */
public class Main {


    public static void main(String[] args0){


        int size = 10;
        int[] ints = new int[size];

        for(int i =0 ; i < ints.length-1 ; i++){

            if(ints[i] == ints [i+1]){
                System.out.println(ints[i] + " is duplicated");
            }


        }




    }


}
