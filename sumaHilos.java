public class sumaHilos extends Thread{
   //@Override
   static int sumaVector = 0;
   static void sumaHilos(int[] auxVector){

      
      for(int x=0; x<auxVector.length; x++){
         sumaVector = sumaVector + auxVector[x];
      }//for x
   }//sumaHilos
   
   public void run(){
      System.out.println("Hilo #1 .- Suma = " + sumaVector);
   }
   
}//sumaHilos