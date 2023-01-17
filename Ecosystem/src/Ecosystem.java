import java.util.Random;

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
        //populate river with bears
        while(bearPop < initialBearPop){
            int a = ran.nextInt();
            int b = ran.nextInt();
            if(River[a][b]==null){
                River[a][b] = new Animal.Bear();
                bearPop++;
            }
        }

    }
}


