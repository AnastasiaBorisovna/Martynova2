public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.77;
        int weight = 77;
        int bmi = service.calculate((double) height, weight);
        System.out.println(bmi);
    }
}