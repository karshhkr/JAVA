public class Strbuffer {
    public static void main(String[] args) {
  StringBuffer sb = new StringBuffer ("karshhkr"); // string we change it  // it give us a buffer size of 16 space char // we change the data
 
System.out.println(sb.capacity());// we get cappacity of the string so here what we get is string capacity which is 8 and buffer cappacity of  16 space it just concat
       System.out.println(sb.length());


        sb.append(" gamer ");// so we can append 

        sb.deleteCharAt(2);// we can delete at index 2
        sb.insert(8, " cs:go ");// same we can insert too
         System.out.println( sb);


         // so string builder has the same methods of strings
       
}

}
