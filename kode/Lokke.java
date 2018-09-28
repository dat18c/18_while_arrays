public class Lokke
{
   public static void main(String[] args)
   {
      //while loop
      /*while (true)
      {
         //kode der bliver udført så længe betingelsen er sand
         System.out.println("Uendelig lykke/løkke");
      }*/
      
      //lav for (int i=0;i<10;i++){}
      int i=0;
      while (i<10)
      {
         //gør noget!
         System.out.println(i);
         //til sidst: forøg tællervariabel
         i++;
      }
      
      //typisk mønster
      //gør noget indtil betingelse er opfyldt
      boolean koerLokke = true;
      while (koerLokke)
      {
         //det vi gør undervejs
         //if (et eller andet) { koerLokke = false; }
      }
   }

}