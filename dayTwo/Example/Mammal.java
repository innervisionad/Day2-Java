package dayTwo.Example;

/**
 * Created by student on 28-Jun-16.
 */
public class Mammal extends vertebrate {


   public boolean liveYoung;
   public boolean makeMilk;


    public Mammal(int lifeExpectancy){
        setLifeExpectancy(lifeExpectancy);
        makeMilk = true;
    }

    public void eat(){System.out.println("He's chewing food");}

    @Override
    public void move(){
        System.out.println("Mammalian movement!");
    }

}
