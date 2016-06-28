package dayTwo.Example;

/**
 * Created by student on 28-Jun-16.
 */
public class AniProgram {

    public static void main(String[] args) {
        Mammal pig = new Mammal(13);

        pig.eat();
        System.out.println(pig.isHasBackBone());
        pig.move();

    }
}
