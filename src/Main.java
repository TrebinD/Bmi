
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double resultNorm = service.calculate(86, 186);

        System.out.printf("Индекс массы тела: %5.1f кг/м2 %n", resultNorm);
    }
}
