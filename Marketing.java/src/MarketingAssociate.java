public class MarketingAssociate {
    protected String employeeName;
    protected MarketingManager manager;
    protected long markteingID;

    public MarketingAssociate(String employeeName, MarketingManager manager, long markteingID) {
        this.employeeName = employeeName;
        this.manager = manager;
        this.markteingID = markteingID;
    }

    double bonus(){
        return 0.0;
    }
}
