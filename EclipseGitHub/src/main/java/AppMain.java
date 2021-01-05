public class AppMain {

   private String message;

   //Constructor
   //@param message to be printed
   public AppMain(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
} 