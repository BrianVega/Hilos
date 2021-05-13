public class mediaHilos extends Thread{
   static int mediaVector = 0;
   static int cont = 0;
   static void mediaHilos(int[] auxVector){

      
      for(int x=0; x<auxVector.length; x++){
         mediaVector = mediaVector + auxVector[x];
         cont++;
      }//for x
   }//sumaHilos
   
   public void run(){
      System.out.println("Hilo #3 .- Media = " + mediaVector / cont);
   }
}//mediaHilos
