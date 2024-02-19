package Example54;

public class Bird {

    private FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void fly(){
        flyBehaviour.doFly();
    }
}
