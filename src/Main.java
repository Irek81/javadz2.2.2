public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        double height = 1.69;
        double bmi = service.calculate (height, weight);
        System.out.println(bmi);
    }
}
