class nestedloop {
   public static void main(String[] args) {
      int num=5;
      for (int i = 1; i <= 5; ++i) {

         System.out.println("" + i);

         for (int j = 1; j <=2; ++j) {
            System.out.println("i = " + i + "; j = " + j);
         }
      }
   }
}