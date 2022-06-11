package Models;

public class DeliveryBoy {
    private String Name;
    private double EarnedAmount;
    private double Ratings;

    public DeliveryBoy(String name, double earnedAmount, double ratings) {
        Name = name;
        this.EarnedAmount = earnedAmount;
        this.Ratings = ratings;
    }
    public DeliveryBoy(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getEarnedAmount() {
        return EarnedAmount;
    }

    public void setEarnedAmount(double earnedAmount) {
        EarnedAmount = earnedAmount;
    }

    public double getRatings() {
        return Ratings;
    }

    public void setRatings(double ratings) {
        Ratings = ratings;
    }
}
