package models;

public class Mortgage {

    private double amount;
    private double rate;
    private int years;

    public Mortgage(){
        amount = 0;
        rate = 0;
        years = 0;
    }

    public Mortgage(double amount, double rate, int years){
        this.amount = amount;
        this.rate = rate;
        this.years = years;
    }

    public double calculateMonthlyPayment(){
        double monthlyRate = rate / 12;
        int n = years * 12;

        double compound = Math.pow(1 + monthlyRate, n);

        return amount * (monthlyRate * compound) / (compound - 1);
    }

    public double getAmount() { return amount; }

    public void setAmount(double amount) {this.amount = amount; }

    public double getRate() { return rate; }

    public void setRate(double rate){ this.rate = rate; }

    public int getYears(){ return years; }

    public void setYears(int years){ this.years = years; }

}
