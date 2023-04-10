public class BonusMilesService {
    public int calculate(int price) {
        int milesStep = 20;
        int miles = (price / milesStep);
        return miles;
    }

}
