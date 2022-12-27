package linear_search;
import java.util.Scanner;

public class Basic_linear {
    public static void main(String args[])
   {
      int counter, num, item, array[];
      //To capture user input
      Scanner input = new Scanner(System.in);
      System.out.println("Masukan Jumlah Deret Angka Yang Di inginkan :");
      num = input.nextInt(); 
      //Creating array to store the all the numbers
      array = new int[num]; 
      System.out.println("Masukan " + num + " Angka");
      
      //Loop to store each numbers in array
      for (counter = 0; counter < num; counter++)
        array[counter] = input.nextInt();

      System.out.println("Masukan Angka Yang Ingin Di Cari :");
      item = input.nextInt();

      for (counter = 0; counter < num; counter++)
      {
         if (array[counter] == item) 
         {
           System.out.println(item+" Ada Dalam Deret Angka Urutan Ke "+(counter+1));
           /*Item is found so to stop the search and to come out of the 
            * loop use break statement.*/
           break;
         }
      }
      if (counter == num)
        System.out.println(item + " Tidak Ada Dalam Deret Angka Di atas ");
   }
}    
