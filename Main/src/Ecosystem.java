import java.util.Random;
import java.util.Scanner;

class Animal{
    private boolean moved;
    public void Moved(boolean moved) {
        this.moved = moved;
    }
    public boolean didMove(){
        return moved;
    }
    public int move() {
        Random ran = new Random();
        int direction = ran.nextInt(5);
        return direction;

    }
    public int getPop(){
        Random ran = new Random();
        int pop = ran.nextInt(251);
        return pop;
    }
static class Fish extends Animal{

    }
static class Bear extends Animal{

    }
}
public class Ecosystem {
    Random ran = new Random();
    static final int length = 20;
    static final int height = 25;
    /*static final int pop = Animal.getPop;*/
    static final int initialFishPop = 250;
    static final int initialBearPop = 249;

    Animal[][] River = new Animal[length][height];
    public Ecosystem(){
        int fishPop = 0;
        //Populate river with fish
        while(fishPop < initialFishPop){
            int x = ran.nextInt();
            int y = ran.nextInt();
            if (River[x][y]==null){
                River[x][y] = new Animal.Fish();
                fishPop++;
            }}
        int bearPop = 0;
        while(bearPop < initialBearPop){
            int a = ran.nextInt();
            int b = ran.nextInt();
            if(River[a][b]==null){
               River[a][b] = new Animal.Bear();
            }
        }
        System.out.println("There are currently" + bearPop + "bears.");
        System.out.println("There are currently" + fishPop + "fish.");
        }
    }

