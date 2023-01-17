///If it lags please try stopping and starting it a few times. I couldn't figure out why it was happening.
// It usually works after one or two tries (It also might just be my computer)
//Kaylee Dalton - Kerby 2235 - 9-29
//I stayed up all night doing this. It is 5 am as I turn this in.




import java.util.Random;
import java.util.Scanner;



class Animal
{
}

class Fish extends Animal
{
    //I don't know if I need anything in here so I left em blank.
}

class Bear extends Animal
{
}

class Ecosystem
{
    public static final double movePercent = 0.90; //they only move 90% of the time (This was mostly to help my computer not die)

    public static int    defaultFish  = 0;
    private int fishyCount = 0;

    public static int    defaultBears = 0;
    private int bearCount = 0

 ;

    public static final int    length          = 25;

    public static final int    height         = 20;

    //25*20 is 500





    private Animal[][] River;//They live in a river because that's where bears and fish like to hang out.

    private Random random = new Random();


    public Ecosystem()
    {
        River = new  Animal[length][height];
        int min = 10;
        int max = 15;
        ///Randomized the starting populations of animals.
        defaultBears = random.nextInt(max - min +min);
        defaultFish = random.nextInt(max - min +min);

//Create the starting locations. The animals are born into the world.
        while (bearCount < defaultBears)
        {bearCount += theMiracleOfLife (new Bear() );}

        while (fishyCount < defaultFish)
        {fishyCount += theMiracleOfLife (new Fish() );}



    }


    int theMiracleOfLife(Animal animal)//baby bears and fishies <3
    {

        int newborns = 0;
        int occupied = fishyCount + bearCount;
        boolean chekit = true;
        if (occupied < (length * height))
        {
            while (chekit)
            {
                int x = random.nextInt (length);
                int y = random.nextInt (height);

                if (River[x][y] == null)
                {
                    River[x][y] = animal;
                    chekit=false;
                    newborns++;
                }
            }
        }

        return newborns;
    }


    public String toString()
    {
      String outStr = "Number of Fish " + fishyCount + "\nNumber of Bears " + bearCount + "\nNumber of null " + (500-(bearCount+fishyCount));

        return outStr;
    }



    public void printIt()
    {
        System.out.println(this);pain();


    }
    public void pain () ///named for the pain it caused me
    {
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < length; x++)
            {
                if (River[x][y] != null)
                {
                    double chance = random.nextDouble();

                    if (chance < movePercent)//I had this < backwards > for a while and it made my program run FOREVER
                    {

                        boolean xCanMove = false;
                        boolean yCanMove = false;
                        int xChange = random.nextInt (3) - 1;
                        int yChange = random.nextInt (3) - 1;
                        int xNew = x + xChange;
                        int yNew = y + yChange;
                        if ((xChange != 0) && (xNew >= 0) && (xNew < length) )
                        {
                            xCanMove = true;
                        }
                        if ((yChange != 0) && (yNew >= 0) && (yNew < height) )
                        {
                            yCanMove = true;
                        }
                        if ((xCanMove == true) || (yCanMove == true))
                        {
                            int xFinal = x;
                            int yFinal = y;

                            if (xCanMove == true)
                                xFinal = xNew;

                            if (yCanMove == true)
                                yFinal = yNew;


                            if (River[xFinal][yFinal] == null)
                            {
                                River[xFinal][yFinal] = River[x][y];
                                River[x][y]           = null;
                            }
                            else if (River[x][y].getClass() == River[xFinal][yFinal].getClass() )
                            {

                                if (River[x][y].getClass().getName().equals ("Fish") == true)
                                    fishyCount += theMiracleOfLife (new Fish() );

                                if (River[x][y].getClass().getName().equals ("Bear") == true)
                                    bearCount += theMiracleOfLife (new Bear() );
                            }
                            else if (River[x][y].getClass() != River[xFinal][yFinal].getClass() )
                            {

                                if (River[x][y].getClass().getName().equals ("Fish") == true)
                                {
                                    if (fishyCount > 0)
                                    {
                                        River[x][y] = null;
                                        fishyCount--;
                                    }
                                }

                                if (River[xFinal][yFinal].getClass().getName().equals ("Fish") == true)
                                {
                                    if (fishyCount > 0)
                                    {
                                        River[xFinal][yFinal] = River[x][y];
                                        fishyCount--;
                                    }
                                }
                            }

                        }


                    }

                }
            }

        }

    }

    public static void main (String[] args)
    {
        Ecosystem riv = new Ecosystem ();
        int moveNumber = 1;


        System.out.println("There has been " + moveNumber + " move.");
        while (riv.fishyCount > 0) //This lags if I have the random number set to higher than 15 but
                                  // it's still random within a small range. :)
                                //stops when hits NO FISH
    {

        System.out.println("There have been " + moveNumber + " moves");
        riv.printIt();
        moveNumber++;
    }
        System.out.println("There are no more fish!");




    }


}