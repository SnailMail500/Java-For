public class Main {
    public static void main (String[] args){
        for (int i = 0; i < 5; i++){//i as integer, i is less than 5, i increment 1
            System.out.println(i);//this will print i from 0 to 4
        }

        //for each:
        String[] cars = {"Audi", "Volvo", "VW", "Mercedes"};//array (scary!)
        for (String i : cars){//for each item in the array, 
            System.out.println(i);//print array[item]
        }
    }
}
