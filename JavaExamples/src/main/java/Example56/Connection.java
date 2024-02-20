package Example56;

public class Connection {


    // Make your constructor private
    // ==> prevent instantiation by Constructor
    // ==> prevent inheritance, because super() won't work
    private Connection(){
    }

    // static factory method (factory - make objects)
    private static Connection connection;

    // either return connection, or instantiate and return
    public static Connection getInstance(){
        if( connection  == null){
            connection = new Connection();
            return connection;
        }else{
            return connection;
        }

    }



    public String getData(){
        return "here's some data";
    }
}
