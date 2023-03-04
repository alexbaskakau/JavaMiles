
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 500;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
        // System.out.println(service.calculate(1_000));
    }
}