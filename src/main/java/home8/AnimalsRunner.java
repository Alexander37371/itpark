package home8;

public class AnimalsRunner {

    public static void main(String[] args) {
        Animals caw = new Caw("Mooooo");
        Animals pig = new Pig("Weee Weee");
        Animals snake = new Snake("Sh-sh-sh-sh-sh");
        Animals tiger = new Tiger("Arrrr, rrr");
        Animals[] allAnimals = new Animals[]{caw, pig, snake, tiger};
        for (Animals animals : allAnimals) {
            animals.voice("voice");
        }
        {

        }
        System.out.println(caw);
        System.out.println(pig);
        System.out.println(snake);
        System.out.println(tiger);
        ((Caw) caw).voice();
        ((Pig) pig).voice();
        ((Snake) snake).voice();
        ((Tiger) tiger).voice();


    }

}
