package Lecture7;

public class CarModel {
    public String carName;
    public String carColor;
    public int carReleaseYear;
    public int carHorsePower;
    public boolean boughtSecondHand;
    public CarModel(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        carName = name;
        carColor = color;
        carReleaseYear = releaseYear;
        carHorsePower = horsePower;
        boughtSecondHand = secondHand;
    }
    public CarModel(int releaseYear, int horsePower, boolean secondHand) {
        this("N/A", "N/A", releaseYear, horsePower, secondHand);
    }
    public CarModel(String name, String color, boolean secondHand) {
        this(name, color, -1, -1, secondHand);
    }
    public CarModel(String name, String color, int releaseYear, int horsePower) {
        this(name, color, releaseYear, horsePower, false);
    }
    public CarModel() {
    }
    public String toString() {
        return
                "Car Name: " + carName +
                ", Car Color: " + carColor +
                ", Car Release Year: " + carReleaseYear +
                ", Car Horse Power: " + carHorsePower +
                ", Bought Second Hand: " + boughtSecondHand +
                '.';
        }
    }