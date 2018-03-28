import java.util.ArrayList;

public class MarketingManager {

    protected String employeeName;
    protected ArrayList<Employee> employees = new ArrayList<Employee>();
    protected MarketingManager manager;
    protected long marketingID;

    public MarketingManager(String employeeName, MarketingManager manager, long marketingID){
        this.employeeName = employeeName;
        this.manager = manager;
        this.marketingID = marketingID;
    }

    double bonus(){
        return 0.0;
    }
}
