public class BonusMilesService {
    public int calculate (int ticket) {
        int priceMile = 20;
        int mile = ticket / priceMile;
        return mile;
    }
}
