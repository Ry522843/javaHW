//WhileLoop program
 
class WhileLoopEx
 {
  public static void main(String[] args) {

    int num = 8369, reversed = 0;
    
    System.out.println("Original Number: " + num);

    // run loop until num becomes 0
    while(num != 0) {
    
   
      int digit = num % 10;
      reversed = reversed * 10 + digit;


      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}