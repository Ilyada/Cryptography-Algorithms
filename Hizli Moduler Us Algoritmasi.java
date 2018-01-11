  
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int[] k = new int[30]; 
        int c=0;
        int d=1;
        System.out.println("A girin:");
       int a= scan.nextInt();
        System.out.println("B girin:");
            int b= scan.nextInt();
        System.out.println("N girin:");
    int n= scan.nextInt();
      int i = 0;
            
        while(b >= 1){
            i++;
            k[i] = b%2;
            b = b / 2;
        }
       
     for(int m=k.length-1; m>=0; m--){
         
         c = c*2;
         d= d* d%n;
         if(k[m]==1){
             c=c+1;
             d=((d*a)%n);
         }     
     }
     System.out.println(""+d);
}