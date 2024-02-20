package RandomExample;

public interface TopicInterface {
    void understand();
}

class TopicCatchNoBall implements TopicInterface{
    @Override
    public void understand() {
        System.out.println("catch no ball");
    }
}

class Subject{
    private TopicInterface t; //
    // you could also use a setter instead
    Subject(TopicInterface t){
        this.t = t;
    }

}
