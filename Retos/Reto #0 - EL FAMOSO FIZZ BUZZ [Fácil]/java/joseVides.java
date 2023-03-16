public class Main {

    public static void main(String[] args) {
        
        for ( int i = 1; i <= 100; i++){
            if(i%3!=0 && i%5!=0)
                System.out.println("\n"+i);
            if(i%3==0)
                System.out.println("\nFizz");
            if(i%5==0)
                System.out.println("\nBuzz");
            if(i%3==0 && i%5==0)
                System.out.println("\nFizzBuzz");
        }
        
    }
    
}
