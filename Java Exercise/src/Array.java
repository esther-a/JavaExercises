public class Array {
    public void display() {
        int[] arrayOfInts = {11, 21, 13, 41, 15, 61, 17, 18, 98};

        for (int i = 0; i < arrayOfInts.length; i++)
        {
            System.out.println(arrayOfInts[i]);
        }

    }
    /* you create an array class called Array.  Then a public method called display is created. then you declare the array and what values you want to put inside of them.
then the for loop is created which states a variable (i) at 0. And that when your variable i is smaller than the lenght of the array, you should add 1 to i. then you print out
a position in the array that is constantly changing which is i
 */




    public void timesten() {
        int [] secondArray = new int [6];

        for (int a = 0; a <=6 ; a++){

            System.out.println(secondArray [a]= a);

           // for (int b = 0; b <secondArray[a]; b * 10);
        }
    }
}



