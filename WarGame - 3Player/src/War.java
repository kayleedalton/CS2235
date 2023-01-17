//Kaylee Dalton - Kerby 2235 - 11/10/2022
//Card Game WAR 3 Player Ver
//Rules:
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
class War {
    static List<Card> createDeck() {
        List<Card> WarDeck = new ArrayList<Card>(52);
        Card AceOfClubs = new Card();
        AceOfClubs.suit = "Clubs";
        AceOfClubs.rank = 1;
        WarDeck.add(AceOfClubs);
        Card TwoOfClubs = new Card();
        TwoOfClubs.suit = "Clubs";
        TwoOfClubs.rank = 2;
        WarDeck.add(TwoOfClubs);
        Card ThreeOfClubs = new Card();
        ThreeOfClubs.suit = "Clubs";
        ThreeOfClubs.rank = 3;
        WarDeck.add(ThreeOfClubs);
        Card FourOfClubs = new Card();
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
        AceOfHearts.suit = "Hearts";
        AceOfHearts.rank = 1;
        WarDeck.add(AceOfHearts);
        Card TwoOfHearts = new Card();
        TwoOfHearts.suit = "Hearts";
        TwoOfHearts.rank = 2;
        WarDeck.add(TwoOfHearts);
        Card ThreeOfHearts = new Card();
        ThreeOfHearts.suit = "Hearts";
        ThreeOfHearts.rank = 3;
        WarDeck.add(ThreeOfHearts);
        Card FourOfHearts = new Card();
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
        AceOfSpades.suit = "Spades";
        AceOfSpades.rank = 1;
        WarDeck.add(AceOfSpades);
        Card TwoOfSpades = new Card();
        TwoOfSpades.suit = "Spades";
        TwoOfSpades.rank = 2;
        WarDeck.add(TwoOfSpades);
        Card ThreeOfSpades = new Card();
        ThreeOfSpades.suit = "Spades";
        ThreeOfSpades.rank = 3;
        WarDeck.add(ThreeOfSpades);
        Card FourOfSpades = new Card();
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
        AceOfDiamonds.suit = "Diamonds";
        AceOfDiamonds.rank = 1;
        WarDeck.add(AceOfDiamonds);
        Card TwoOfDiamonds = new Card();
        TwoOfDiamonds.suit = "Diamonds";
        TwoOfDiamonds.rank = 2;
        WarDeck.add(TwoOfDiamonds);
        Card ThreeOfDiamonds = new Card();
        ThreeOfDiamonds.suit = "Diamonds";
        ThreeOfDiamonds.rank = 3;
        WarDeck.add(ThreeOfDiamonds);
        Card FourOfDiamonds = new Card();
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

    public ArrayList shuffleDecks(ArrayList a) {
        Collections.shuffle(a);
        ArrayList<Card> p1 = new ArrayList<>();
        ArrayList<Card> p2 = new ArrayList<>();
        ArrayList<Card> p3 = new ArrayList<>();
        p1 = a;
        a.subList(0, 17).clear();
        p2 = a;
        a.subList(0, 17).clear();
        p3 = a;
        ArrayList<ArrayList> totalHands = new ArrayList<>();
        totalHands.add(p1);
        totalHands.add(p2);
        totalHands.add(p3);


        return totalHands;
    }


    public double[] playRound(List a) {
        double step = 0;
        double wars = 0;
        double doubwars = 0;
        double three = 0;


        Boolean winCon = false;
        Collections.shuffle(a);

        Deque<Card> deck = new ArrayDeque<Card>(a);
        deck.removeLast();
        Deque<Card> p1 = new ArrayDeque<Card>(a.subList(0, 17));
        Deque<Card> p2 = new ArrayDeque<Card>(a.subList(17, 34));
        Deque<Card> p3 = new ArrayDeque<Card>(a.subList(34, 51));

        while (winCon == false) {

            int threewars = 0;
            try {
                Card retval1 = p1.getFirst();
            } catch (Exception NONELEFT) {
                winCon = true;
                System.out.println("P1 loses!");
            }
            try {
                Card retval2 = p2.getFirst();

            } catch (Exception NONELEFT) {
                winCon = true;
                System.out.println("P2 loses!");

            }
            try {
                Card retval3 = p3.getFirst();

            } catch (Exception NONELEFT) {
                winCon = true;
                System.out.println("P3 loses!");

            }
            System.out.println("PLAYER 1 HAS " + p1.size());
            System.out.println("PLAYER 2 HAS " + p2.size());
            System.out.println("PLAYER 3 HAS " + p3.size());

            if (p1.size() == 0) {


                System.out.println("Final Showdown Between 2 and 3");
                try {
                    Card retval2 = p2.getFirst();
                } catch (Exception NONELEFT) {
                    winCon = true;
                    System.out.println("P3 wins!");
                }
                try {
                    Card retval3 = p3.getFirst();

                } catch (Exception NONELEFT) {
                    winCon = true;
                    System.out.println("P2 wins!");

                }
                System.out.println("PLAYER 2 HAS " + p2.size());
                System.out.println("PLAYER 3 HAS " + p3.size());
                if (p2.size() == 0) {
                    winCon = true;
                    System.out.println("Game Over: P3 WINS");
                    break;
                }
                if (p3.size() == 0) {
                    winCon = true;
                    System.out.println("Game Over: P2 WINS");
                    break;
                } else {

                    Card retval2 = p2.getFirst();
                    String ranking = String.valueOf(retval2.rank);
                    if (retval2.rank == 22) {
                        ranking = "Queen";
                    }
                    if (retval2.rank == 23) {
                        ranking = "King";
                    }
                    if (retval2.rank == 23) {
                        ranking = "Joker";
                    }
                    ///Change 22 and above ranks to king queen jack
                    System.out.println("Player 2's Card " + retval2.suit + " " + ranking);
                    Card retval3 = p3.getFirst();
                    String ranking3 = String.valueOf(retval3.rank);
                    if (retval3.rank == 22) {
                        ranking3 = "Queen";
                    }
                    if (retval3.rank == 23) {
                        ranking3 = "King";
                    }
                    if (retval3.rank == 23) {
                        ranking3 = "Joker";
                    }
                    System.out.println("Player 3's Card " + retval3.suit + " " + ranking3);
                    if (retval2.rank == retval3.rank) {
                        System.out.println("It's a war!");
                        wars++;
                        Deque<Card> spoils = new ArrayDeque<Card>();
                        if ((p2.size() > 4) && (p3.size() > 4)) {
                            //p2 remove 4 cards
                            spoils.add(p2.pop());
                            Card warCard2 = p2.getFirst();
                            spoils.add(p2.pop());
                            spoils.add(p2.pop());
                            spoils.add(p2.pop());
                            System.out.println("Player 2 removes 4 cards and adds them to the war pool.");
                            //p3 remove 4 cards
                            spoils.add(p3.pop());
                            Card warCard3 = p2.getFirst();
                            spoils.add(p3.pop());
                            spoils.add(p3.pop());
                            spoils.add(p3.pop());
                            System.out.println("Player 3 removes 4 cards and adds them to the war pool.");
                            String warCard2Rank = String.valueOf(warCard2.rank);
                            String warCard3Rank = String.valueOf(warCard3.rank);
                            if (warCard2.rank == 22) {
                                warCard2Rank = "Queen";
                            }
                            if (retval3.rank == 23) {
                                warCard2Rank = "King";
                            }
                            if (retval3.rank == 23) {
                                warCard2Rank = "Joker";
                            }
                            if (warCard3.rank == 22) {
                                warCard3Rank = "Queen";
                            }
                            if (retval3.rank == 23) {
                                warCard3Rank = "King";
                            }
                            if (retval3.rank == 23) {
                                warCard3Rank = "Joker";
                            }
                            System.out.println("Player 2 draws " + warCard2.suit + " " + warCard2Rank + " \n" + "Player 3 draws " + warCard3.suit + " " + warCard3Rank);

                            if (warCard2.rank > warCard3.rank) {
                                System.out.println("P2 wins war!");
                                p2.addAll(spoils);
                            }
                            if (warCard3.rank > warCard2.rank) {
                                System.out.println("P3 wins war!");
                                p3.addAll(spoils);
                            }
                            if (warCard2.rank == warCard3.rank) {
                                System.out.println("Double War! It's a tie! GAME OVER");
                                winCon = true;
                                doubwars++;
                                break;
                            }

                        } else if ((p2.size() <= 4) || (p3.size() <= 4)) {
                            System.out.println("Too few cards for war! Users draw their last card instead.");
                            wars++;
                            Card war2 = p2.getLast();
                            Card war3 = p3.getLast();
                            String warCard2Rank = String.valueOf(war2.rank);
                            String warCard3Rank = String.valueOf(war3.rank);
                            if (war2.rank == 22) {
                                warCard2Rank = "Queen";
                            }
                            if (retval3.rank == 23) {
                                warCard2Rank = "King";
                            }
                            if (retval3.rank == 23) {
                                warCard2Rank = "Joker";
                            }
                            if (war3.rank == 22) {
                                warCard3Rank = "Queen";
                            }
                            if (retval3.rank == 23) {
                                warCard3Rank = "King";
                            }
                            if (retval3.rank == 23) {
                                warCard3Rank = "Joker";
                            }
                            System.out.println("P2 has " + warCard2Rank + " " + war2.suit);
                            System.out.println("P3 has " + warCard3Rank + " " + war3.suit);
                            if ((war2.rank > war3.rank) && (p2.size() > p3.size())) {
                                System.out.println();
                                System.out.println("P2 Wins the War! \nP3 has no cards left! GAME OVER: P2 WINS");
                                p2.add(war3);
                                p3.remove(war3);
                                break;
                            }
                            if ((war3.rank > war2.rank) && (p3.size() > p2.size())) {
                                System.out.println("P3 Wins the War! \nP2 has no cards left! GAME OVER: P3 WINS");
                                p3.add(war2);
                                p2.remove(war2);
                                break;
                            }
                            if ((war2.rank > war3.rank) && (p2.size() < p3.size())) {
                                System.out.println();
                                System.out.println("P2 Wins the War!");
                                p2.add(war3);
                                p3.remove(war3);
                            }
                            if ((war3.rank > war2.rank) && (p3.size() < p2.size())) {
                                System.out.println("P3 Wins the War!");
                                p3.add(war2);
                                p2.remove(war2);
                            }
                        }
                    } else if (retval2.rank > retval3.rank) {
                        p3.remove(retval3);
                        p2.addLast(retval3);
                        p2.removeFirst();
                        p2.addLast(retval2);
                    } else if (retval2.rank < retval3.rank) {
                        p2.remove(retval2);
                        p3.addLast(retval2);
                        p3.removeFirst();
                        p3.addLast(retval3);
                    }
                }
                break;
            }

            if (p2.size() == 0) {

                System.out.println("Final Showdown Between 1 and 3");
                try {
                    Card retval1 = p1.getFirst();
                } catch (Exception NONELEFT) {
                    winCon = true;
                    System.out.println("P3 wins!");
                }
                try {
                    Card retval3 = p3.getFirst();

                } catch (Exception NONELEFT) {
                    winCon = true;
                    System.out.println("P1 wins!");

                }
                System.out.println("PLAYER 1 HAS " + p1.size());
                System.out.println("PLAYER 3 HAS " + p3.size());
                if (p1.size() == 0) {
                    winCon = true;
                    System.out.println("Game Over: P3 WINS");
                    break;
                }
                if (p3.size() == 0) {
                    winCon = true;
                    System.out.println("Game Over: P1 WINS");
                    break;
                } else {

                    Card retval1 = p1.getFirst();
                    String ranking = String.valueOf(retval1.rank);
                    if (retval1.rank == 11) {
                        ranking = "Queen";
                    }
                    if (retval1.rank == 13) {
                        ranking = "King";
                    }
                    if (retval1.rank == 13) {
                        ranking = "Joker";
                    }
                    ///Change 11 and above ranks to king queen jack
                    System.out.println("Player 1's Card " + retval1.suit + " " + ranking);
                    Card retval3 = p3.getFirst();
                    String ranking3 = String.valueOf(retval3.rank);
                    if (retval3.rank == 11) {
                        ranking3 = "Queen";
                    }
                    if (retval3.rank == 13) {
                        ranking3 = "King";
                    }
                    if (retval3.rank == 13) {
                        ranking3 = "Joker";
                    }
                    System.out.println("Player 3's Card " + retval3.suit + " " + ranking3);
                    if (retval1.rank == retval3.rank) {
                        System.out.println("It's a war!");
                        wars++;
                        Deque<Card> spoils = new ArrayDeque<Card>();
                        if ((p1.size() > 4) && (p3.size() > 4)) {
                            //p1 remove 4 cards
                            spoils.add(p1.pop());
                            Card warCard1 = p1.getFirst();
                            spoils.add(p1.pop());
                            spoils.add(p1.pop());
                            spoils.add(p1.pop());
                            System.out.println("Player 1 removes 4 cards and adds them to the war pool.");
                            //p3 remove 4 cards
                            spoils.add(p3.pop());
                            Card warCard3 = p1.getFirst();
                            spoils.add(p3.pop());
                            spoils.add(p3.pop());
                            spoils.add(p3.pop());
                            System.out.println("Player 3 removes 4 cards and adds them to the war pool.");
                            String warCard1Rank = String.valueOf(warCard1.rank);
                            String warCard3Rank = String.valueOf(warCard3.rank);
                            if (warCard1.rank == 11) {
                                warCard1Rank = "Queen";
                            }
                            if (retval3.rank == 13) {
                                warCard1Rank = "King";
                            }
                            if (retval3.rank == 13) {
                                warCard1Rank = "Joker";
                            }
                            if (warCard3.rank == 11) {
                                warCard3Rank = "Queen";
                            }
                            if (retval3.rank == 13) {
                                warCard3Rank = "King";
                            }
                            if (retval3.rank == 13) {
                                warCard3Rank = "Joker";
                            }
                            System.out.println("Player 1 draws " + warCard1.suit + " " + warCard1Rank + " \n" + "Player 3 draws " + warCard3.suit + " " + warCard3Rank);

                            if (warCard1.rank > warCard3.rank) {
                                System.out.println("P1 wins war!");
                                p1.addAll(spoils);
                            }
                            if (warCard3.rank > warCard1.rank) {
                                System.out.println("P3 wins war!");
                                p3.addAll(spoils);
                            }
                            if (warCard1.rank == warCard3.rank) {

                                System.out.println("Double War! It's a tie! GAME OVER");
                                doubwars++;
                                winCon = true;
                            }

                        } else if ((p1.size() <= 4) || (p3.size() <= 4)) {
                            System.out.println("Too few cards for war! Users draw their last card instead.");
                            wars++;
                            Card war1 = p1.getLast();
                            Card war3 = p3.getLast();
                            String warCard1Rank = String.valueOf(war1.rank);
                            String warCard3Rank = String.valueOf(war3.rank);
                            if (war1.rank == 11) {
                                warCard1Rank = "Queen";
                            }
                            if (retval3.rank == 13) {
                                warCard1Rank = "King";
                            }
                            if (retval3.rank == 13) {
                                warCard1Rank = "Joker";
                            }
                            if (war3.rank == 11) {
                                warCard3Rank = "Queen";
                            }
                            if (retval3.rank == 13) {
                                warCard3Rank = "King";
                            }
                            if (retval3.rank == 13) {
                                warCard3Rank = "Joker";
                            }
                            System.out.println("P1 has " + warCard1Rank + " " + war1.suit);
                            System.out.println("P3 has " + warCard3Rank + " " + war3.suit);
                            if ((war1.rank > war3.rank) && (p1.size() > p3.size())) {
                                System.out.println();
                                System.out.println("P1 Wins the War! \nP3 has no cards left! GAME OVER: P1 WINS");
                                p1.add(war3);
                                p3.remove(war3);

                                break;
                            }
                            if ((war3.rank > war1.rank) && (p3.size() > p1.size())) {
                                System.out.println("P3 Wins the War! \nP1 has no cards left! GAME OVER: P3 WINS");
                                p3.add(war1);
                                p1.remove(war1);
                                break;
                            }
                            if ((war1.rank > war3.rank) && (p1.size() < p3.size())) {
                                System.out.println();
                                System.out.println("P1 Wins the War!");
                                p1.add(war3);
                                p3.remove(war3);
                            }
                            if ((war3.rank > war1.rank) && (p3.size() < p1.size())) {
                                System.out.println("P3 Wins the War!");
                                p3.add(war1);
                                p1.remove(war1);
                            }
                        }
                    } else if (retval1.rank > retval3.rank) {
                        p3.remove(retval3);
                        p1.addLast(retval3);
                        p1.removeFirst();
                        p1.addLast(retval1);
                    } else if (retval1.rank < retval3.rank) {
                        p1.remove(retval1);
                        p3.addLast(retval1);
                        p3.removeFirst();
                        p3.addLast(retval3);
                    }
                }

            }
            if (p3.size() == 0) {

                System.out.println("Final Showdown Between 1 and 2");
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
                    if (retval1.rank == 11) {
                        ranking = "Queen";
                    }
                    if (retval1.rank == 12) {
                        ranking = "King";
                    }
                    if (retval1.rank == 12) {
                        ranking = "Joker";
                    }
                    ///Change 11 and above ranks to king queen jack
                    System.out.println("Player 1's Card " + retval1.suit + " " + ranking);
                    Card retval2 = p2.getFirst();
                    String ranking2 = String.valueOf(retval2.rank);
                    if (retval2.rank == 11) {
                        ranking2 = "Queen";
                    }
                    if (retval2.rank == 12) {
                        ranking2 = "King";
                    }
                    if (retval2.rank == 12) {
                        ranking2 = "Joker";
                    }
                    System.out.println("Player 2's Card " + retval2.suit + " " + ranking2);
                    if (retval1.rank == retval2.rank) {
                        System.out.println("It's a war!");
                        wars++;
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
                            if (warCard1.rank == 11) {
                                warCard1Rank = "Queen";
                            }
                            if (retval2.rank == 12) {
                                warCard1Rank = "King";
                            }
                            if (retval2.rank == 12) {
                                warCard1Rank = "Joker";
                            }
                            if (warCard2.rank == 11) {
                                warCard2Rank = "Queen";
                            }
                            if (retval2.rank == 12) {
                                warCard2Rank = "King";
                            }
                            if (retval2.rank == 12) {
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
                                doubwars++;
                                winCon = true;
                            }

                        }
                        if ((p1.size() <= 4) || (p2.size() <= 4)) {
                            System.out.println("Too few cards for war! Users draw their last card instead.");
                            wars++;
                            Card war1 = p1.getLast();
                            Card war2 = p2.getLast();
                            String warCard1Rank = String.valueOf(war1.rank);
                            String warCard2Rank = String.valueOf(war2.rank);
                            if (war1.rank == 11) {
                                warCard1Rank = "Queen";
                            }
                            if (retval2.rank == 12) {
                                warCard1Rank = "King";
                            }
                            if (retval2.rank == 12) {
                                warCard1Rank = "Joker";
                            }
                            if (war2.rank == 11) {
                                warCard2Rank = "Queen";
                            }
                            if (retval2.rank == 12) {
                                warCard2Rank = "King";
                            }
                            if (retval2.rank == 12) {
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
                            if ((war2.rank > war1.rank) && (p2.size() > p1.size())) {
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
                            if ((war2.rank > war1.rank) && (p2.size() < p1.size())) {
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
            }

            //I'll have Queen, King, and Joker be worth 11,12,13 respectively will add way to print correct names soon
            if (p1.size() == 52) {
                winCon = true;
                System.out.println("Game Over: P1 WINS");
                break;
            }
            if (p2.size() == 52) {
                winCon = true;
                System.out.println("Game Over: P2 WINS");
                break;
            }
            if (p3.size() == 52) {
                winCon = true;
                System.out.println("Game Over: P3 WINS");
                break;
            } else {

                if (p1.size() != 0 && p2.size() != 0 && p3.size() != 0) {
                    Card retval1 = p1.getFirst();
                    String ranking = String.valueOf(retval1.rank);
                    if (retval1.rank == 11) {
                        ranking = "Queen";
                    }
                    if (retval1.rank == 12) {
                        ranking = "King";
                    }
                    if (retval1.rank == 13) {
                        ranking = "Joker";
                    }
                    ///Change 11 and above ranks to king queen jack
                    System.out.println("Player 1's Card " + retval1.suit + " " + ranking);
                    Card retval2 = p2.getFirst();
                    String ranking2 = String.valueOf(retval2.rank);
                    if (retval2.rank == 11) {
                        ranking2 = "Queen";
                    }
                    if (retval2.rank == 12) {
                        ranking2 = "King";
                    }
                    if (retval2.rank == 13) {
                        ranking2 = "Joker";
                    }
                    System.out.println("Player 2's Card " + retval2.suit + " " + ranking2);

                    Card retval3 = p3.getFirst();
                    String ranking3 = String.valueOf(retval3.rank);
                    if (retval3.rank == 11) {
                        ranking3 = "Queen";
                    }
                    if (retval3.rank == 12) {
                        ranking3 = "King";
                    }
                    if (retval3.rank == 13) {
                        ranking3 = "Joker";
                    }
                    ///Change 11 and above ranks to king queen jack
                    System.out.println("Player 3's Card " + retval3.suit + " " + ranking3);
                    if ((retval1.rank == retval2.rank) && (retval1.rank == retval3.rank)) {
                        System.out.println("TRIPLE TIE \nGAME OVER");
                        threewars++;
                        break;
                    }
                    if ((retval1.rank > retval2.rank) && (retval1.rank > retval3.rank)) {
                        System.out.println("P1 Wins");
                        p1.add(p2.getFirst());
                        p2.removeFirst();
                        p1.add(p3.getFirst());
                        p3.removeFirst();
                    }
                    if ((retval2.rank > retval3.rank) && (retval2.rank > retval1.rank)) {
                        System.out.println("P2 Wins");
                        p2.add(p3.getFirst());
                        p3.removeFirst();
                        p2.add(p1.getFirst());
                        p1.removeFirst();
                    }
                    if ((retval3.rank > retval1.rank) && (retval3.rank > retval2.rank)) {
                        System.out.println("P3 Wins");
                        p3.add(p2.getFirst());
                        p2.removeFirst();
                        p3.add(p1.getFirst());
                        p1.removeFirst();
                    }
                    if ((retval3.rank == retval1.rank) && (retval3.rank > retval2.rank)) {
                        System.out.println("P3 War With P1");
                        wars++;
                        //flip a coin
                        Double number = Math.random();
                        if (number < 0.5) {
                            System.out.println("P3 Wins!");
                            p3.add(p1.getLast());
                            p1.removeLast();
                            p3.addLast(retval2);
                            p2.remove(retval2);
                        } else {
                            System.out.println("P1 Wins");
                            p1.add(p3.getLast());
                            p3.removeLast();
                            p1.addLast(retval2);
                            p2.remove(retval2);
                        }
                    }
                    if ((retval2.rank == retval3.rank) && (retval2.rank > retval1.rank)) {
                        System.out.println("P2 War With P3");
                        wars++;
                        //flip a coin
                        Double number = Math.random();
                        if (number < 0.5) {
                            System.out.println("P3 Wins!");
                            p3.add(p2.getLast());
                            p2.removeLast();
                            p3.addLast(retval1);
                            p1.remove(retval1);
                        } else {
                            System.out.println("P2 Wins");
                            p2.add(p3.getLast());
                            p3.removeLast();
                            p2.addLast(retval1);
                            p1.remove(retval1);
                        }
                    }

                    if ((retval2.rank == retval1.rank) && (retval2.rank > retval3.rank)) {
                        System.out.println("P2 War With P1");
                        wars++;
                        //flip a coin
                        Double number = Math.random();
                        if (number < 0.5) {
                            System.out.println("P2 Wins!");
                            p2.add(p1.getLast());
                            p1.removeLast();
                            p2.addLast(retval1);
                            p3.remove(retval2);
                        } else {
                            System.out.println("P1 Wins");
                            p1.add(p3.getLast());
                            p3.removeLast();
                            p1.addLast(retval1);
                            p3.remove(retval2);
                        }
                    }

                    if ((retval1.rank == retval2.rank) && (retval2.rank == retval3.rank)) {
                        System.out.println("It's a war!");
                        wars++;
                        Deque<Card> spoils = new ArrayDeque<Card>();
                        Card warcard1 = p1.getLast();
                        Card warcard2 = p2.getLast();
                        Card warcard3 = p3.getLast();
                        if ((warcard1.rank > warcard2.rank) && (warcard1.rank > warcard3.rank)) {
                            System.out.println("P1 Wins");
                            p1.add(p2.getLast());
                            p2.removeLast();
                            p1.add(p3.getLast());
                            p3.removeLast();
                        }
                        if ((warcard2.rank > warcard3.rank) && (warcard2.rank > warcard1.rank)) {
                            System.out.println("P2 Wins");
                            p2.add(p3.getLast());
                            p3.removeLast();
                            p2.add(p1.getLast());
                            p1.removeLast();
                        }
                        if ((warcard3.rank > warcard1.rank) && (warcard3.rank > warcard2.rank)) {
                            System.out.println("P3 Wins");
                            p3.add(p2.getLast());
                            p2.removeLast();
                            p3.add(p1.getLast());
                            p1.removeLast();
                        }

                    }

                }

            }
            step++;
            doubwars+= doubwars;
            three += threewars;

        }
        double[] valueOutput = {step, wars, doubwars, three};
        return valueOutput;
    }
        public static void main (String[]args)
        {

            War thisGame = new War();
            List deck = createDeck();
            System.out.println("Welcome to the Card Game WAR. Starting the game...");
            double step = 0;
            double wars = 0;
            double doubwars = 0;
            double threewars = 0;
            for(int i = 0; i<=1000; i++)
            {
                //index[0] = steps index[1] = wars index[2] = double wars index[3] = triple wars
                double[] listing = thisGame.playRound(deck);
            step += listing[0];
            wars += listing[1];
            doubwars+=listing[2];
            threewars+=listing[3];


            }
            System.out.println("The average step number was " + step/1000);
            System.out.println("The average number of wars was " + wars/1000);
            System.out.println("The average number of double wars was " + doubwars/1000);
            System.out.println("The average number of triple wars was " + threewars/1000);


        }



}
