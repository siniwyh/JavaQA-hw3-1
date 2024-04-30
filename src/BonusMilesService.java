public class BonusMilesService {
    public int calculate(int price) {
        int mileFor = 20;
        int miles = price / mileFor;
        return miles;
    }

}
