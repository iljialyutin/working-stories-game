import java.util.Scanner;

public class Main{
              public static void main(String args[]) {
            	  for(int i=1;i<=100;i++){
            	  System.out.print("_");
            	  }
            	  System.out.println();
            	  
              Scanner keyboard = new Scanner(System.in);
             System.out.println("You are Cristiano Ronaldo and you are about to go through an amazing adventure!");
             System.out.println("You can pick different solutions; you can pick choices with these numbers: 1,2.");
             choiceOne();
              }
            
              public static void choiceOne(){
            	  for(int i=1;i<=100;i++){
                	  System.out.print("_");
                	  }
                	  System.out.println();
                	  
              Scanner keyboard = new Scanner(System.in);
              //Box below
              System.out.println("The first choices are: You want to win the World Cup(1) or you want to buy a new mansion(2).");
              int userInput = keyboard.nextInt();
              if(userInput == 1){
                 worldCup();
              } else if(userInput == 2){
                 newMansion();
              } else {
                  System.out.println("Bad Input. Restart game.");
              }
              }
              public static void worldCup(){
            	  for(int i=1;i<=100;i++){
                	  System.out.print("_");
                	  }
                	  System.out.println();
                	  
               Scanner keyboard = new Scanner(System.in);
               //Box 2.1 below
               System.out.println("He really respects the soccer in Germany(1) because the team is really good, but he always wanted to go to Africa(2). Where does he go?");
              int userInput = keyboard.nextInt();
              if(userInput == 1){
                africa();
              } else if(userInput == 2){
                  germany();
              } else{
                System.out.println("Basd Input. Restart game.");  
              }
          }
              
              public static void newMansion(){
            	  for(int i=1;i<=100;i++){
                	  System.out.print("_");
                	  }
                	  System.out.println();
                	  
                  Scanner keyboard = new Scanner(System.in);
                  System.out.println("Ronaldo has to do some Buisness stuff with Putin in russia(1) or he can go to Germany because of the awesome soccer(2).");
                  int userInput = keyboard.nextInt();
                  if(userInput == 1){
                      germany();
                  }else if(userInput == 2){
                      russia();
                  }else {
                  System.out.println("Bad Input. Restart Game.");
                  }
              }
              
              public static void africa(){
            	  for(int i=1;i<=100;i++){
                	  System.out.print("_");
                	  }
                	  System.out.println();
                	  
                  Scanner keyboard = new Scanner(System.in);
                  System.out.println("Now Cristiano Ronaldo is a bit hungry and he wants to eat meat(1), but he also wants to mett his friwnd which he hasn't seen in years(2)");
                  int userInput = keyboard.nextInt();
                  if(userInput == 1){
                      gmeat();
                  }
                  else if(userInput == 2){
                      afriend();
                  }else{
                      System.out.println("Bad Input. Restart Game.");
                  }
              }
              public static void germany(){
            	  for(int i=1;i<=100;i++){
                	  System.out.print("_");
                	  }
                	  System.out.println();
                	  
                  Scanner keyboard = new Scanner(System.in);
                  System.out.println("Cristiano Ronalso is really hungry(1) but he also misses his russian cousin because he hasnt seen him in years(2).");
                  int userInput = keyboard.nextInt();
                  if(userInput == 1){
                  gmeat();
                  }
                  else if(userInput == 2){
                      rcousin();
                  }else{
                      System.out.println("Bad Input. Restart Game.");
                  }
              }
              public static void russia(){
            	  for(int i=1;i<=100;i++){
                	  System.out.print("_");
                	  }
                	  System.out.println();
                	  
                  Scanner keyboard = new Scanner(System.in);
                  System.out.println("Ronaldo really misses his russian cousin so he wants to meet him(1) but also, he wants to visit putin to get some Stuff done(2).");
                  int userInput = keyboard.nextInt();
                   if(userInput == 1){
                       rcousin();
                   }else if(userInput == 2){
                       putin();
                   }else{
                       System.out.println("Bad Input. Restart Game.");
                   }
                   }
                  public static void afriend(){
                	  for(int i=1;i<=100;i++){
                    	  System.out.print("_");
                    	  }
                    	  System.out.println();
                    	  
                      Scanner keyboard = new Scanner(System.in);
                  System.out.println("After walking for a bit, ronaldo either found his old friwnd who is a goat(1), or he found out that putin is his older brother(2)");
                   int userInput = keyboard.nextInt();
                   if(userInput == 1){
                       goat();
                   }else if(userInput == 2){
                       broputin();
                   }else{
                       System.out.println("bad Input. Restart Game.");
                   }
                  }
                  public static void gmeat(){
                	  for(int i=1;i<=100;i++){
                    	  System.out.print("_");
                    	  }
                    	  System.out.println();
                    	  
                      Scanner keyboard = new Scanner(System.in);
                      System.out.println("After walking for a bit, ronaldo either found his old friwnd who is a goat(1), or he found out that putin is his older brother(2)");
                   int userInput = keyboard.nextInt();
                   if(userInput == 1){
                       goat();
                   }else if(userInput == 2){
                       broputin();
                   }else{
                       System.out.println("bad Input. Restart Game.");
                  }
              }
              public static void rcousin(){
            	  for(int i=1;i<=100;i++){
                	  System.out.print("_");
                	  }
                	  System.out.println();
                	  
                      Scanner keyboard = new Scanner(System.in);
                      System.out.println("After walking for a bit, ronaldo either found his old friwnd who is a goat(1), or he found out that putin is his older brother(2)");
                   int userInput = keyboard.nextInt();
                   if(userInput == 1){
                       goat();
                   }else if(userInput == 2){
                       broputin();
                   }else{
                       System.out.println("bad Input. Restart Game.");
                   }
              }    
                  public static void putin(){
                	  for(int i=1;i<=100;i++){
                    	  System.out.print("_");
                    	  }
                    	  System.out.println();
                    	  
                      Scanner keyboard = new Scanner(System.in);
                      System.out.println("After walking for a bit, ronaldo either found his old friwnd who is a goat(1), or he found out that putin is his older brother(2)");
                   int userInput = keyboard.nextInt();
                   if(userInput == 1){
                       goat();
                   }else if(userInput == 2){
                       broputin();
                   }else{
                       System.out.println("bad Input. Restart Game.");
              
                  } 
               }
               public static void goat(){
            	   for(int i=1;i<=100;i++){
                 	  System.out.print("_");
                 	  }
                 	  System.out.println();
                 	  
                      Scanner keyboard = new Scanner(System.in);
                      System.out.println("Ronaldo now wasnts to return to Russia because he lost his goat again(1), or because he lost his private jet and he needs to start walking to (2)");
                   int userInput = keyboard.nextInt();
                   if(userInput == 1){
                       lgoat();
                   }else if(userInput == 2){
                       lpjet();
                   }else{
                       System.out.println("bad Input. Restart Game.");
                }
               }
              
                   
              
          

                   public static void broputin(){
                	   for(int i=1;i<=100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                       Scanner keyboard = new Scanner(System.in);
                       System.out.println("Ronaldo now either looses his private jet because he forgot to lock it witha bike lock(1), or he looses sall his money at the casino to putin set something up(2).");
                    int userInput = keyboard.nextInt();
                    if(userInput == 1){
                        lpjet();
                    }else if(userInput == 2){
                        casinol();
                    }else{
                        System.out.println("bad Input. Restart Game.");
                        
                    }  
}
                   public static void lgoat(){
                	   for(int i=1;i<100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                       Scanner keyboard = new Scanner(System.in);
                       System.out.println("Ronaldo now either returns to russia with a economy class airplane(1), or his korean friend brings him back to russia(2)");
                    int userInput = keyboard.nextInt();
                    if(userInput == 1){
                        rejet();
                    }else if(userInput == 2){
                        kofriend();
                    }else{
                        System.out.println("bad Input. Restart Game.");
                        
                    }
                   }
                   public static void lpjet(){
                	   for(int i=1;i<=100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                       Scanner keyboard = new Scanner(System.in);
                       System.out.println("Because he doesnt have his jet anymore, his korean friend picks him up on his private jet(1), or his wife picks him up with her lambo (2) ");
                    int userInput = keyboard.nextInt();
                    if(userInput == 1){
                        kofriend();
                    }else if(userInput == 2){
                        wife();
                    }else{
                        System.out.println("bad Input. Restart Game.");
                        
}
}
                   public static void casinol(){
                	   for(int i=1;i<=100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                       Scanner keyboard = new Scanner(System.in);
                       System.out.println("Because he doesnt have his jet anymore, his korean friend picks him up on his private jet(1), or his wife picks him up with her lambo (2).");
                    int userInput = keyboard.nextInt();
                    if(userInput == 1){
                        kofriend();
                    }else if(userInput == 2){
                        wife();
                    }else{
                        System.out.println("bad Input. Restart Game.");
                        
                    }
                   }
                   
                   public static void afmer(){
                	   for(int i=1;i<=100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                	   System.out.println("Game over. Thanks for playing!");
                	   System.exit(0);
                	   
                	   
                   }
                   public static void footclub(){
                	   for(int i=1;i<=100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                	   System.out.println("Game over. Thanks for playing!");
                	   System.exit(0);
                   }
                   public static void rejet(){
                	   for(int i=1;i<=100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                       Scanner keyboard = new Scanner(System.in);
                       System.out.println("When Ronaldo returns to Portugal he can change his identity to an african farmer(1), or he can change football clubs to earn more money(2)");
                    int userInput = keyboard.nextInt();
                    if(userInput == 1){
                        afmer();
                    }else if(userInput == 2){
                        footclub();
                    }else{
                        System.out.println("Bad output. Restart Game");
                    }
                   }
                   public static void kofriend(){
                	   for(int i=1;i<=100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                       Scanner keyboard = new Scanner(System.in);
                       System.out.println("When Ronaldo returns to Portugal he can change his identity to an african farmer(1), or he can change football clubs to earn more money(2)");
                    int userInput = keyboard.nextInt();
                    if(userInput == 1){
                        afmer();
                    }else if(userInput == 2){
                        footclub();
                    }else{
                        System.out.println("bad Input. Restart Game.");
                    }
                        
                   }
                    
                   
                   public static void wife(){
                	   for(int i=1;i<=100;i++){
                     	  System.out.print("_");
                     	  }
                     	  System.out.println();
                     	  
                       Scanner keyboard = new Scanner(System.in);
                       System.out.println("When Ronaldo returns to Portugal he can change his identity to an african farmer(1), or he can change football clubs to earn more money(2)");
                    int userInput = keyboard.nextInt();
                    if(userInput == 1){
                        afmer();
                    }else if(userInput == 2){
                        footclub();
                    }else{
                        System.out.println("bad Input. Restart Game.");
}}}