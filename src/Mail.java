public class Mail {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 5034;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
