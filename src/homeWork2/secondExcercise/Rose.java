package homeWork2.secondExcercise;

import java.util.Arrays;

public class Rose {
    private Petal[] petals;
    private Bud[] buds;

    public Rose() {
    }

    public Rose(Petal[] petals, Bud[] buds) {
        this.petals = petals;
        this.buds = buds;
    }

    public Petal[] getPetals() {
        int n = petals.length;
        Petal[] petals = new Petal[n];
        for (int i = 0; i < n; i++){
            petals[i] = new Petal();
        }
        return petals;
    }

    public void setPetals(Petal[] petals) {
        int n = petals.length;
        this.petals = new Petal[n];
        for (int i = 0; i < n; i++){
            this.petals[i] = new Petal();
        }
    }

    public Bud[] getBuds() {
        int n = petals.length;
        Bud[] buds = new Bud[n];
        for (int i = 0; i < n; i++){
            buds[i] = new Bud();
        }
        return buds;
    }

    public void setBuds(Bud[] buds) {
        int n = buds.length;
        this.buds = new Bud[n];
        for (int i = 0; i < n; i++){
            this.buds[i] = new Bud();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rose)) return false;
        Rose rose = (Rose) o;
        return Arrays.equals(petals, rose.petals) &&
                Arrays.equals(buds, rose.buds);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(petals);
        result = 31 * result + Arrays.hashCode(buds);
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "petals=" + petals.length +
                ", buds=" + buds.length +
                '}';
    }
    public void Bloom(){
        System.out.println("Rose blooms");
    }
    public void Wilt(){
        System.out.println("Rose wilts");
    }
    public void printQuantityOfPetals(){
        System.out.println(petals.length + " petals");
    }
}
