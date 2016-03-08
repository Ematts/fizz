package fizbuzz;

public class calculations {
	public static class FizzBuzz {                      
		  public static void main(String[] args) {   
		    for(int i = 1; i <= 100; i++) {                    
		      if (((i % 4) == 0) && ((i % 7) == 0))            
		        System.out.println("fizzbuzz");    
		      else if ((i % 4) == 0) System.out.println("fizz"); 
		      else if ((i % 7) == 0) System.out.println("buzz"); 
		      else System.out.println(i);                        
		   
		    }
		
		  }
		}

}
