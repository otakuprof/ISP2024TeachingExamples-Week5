package Example56;

public class Connection {

    private static Connection connection;

    private Connection(){
    }

    public static Connection getInstance(){
        if( connection == null){
            connection = new Connection();
        }
        return connection;
    }

    public String getData(){
        return "here's some data";
    }
}
