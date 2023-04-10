
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        System.out.println();
        System.out.println("Расчёт миль на разных примерах:");
        System.out.println();
        System.out.println("Количество миль при стоимости билета 19 руб:");
        System.out.println(service.calculate(19));

        System.out.println();
        System.out.println("Количество миль при стоимости билета 20 руб:");
        System.out.println(service.calculate(20));

        System.out.println();
        System.out.println("Количество миль при стоимости билета 21 руб:");
        System.out.println(service.calculate(21));

    }
}
