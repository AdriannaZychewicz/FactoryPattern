/**
 * Created by ada on 10.03.15.
 */
public class Cat extends AbstractAnimal implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
