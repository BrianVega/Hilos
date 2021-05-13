public class cuadradosHilos extends Thread{
   static int cuadradosVector = 0;
   static void cuadradosHilos(int[] auxVector){
      
      for(int x=0; x<auxVector.length; x++){
         cuadradosVector = cuadradosVector + (int)Math.pow(auxVector[x], 2);
      }//for x
   }//sumaHilos
   
   public void run(){
      System.out.println("Hilo #2 .- Suma de cuadrados = " + cuadradosVector);
   }
   
   
}//cuadradosHilos