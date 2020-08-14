
package guess.game;
import java .util.Random;
public class guessgame {
    Random rando=new Random(); 
           
   palyer p1=new palyer();
   palyer p2=new palyer();
   palyer p3=new palyer();
   public void start_game()
   {
       boolean p1_right=false;
       boolean p2_right=false;
       boolean p3_right=false;
       
     int computer_guess;
     computer_guess=rando.nextInt(10);
     int p1_guess,p2_guess,p3_guess;
      p1_guess=p1.guess();
    p2_guess=p1.guess();
   p3_guess=p1.guess();
   if(p1_guess==computer_guess)
   {
       p1_right=true;
   }
   if(p2_guess==computer_guess)
   {
       p2_right=true;
   }
   if(p3_guess==computer_guess)
   {
       p3_right=true;
   }
   if(p1_right==true)
   {
       System.out.print("you win p1");
       System.out.println("Your guess is"+p1.guess());
       System.out.println("your guesss is "+p1_guess);
   }
   if(p2_right==true)
   {
       System.out.print("you win p2");
       System.out.println("Your guess is"+p2.guess());
       System.out.println("your guesss is "+p2_guess);
   }
   if(p3_right==true)
   {
       System.out.print("you win p3");
       System.out.println("Your guess is"+p3.guess());
       System.out.println("your guesss is "+p3_guess);
   }
   
   }
   
}
