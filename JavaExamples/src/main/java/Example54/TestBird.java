package Example54;

import org.graalvm.compiler.bytecode.BridgeMethodUtils;

public class TestBird {
    public static void main(String[] args) {

        Bird bird = new Bird();
        // i want to say how the bird will fly
        // HAS-A relationship, composition
        bird.setFlyBehaviour( new LongDistanceFly());
        bird.fly();
        //change behaviour in runtime
        bird.setFlyBehaviour( new ChickenFly());
        bird.fly();

        // Design Pattern - known solution to OOP problem
        // Strategy Design Pattern - how do you change behaviours at runtime?
        // for algorithms, calculations as well

    }
}
