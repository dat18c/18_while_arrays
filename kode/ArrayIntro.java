import java.util.Arrays;

public class ArrayIntro
{
   public static void main(String[] args)
   {
      int[] tal = new int[4];
      String[] navne = new String[4];
      int[] mineTal = new int[4];
      
      //hvad initialiseres int til?
      System.out.println(tal[0]);
      System.out.println(navne[0]);
      
      //tilskriv værdier
      tal[0] = 42;
      mineTal[0] = 42;
      tal[1] = 17;
      mineTal[1] = 17;
      tal[2] = 5;
      mineTal[2] = 5;
      tal[3] = 1;
      mineTal[3] = 1;
      navne[0] = "Rip";
      //læser værdier
      System.out.println(tal[0]);
      System.out.println(navne[0]);
      //check reference er ens?
      if (tal == mineTal)
      {
         System.out.println("ens");
      }
      else
      {
         System.out.println("forskellige");
      }
      //check equals
      if (Arrays.equals(tal, mineTal))
      {
         System.out.println("ens");
      }
      else
      {
         System.out.println("forskellige");
      }
      //Arrays.toString giver indholdet i stedet for memoryadressen
      
      //Arrays.sort sorterer et array
      
      //løkke, der går igennem et array
      
   }

}