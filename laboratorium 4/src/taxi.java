
    import java.util.Random;

    class Taxi extends Auto {
        float[] zarobki;

        public Taxi() {
            this.zarobki=new float[12];

            Random rand = new Random();

            for (int i=0;i<this.zarobki.length;i++){
                this.zarobki[i]= (float) (rand.nextInt(100) + 1);

            }
        }

        public float srzarobki(){
            double sum=0;
            for (int i=0;i<this.zarobki.length;i++){
                sum+=this.zarobki[i];
            }
            return (float) (sum /  this.zarobki.length);

        }
        public void main(){
            System.out.println("Sredni przebieg: "+ this.srPrzebieg());
            System.out.println("Srednie zarobki: "+ this.srzarobki());

        }


    }


