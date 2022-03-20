
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double resultNorm = service.calculate(77, 1.7);

        System.out.println(resultNorm);
    }
}
