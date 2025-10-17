public record Nestedloop() {
    public static void main(String[] args) {
        int i =1;
         while (i<=20){
            System.out.println("hii"+ i);
            

            
            // for printing the hello for two time with hii we take the new variable j 
        
        
        //nested  while loop
            int j=1;
          while(j<=2){
           System.out.println("hello" + i); 
        
             j++;
           }
                  i++;
         }
    }
}

// what is happening here is that hi is printing then comes to inner loop print the condition that staisfy and after that again evaluted outside the inner loop 