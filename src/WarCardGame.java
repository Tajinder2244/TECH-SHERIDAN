import java.util.* ;
// Group name - TECH SHERIDAN
public class WarCardGame {
  
  
    public static void Generator(){
      
      //creating an carddeck array
        ArrayList<Card> cardDeck = new ArrayList<Card>(); 

        
        for(int x=0; x<4; x++)
        {         
            for(int y=2; y<15; y++)
            {     
                //create new card and add it to deck
                cardDeck.add(new Card(x,y)); 
            } 
        }
        
        //calling the collection method from framework collection
        Collections.shuffle(cardDeck, new Random()); 
        
       
        //creating 2 decks
        // player 1
        LinkedList<Card> deck1 = new LinkedList<Card>();
        
        //player 2
        LinkedList<Card> deck2 = new LinkedList<Card>(); 
        
        // calling  add all method to divide the cards among the players
        // player 1
        deck1.addAll(cardDeck.subList(0, 25));              
        
        //player 2
        deck2.addAll(cardDeck.subList(26, cardDeck.size()));
        
        
        while(true){
          
          // player1 faceup card
            Card player1 = deck1.pop();  
            
            // player 2 faceup card
            Card player2 = deck2.pop();
            
            
            //display the face up card
            System.out.println("Player 1  card is " +   player1.getCard() + " of "+ player1.toString() );
            System.out.println("Player 2  card is " + player2.getCard() + " of "+ player2.toString() );
            
            
            //comparation between two cards
            if(player1.getCard() > player2.getCard())
             {
                  //if player 1 win 
                deck1.addLast(player1); 
                deck1.addLast(player2); 
                System.out.println("PLayer 1 Wins ");
            }
            else if(player1.getCard() < player2.getCard())
            {
               //if player 2 win 
                deck2.addLast(player1);   
                deck2.addLast(player2);  
                System.out.println("PLayer 2 Wins ");
            }
            
            else { 
              
                //war happens when both cards' rank equal
                System.out.println("WAR!"); 
                
                //creating war cards for player 1
                List<Card> war1 = new ArrayList<Card>(); 
                
                // creating war cards for player 2
                List<Card> war2 = new ArrayList<Card>();
               
                
                
                //checking do players have enough cards 
                for(int x=0; x<3; x++)
                   { 
                    
                   //if any one player runs out of card  the game is  over
                    if(deck1.size() == 0 || deck2.size() == 0 )
                    {                      
                        break;
                    }
                    
                    // after war facing cards for players
                    System.out.println("Player1 card Facedown \n  Payer2 card Facedown");

                    
                    //place more card if war is not over
                    war1.add(deck1.pop());  
                    war2.add(deck2.pop());                  
                }
                
                //check result
                if(war1.size() == 3 && war2.size() == 3 )
                {
                    //shows the cards of  each player
                    System.out.println("War card for player1 is " + war1.get(0).toString());
                    System.out.println("War card for player2 is " + war2.get(0).toString());
                    
                    //if player 1 wins war
                    if(war1.get(2).getCard() > war2.get(2).getCard())
                    {
                        deck1.addAll(war1); 
                        deck1.addAll(war2);
                        System.out.println("Player 1 wins the war round");
                    }
                    else
                    {
                        deck2.addAll(war1); 
                        deck2.addAll(war2);
                        System.out.println("Player 2 wins the war round");
                    }            
                }
                
            }
            
            // to declare the winner
            if(deck1.size() == 0 )
            {
                System.out.println("game over\nPlayer 1 wins the game");
                break;
            }
            else if(deck2.size() == 0)
            {
                System.out.println("game over\nPlayer 2 wins the game");
                break;
            }
        }

    }       
}