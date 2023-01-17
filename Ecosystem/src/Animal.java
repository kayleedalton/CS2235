import java.util.Random;

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