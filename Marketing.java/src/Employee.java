import java.lang.reflect.Array;
import java.util.ArrayList;

public class Employee {

    private ArrayList<Client> clients = new ArrayList<Client>();

    public Employee(){

    };

    public Boolean addClient(){ return false; }

    public ArrayList<Client> getClients(){ return this.clients; }
}
