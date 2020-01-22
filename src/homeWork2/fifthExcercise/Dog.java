package homeWork2.fifthExcercise;



public class Dog extends Animal {
    private Puppy[] puppies;
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{ " + this.getName() + " }";
    }

    public Puppy[] getPuppies() {
        if(puppies==null) return new Puppy[0];
        int n = this.puppies.length;
        Puppy[] puppies = new Puppy[n];
        for (int i = 0; i < n; i++){
            puppies[i] = new Puppy();
        }
        return puppies;
    }

    public void setPuppies(Puppy[] puppies) {
        int n = puppies.length;
        this.puppies = new Puppy[n];
        for (int i = 0; i < n; i++){
            this.puppies[i] = new Puppy();
        }
    }
    public void printName(){
        System.out.println(this.getName());
    }
    public void bark(){
        System.out.println("դեռ էտ հրամանը չի սովորել");
    }
    public void giveOffspring(){
        int n = (int)(1+Math.random()*8);
        puppies = new Puppy[n];
        System.out.println("dog has: " + puppies.length + " offspring");
    }
}
