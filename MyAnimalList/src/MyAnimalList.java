public class MyAnimalList {

    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.print("Animal, " + animals[nextIndex].getClass() + " added at "
                    + nextIndex + " says " );
            animals[nextIndex].makeNoise();
            nextIndex++;
        }
    }
}
