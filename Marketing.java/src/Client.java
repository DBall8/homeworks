import java.util.ArrayList;

public class Client {

    private int clientID;
    private String clientName;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Client(int clientID, String clientName){
        this.clientID = clientID;
        this.clientName = clientName;
    }

    public double totalSales(){
        return 0.0;
    }
}
