import java.util.Arrays;
import java.util.Random;

class Auto {
    float[] przebieg;

    public Auto() {
        this.przebieg = new float[12];

        Random rand = new Random();

        for (int i = 0; i < this.przebieg.length; i++) {
            this.przebieg[i] = (float) (rand.nextInt(100) + 1);
        }
    }

    public float srPrzebieg() {
        double sum = 0;
        for (int i = 0; i < this.przebieg.length; i++) {
            sum += this.przebieg[i];
        }
        return (float) (sum / this.przebieg.length);

    }
}