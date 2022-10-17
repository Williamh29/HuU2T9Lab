public class CircleRunner {
        public static void main (String []args) {
            Circle circle = new Circle(5.0);
            String info = circle.getInfo();
            System.out.println(info);

            circle.setRadius(9.2);
            info = circle.getInfo();
            System.out.println(info);
            double x = 6.5;
            double thirdPower = Math.pow(x, 3);
            System.out.println(thirdPower);
        }
}
