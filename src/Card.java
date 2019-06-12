/* Group name - TECH SHERIDAN 
*Serafettin Tarik Bozdemir
*Tajinder Singh
*Nicole Iachica
*Benjamin To
*/
class Card {
    private int rank; 
    private int suit; 
    
    //constructor
    public Card(int suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }
    
    //setter method
    public void setCard(int rank){
        this.rank = rank;
    }
    
     //getter method
    public int getCard(){
        return rank; 
    }
    
    
    @Override
    public String toString(){
    //combine rank and suit into a single string

        //suing StringBuilder for modifiability later on
        StringBuilder displayCard = new StringBuilder();
        
       
        if (rank == 11 )
        {
          displayCard.append("Jack");
        }
        else if (rank == 12 )
        {
          displayCard.append("Queen");
        }
        else if (rank == 13 )
        {
         displayCard.append("King");
        }
        else if (rank == 14 )
        {
           displayCard.append("Ace");
        }
        
        
        if(suit == 0)
        {
         displayCard.append("Spades");
        }
        else if(suit == 1)
        {
          displayCard.append("Hearts");
        }
        else if(suit == 2)
        {
          displayCard.append("Clubs");
        }
        else if(suit == 3)
        {
          displayCard.append("Diamonds");
        }

        //return the result of an entire combined string
        return displayCard.toString();
    }
    
}
