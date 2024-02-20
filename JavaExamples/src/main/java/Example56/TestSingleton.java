package Example56;

public class TestSingleton {

    public static void main(String[] args) {

        //Connection c = new Connection();
        Connection c = Connection.getInstance();
        // THERE CAN ONLY BE ONE REFERENCE TO A CONNECTION OBJECT
        Connection d = Connection.getInstance();
        // c and d are same reference
    }
}
