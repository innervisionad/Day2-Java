package dayTwo.Example;

/**
 * Created by student on 28-Jun-16.
 */
public abstract class Animal {

    private boolean hasBackBone;
    private int lifeExpectancy;

    public boolean isHasBackBone() {
        return hasBackBone;
    }

    public void setHasBackBone(boolean hasBackBone) {
        this.hasBackBone = hasBackBone;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Animal() {}


    public void move(){
        System.out.println("he's moving!");
    }
    public abstract void eat();



}


