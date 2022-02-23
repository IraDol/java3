public class Main {
    public static void main(String[] args) {
        BonusMilesService miles = new BonusMilesService();
        int result = miles.calculate(6000);
        System.out.println("Ваши бонусные мили " + result);

    }
}
