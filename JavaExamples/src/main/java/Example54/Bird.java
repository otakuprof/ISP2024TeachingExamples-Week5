package Example54;

public class Bird {

    // "I guarantee that flyBehaviour will have a doFly() method,
    // since it is of the FlyBehaviour interface
    private FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    // Since FlyBehaviour objects are guaranteed to have a doFly() method,
    // you can execute doFly() on flyBehaviour
    public void fly(){
        flyBehaviour.doFly();
    }
}
