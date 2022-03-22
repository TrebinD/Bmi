public class BmiService {

    public double calculate(int weight, double height) {
        double resHight = height / 100;
        double bmi = weight / (resHight * resHight);
        return bmi;

    }
}
