public class AbstractTester {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        ((Rectangle) s).getLength(4);
        ((Rectangle) s).setWidth(6);
        System.out.println(s.getArea());

    }
}
        abstract class Shape {
            private String color;

            abstract double getArea();
        }

        class Rectangle extends Shape{
            private int length;
            private int width;

            @Override
            double getArea() {
                return 0;
            }

            public int getLength(int i) {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }

