//Kaylee Dalton - Kerby 2235 - 11/10/2022
//Card Game WAR 2 Player Ver
//Rules:
// If players get a Double War the game ends in a tie. (house rule)
// When a player has no more cards they lose!
// If a player has too few cards for a war they just draw the last card they have.




import java.util.*;
import java.util.Collections;

class Card
{
    public String suit;
    public int rank;
    //I'll have King, Queen, and Joker be worth 11,12,13 respectively

}

class Player
{
    //I don't know if I need anything in here so I left em blank.
}

//class Bear extends Animal

class Deck{
    public ArrayList<Object> arrayList;
}
class War
{
    static List<Card> createDeck(){
    List<Card> WarDeck = new ArrayList<Card>(52);
    Card AceOfClubs = new Card();
    AceOfClubs.suit="Clubs";
    AceOfClubs.rank=1;
    WarDeck.add(AceOfClubs);
    Card TwoOfClubs = new Card();
    TwoOfClubs.suit="Clubs";
    TwoOfClubs.rank=2;
    WarDeck.add(TwoOfClubs);
    Card ThreeOfClubs = new Card();
    ThreeOfClubs.suit = "Clubs";
    ThreeOfClubs.rank = 3;
    WarDeck.add(ThreeOfClubs);
    Card FourOfClubs = new Card ();
    FourOfClubs.suit = "Clubs";
    FourOfClubs.rank = 4;
    WarDeck.add(FourOfClubs);
    Card FiveOfClubs = new Card();
    FiveOfClubs.suit = "Clubs";
    FiveOfClubs.rank = 5;
    WarDeck.add(FiveOfClubs);
    Card SixOfClubs = new Card();
    SixOfClubs.suit = "Clubs";
    SixOfClubs.rank = 6;
    WarDeck.add(SixOfClubs);
    Card SevenOfClubs = new Card();
    SevenOfClubs.suit = "Clubs";
    SevenOfClubs.rank = 7;
    WarDeck.add(SevenOfClubs);
    Card EightOfClubs = new Card();
    EightOfClubs.suit = "Clubs";
    EightOfClubs.rank = 8;
    WarDeck.add(EightOfClubs);
    Card NineOfClubs = new Card();
    NineOfClubs.suit = "Clubs";
    NineOfClubs.rank = 9;
        WarDeck.add(NineOfClubs);
    Card TenOfClubs = new Card();
    TenOfClubs.suit = "Clubs";
    TenOfClubs.rank = 10;
        WarDeck.add(TenOfClubs);
    Card QueenOfClubs = new Card();
    QueenOfClubs.suit = "Clubs";
    QueenOfClubs.rank = 11;
        WarDeck.add(QueenOfClubs);
    Card KingOfClubs = new Card();
    KingOfClubs.suit = "Clubs";
    KingOfClubs.rank = 12;
        WarDeck.add(KingOfClubs);
    Card JackOfClubs = new Card();
    JackOfClubs.suit = "Clubs";
    JackOfClubs.rank = 13;
        WarDeck.add(JackOfClubs);
        Card AceOfHearts = new Card();
        AceOfHearts.suit="Hearts";
        AceOfHearts.rank=1;
        WarDeck.add(AceOfHearts);
        Card TwoOfHearts = new Card();
        TwoOfHearts.suit="Hearts";
        TwoOfHearts.rank=2;
        WarDeck.add(TwoOfHearts);
        Card ThreeOfHearts = new Card();
        ThreeOfHearts.suit = "Hearts";
        ThreeOfHearts.rank = 3;
        WarDeck.add(ThreeOfHearts);
        Card FourOfHearts = new Card ();
        FourOfHearts.suit = "Hearts";
        FourOfHearts.rank = 4;
        WarDeck.add(FourOfHearts);
        Card FiveOfHearts = new Card();
        FiveOfHearts.suit = "Hearts";
        FiveOfHearts.rank = 5;
        WarDeck.add(FiveOfHearts);
        Card SixOfHearts = new Card();
        SixOfHearts.suit = "Hearts";
        SixOfHearts.rank = 6;
        WarDeck.add(SixOfHearts);
        Card SevenOfHearts = new Card();
        SevenOfHearts.suit = "Hearts";
        SevenOfHearts.rank = 7;
        WarDeck.add(SevenOfHearts);
        Card EightOfHearts = new Card();
        EightOfHearts.suit = "Hearts";
        EightOfHearts.rank = 8;
        WarDeck.add(EightOfHearts);
        Card NineOfHearts = new Card();
        NineOfHearts.suit = "Hearts";
        NineOfHearts.rank = 9;
        WarDeck.add(NineOfHearts);
        Card TenOfHearts = new Card();
        TenOfHearts.suit = "Hearts";
        TenOfHearts.rank = 10;
        WarDeck.add(TenOfHearts);
        Card QueenOfHearts = new Card();
        QueenOfHearts.suit = "Hearts";
        QueenOfHearts.rank = 11;
        WarDeck.add(QueenOfHearts);
        Card KingOfHearts = new Card();
        KingOfHearts.suit = "Hearts";
        KingOfHearts.rank = 12;
        WarDeck.add(KingOfHearts);
        Card JackOfHearts = new Card();
        JackOfHearts.suit = "Hearts";
        JackOfHearts.rank = 13;
        WarDeck.add(JackOfHearts);
        Card AceOfSpades = new Card();
        AceOfSpades.suit="Spades";
        AceOfSpades.rank=1;
        WarDeck.add(AceOfSpades);
        Card TwoOfSpades = new Card();
        TwoOfSpades.suit="Spades";
        TwoOfSpades.rank=2;
        WarDeck.add(TwoOfSpades);
        Card ThreeOfSpades = new Card();
        ThreeOfSpades.suit = "Spades";
        ThreeOfSpades.rank = 3;
        WarDeck.add(ThreeOfSpades);
        Card FourOfSpades = new Card ();
        FourOfSpades.suit = "Spades";
        FourOfSpades.rank = 4;
        WarDeck.add(FourOfSpades);
        Card FiveOfSpades = new Card();
        FiveOfSpades.suit = "Spades";
        FiveOfSpades.rank = 5;
        WarDeck.add(FiveOfSpades);
        Card SixOfSpades = new Card();
        SixOfSpades.suit = "Spades";
        SixOfSpades.rank = 6;
        WarDeck.add(SixOfSpades);
        Card SevenOfSpades = new Card();
        SevenOfSpades.suit = "Spades";
        SevenOfSpades.rank = 7;
        WarDeck.add(SevenOfSpades);
        Card EightOfSpades = new Card();
        EightOfSpades.suit = "Spades";
        EightOfSpades.rank = 8;
        WarDeck.add(EightOfSpades);
        Card NineOfSpades = new Card();
        NineOfSpades.suit = "Spades";
        NineOfSpades.rank = 9;
        WarDeck.add(NineOfSpades);
        Card TenOfSpades = new Card();
        TenOfSpades.suit = "Spades";
        TenOfSpades.rank = 10;
        WarDeck.add(TenOfSpades);
        Card QueenOfSpades = new Card();
        QueenOfSpades.suit = "Spades";
        QueenOfSpades.rank = 11;
        WarDeck.add(QueenOfSpades);
        Card KingOfSpades = new Card();
        KingOfSpades.suit = "Spades";
        KingOfSpades.rank = 12;
        WarDeck.add(KingOfSpades);
        Card JackOfSpades = new Card();
        JackOfSpades.suit = "Spades";
        JackOfSpades.rank = 13;
        WarDeck.add(JackOfSpades);
        Card AceOfDiamonds = new Card();
        AceOfDiamonds.suit="Diamonds";
        AceOfDiamonds.rank=1;
        WarDeck.add(AceOfDiamonds);
        Card TwoOfDiamonds = new Card();
        TwoOfDiamonds.suit="Diamonds";
        TwoOfDiamonds.rank=2;
        WarDeck.add(TwoOfDiamonds);
        Card ThreeOfDiamonds = new Card();
        ThreeOfDiamonds.suit = "Diamonds";
        ThreeOfDiamonds.rank = 3;
        WarDeck.add(ThreeOfDiamonds);
        Card FourOfDiamonds = new Card ();
        FourOfDiamonds.suit = "Diamonds";
        FourOfDiamonds.rank = 4;
        WarDeck.add(FourOfDiamonds);
        Card FiveOfDiamonds = new Card();
        FiveOfDiamonds.suit = "Diamonds";
        FiveOfDiamonds.rank = 5;
        WarDeck.add(FiveOfDiamonds);
        Card SixOfDiamonds = new Card();
        SixOfDiamonds.suit = "Diamonds";
        SixOfDiamonds.rank = 6;
        WarDeck.add(SixOfDiamonds);
        Card SevenOfDiamonds = new Card();
        SevenOfDiamonds.suit = "Diamonds";
        SevenOfDiamonds.rank = 7;
        WarDeck.add(SevenOfDiamonds);
        Card EightOfDiamonds = new Card();
        EightOfDiamonds.suit = "Diamonds";
        EightOfDiamonds.rank = 8;
        WarDeck.add(EightOfDiamonds);
        Card NineOfDiamonds = new Card();
        NineOfDiamonds.suit = "Diamonds";
        NineOfDiamonds.rank = 9;
        WarDeck.add(NineOfDiamonds);
        Card TenOfDiamonds = new Card();
        TenOfDiamonds.suit = "Diamonds";
        TenOfDiamonds.rank = 10;
        WarDeck.add(TenOfDiamonds);
        Card QueenOfDiamonds = new Card();
        QueenOfDiamonds.suit = "Diamonds";
        QueenOfDiamonds.rank = 11;
        WarDeck.add(QueenOfDiamonds);
        Card KingOfDiamonds = new Card();
        KingOfDiamonds.suit = "Diamonds";
        KingOfDiamonds.rank = 12;
        WarDeck.add(KingOfDiamonds);
        Card JackOfDiamonds = new Card();
        JackOfDiamonds.suit = "Diamonds";
        JackOfDiamonds.rank = 13;
        WarDeck.add(JackOfDiamonds);

        return WarDeck;


    }

    public ArrayList shuffleDecks(ArrayList a)
    {
        Collections.shuffle(a);
        ArrayList<Card> p1 = new ArrayList<>();
        ArrayList<Card> p2 = new ArrayList<>();
        p1 = a;
        a.subList(0,26).clear();
        p2 = a;
        ArrayList<ArrayList> totalHands = new ArrayList<>();
        totalHands.add(p1);
        totalHands.add(p2);


        return totalHands;
    }




   public double[] playRound(List a)
   {
       double war = 0;
       double doublewar = 0;
       double step = 0;
       Boolean winCon = false;
       Collections.shuffle(a);
       Deque<Card> deck = new ArrayDeque<Card>(a);
       Deque<Card> p1 = new ArrayDeque<Card>(a);
       Deque<Card> p2 = new ArrayDeque<Card>(a);
       for (int i = 0; i < (26); i++)
       {
           p1.removeFirst();
           p2.removeLast();
       }
       while(winCon == false) {
           try {
               Card retval1 = p1.getFirst();
           } catch (Exception NONELEFT) {
               winCon = true;
               System.out.println("P2 wins!");
           }
           try {
               Card retval2 = p2.getFirst();

           } catch (Exception NONELEFT) {
               winCon = true;
               System.out.println("P1 wins!");

           }
           System.out.println("PLAYER 1 HAS " + p1.size());
           System.out.println("PLAYER 2 HAS " + p2.size());
           //I'll have Queen, King, and Joker be worth 11,12,13 respectively will add way to print correct names soon
           if (p1.size() == 0) {
               winCon = true;
               System.out.println("Game Over: P2 WINS");
               break;
           }
           if (p2.size() == 0) {
               winCon = true;
               System.out.println("Game Over: P1 WINS");
               break;
           } else {

               Card retval1 = p1.getFirst();
               String ranking = String.valueOf(retval1.rank);
               if (retval1.rank == 11)
               {
                   ranking = "Queen";
               }
               if(retval1.rank == 12){
                   ranking = "King";
               }
               if(retval1.rank == 13){
                   ranking = "Joker";
               }
               ///Change 11 and above ranks to king queen jack
               System.out.println("Player 1's Card " + retval1.suit + " " + ranking);
               Card retval2 = p2.getFirst();
               String ranking2 = String.valueOf(retval2.rank);
               if (retval2.rank == 11)
               {
                   ranking2 = "Queen";
               }
               if(retval2.rank == 12){
                   ranking2 = "King";
               }
               if(retval2.rank == 13){
                   ranking2 = "Joker";
               }
               System.out.println("Player 2's Card " + retval2.suit + " " + ranking2);
               if (retval1.rank == retval2.rank) {
                   System.out.println("It's a war!");
                   war++;
                   Deque<Card> spoils = new ArrayDeque<Card>();
                   if ((p1.size() > 4) && (p2.size() > 4)) {
                       //p1 remove 4 cards
                       spoils.add(p1.pop());
                       Card warCard1 = p1.getFirst();
                       spoils.add(p1.pop());
                       spoils.add(p1.pop());
                       spoils.add(p1.pop());
                       System.out.println("Player 1 removes 4 cards and adds them to the war pool.");
                       //p2 remove 4 cards
                       spoils.add(p2.pop());
                       Card warCard2 = p1.getFirst();
                       spoils.add(p2.pop());
                       spoils.add(p2.pop());
                       spoils.add(p2.pop());
                       System.out.println("Player 2 removes 4 cards and adds them to the war pool.");
                       String warCard1Rank = String.valueOf(warCard1.rank);
                       String warCard2Rank = String.valueOf(warCard2.rank);
                       if (warCard1.rank == 11)
                       {
                           warCard1Rank = "Queen";
                       }
                       if(retval2.rank == 12){
                           warCard1Rank = "King";
                       }
                       if(retval2.rank == 13){
                           warCard1Rank = "Joker";
                       }
                       if (warCard2.rank == 11)
                       {
                           warCard2Rank = "Queen";
                       }
                       if(retval2.rank == 12){
                           warCard2Rank = "King";
                       }
                       if(retval2.rank == 13){
                           warCard2Rank = "Joker";
                       }
                       System.out.println("Player 1 draws " + warCard1.suit + " " + warCard1Rank + " \n" + "Player 2 draws " + warCard2.suit + " " + warCard2Rank);

                       if (warCard1.rank > warCard2.rank) {
                           System.out.println("P1 wins war!");
                           p1.addAll(spoils);
                       }
                       if (warCard2.rank > warCard1.rank) {
                           System.out.println("P2 wins war!");
                           p2.addAll(spoils);
                       }
                       if (warCard1.rank == warCard2.rank) {
                           System.out.println("Double War! It's a tie! GAME OVER");
                           doublewar++;
                           winCon = true;
                       }

                   } else if ((p1.size() <= 4) || (p2.size() <= 4)) {
                       System.out.println("Too few cards for war! Users draw their last card instead.");
                       Card war1 = p1.getLast();
                       Card war2 = p2.getLast();
                       String warCard1Rank = String.valueOf(war1.rank);
                       String warCard2Rank = String.valueOf(war2.rank);
                       if (war1.rank == 11)
                       {
                           warCard1Rank = "Queen";
                       }
                       if(retval2.rank == 12){
                           warCard1Rank = "King";
                       }
                       if(retval2.rank == 13){
                           warCard1Rank = "Joker";
                       }
                       if (war2.rank == 11)
                       {
                           warCard2Rank = "Queen";
                       }
                       if(retval2.rank == 12){
                           warCard2Rank = "King";
                       }
                       if(retval2.rank == 13){
                           warCard2Rank = "Joker";
                       }
                       System.out.println("P1 has " + warCard1Rank + " " + war1.suit);
                       System.out.println("P2 has " + warCard2Rank + " " + war2.suit);
                       if ((war1.rank > war2.rank) && (p1.size() > p2.size())) {
                           System.out.println();
                           System.out.println("P1 Wins the War! \nP2 has no cards left! GAME OVER: P1 WINS");
                           p1.add(war2);
                           p2.remove(war2);
                           break;
                       }
                       if((war1.rank == war2.rank)){
                           System.out.println("DOUBLE WAR TIE");
                           break;
                       }
                       if ((war2.rank > war1.rank)&& (p2.size() > p1.size())) {
                           System.out.println("P2 Wins the War! \nP1 has no cards left! GAME OVER: P2 WINS");
                           p2.add(war1);
                           p1.remove(war1);
                           break;
                       }
                       if ((war1.rank > war2.rank) && (p1.size() < p2.size())) {
                           System.out.println();
                           System.out.println("P1 Wins the War!");
                           p1.add(war2);
                           p2.remove(war2);
                       }
                       if ((war2.rank > war1.rank)&& (p2.size() < p1.size())) {
                           System.out.println("P2 Wins the War!");
                           p2.add(war1);
                           p1.remove(war1);
                       }
                   }
               } else if (retval1.rank > retval2.rank) {
                   p2.remove(retval2);
                   p1.addLast(retval2);
                   p1.removeFirst();
                   p1.addLast(retval1);
               } else if (retval1.rank < retval2.rank) {
                   p1.remove(retval1);
                   p2.addLast(retval1);
                   p2.removeFirst();
                   p2.addLast(retval2);
               }
           }
           step++;
       }
       System.out.println("Number of steps: " + step);
       System.out.println("DoubleWar " + doublewar);
       double[] valueOutput = {step, war, doublewar};
       return valueOutput;
       }



    public static void main (String[] args)
    {

    War thisGame = new War();
    List deck = createDeck();
    System.out.println("Welcome to the Card Game WAR. Starting the game...");
    thisGame.playRound(deck);
        double step = 0;
        double wars = 0;
        double doublewar = 0;
        for(int i = 0; i<=1000; i++)
        {
            //index[0] = steps index[1] = wars index[2] = double wars index[3] = triple wars
            double[] listing = thisGame.playRound(deck);
            step += listing[0];
            wars += listing[1];
            doublewar+=listing[2];



        }
        System.out.println("The average step number was " + step/1000);
        System.out.println("The average number of wars was " + wars/1000);
        System.out.println("The average number of double wars was " + doublewar/1000);


    }


    }

