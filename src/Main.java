public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(100000, 20);
        System.out.println("Количество бонусных миль: " + miles);
    }
}