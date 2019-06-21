import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {

//● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array.
//    Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above,
//    it should return an array with the values of 13,25,32)


    public static Object[] prob1() {
        int sum = 0;
        int[] a = getIntArray();
        ArrayList<Integer> retVal = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (a[i] > 10) {
                retVal.add(a[i]);
            }
        }
        System.out.println("The sum is =  " + sum);

        return retVal.toArray();

    }

    public static int[] getIntArray() {
        int[] numbers = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};


        return numbers;
    }

 //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person.
    //Have the method also return an array with names that are longer than 5 characters.

        public static ArrayList<String>  prob2(){
            String[] namearr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};

            ArrayList newarr = new ArrayList();
            List list = Arrays.asList(namearr);
            Collections.shuffle(list);
            for(String name : namearr){
                Collections.shuffle(list);
                if (name.length()>5){
                    newarr.add(name);
                }
            }
            return newarr;
        }
    //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array.
    //If the first letter in the array is a vowel, have it display a message.

        public static void prob3(){
            String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            Collections.shuffle(Arrays.asList(alphabet));
            String first = alphabet[0];
            System.out.println("The last letter is: "+alphabet[25]);
            System.out.println("The first letter is: " +first);
            if(first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first == "u" ){
                System.out.println("The first letter is a vowel.");
            }
        }

   // Generate and return an array with 10 random numbers between 55-100.

        public static int[] prob4(){
            int[] arr = new int[10];
            Random numb = new Random();
            for(int i = 0; i < 10; i++){
                arr[i] = numb.nextInt(46)+55;
            }
            return arr;
        }

   /*
      Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array.
        Next, display the minimum value in the array as well as the maximum value.
     */

    public static ArrayList prob5(){
        ArrayList prob5 = new ArrayList();
            int max = 55;
            int min = 101;
            for(int i = 0; i < 10; i++){
              int   number = ThreadLocalRandom.current().nextInt(55,101);
                prob5.add(number);

                if(number < min){
                    min = number;
                }
                if (number > max){
                    max = number;
                }
            }
            Collections.sort(prob5);
            System.out.println("the low value is   " +  min);
            System.out.println("the high value is  " +  max);
            return prob5;
        }

    //Create a random string that is 5 characters long.



    public static String prob6() {
        Random rand = new Random();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String str = "";
        for (int i = 0; i < 5; i++) {
            int random = rand.nextInt(26);
            str += alphabet[random];
        }
        return str;
    }

    //Generate an array with 10 random strings that are each 5 characters long

        public static String[] prob7(){
        String[] arr = new String[10];
        for (int i= 0; i<10; i++){
            arr[i] = prob6();
        }
        return arr;
        }
                public static void main (String[] args){

                    System.out.println(Arrays.toString(prob1()));
                    System.out.println(prob2());
                    prob3();
                    System.out.println(Arrays.toString(prob4()));
                    System.out.println(prob5());

                    System.out.println(prob6());
                    System.out.println(Arrays.toString(prob7()));



                }


    }


