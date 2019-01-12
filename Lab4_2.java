import java.util.Objects;
import java.util.Random;

public class Lab4_2 {
    public static void main(String[] args) {

        Random random = new Random();
        random.nextInt(10);


        for (int i = 1; i <= 3; i++) {
            System.out.println(random.nextInt(10));
        }

        if (random.equals(7) && random.equals(7) && random.equals(7)){
            System.out.println("Wygrałeś!!!");
        }else {
            System.out.println("Spróbuj jeszcze raz");
        }
    }

    public class Losowanie{
        int x;
        int y;
        int z;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getZ() {
            return z;
        }

        public void setZ(int z) {
            this.z = z;
        }

        @Override
        public String toString() {
            return "Losowanie{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Losowanie losowanie = (Losowanie) o;
            return x == losowanie.x &&
                    y == losowanie.y &&
                    z == losowanie.z;
        }

        @Override
        public int hashCode() {

            return Objects.hash(x, y, z);
        }
    }

}
