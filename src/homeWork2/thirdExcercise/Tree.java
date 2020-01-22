package homeWork2.thirdExcercise;

public class Tree {
    private Leaf[] leaves;
    public Tree(){

    }
    public Tree(Leaf[] leaves) {
        int n = leaves.length;
        this.leaves = new Leaf[n];
        for(int i = 0; i < n; i++){
            this.leaves[i] = new Leaf();
        }
    }

    public Leaf[] getLeaves() {
        int n = this.leaves.length;
        Leaf[] leaves = new Leaf[n];
        for(int i = 0; i < n; i++){
            leaves[i] = new Leaf();
        }
        return leaves;
    }

    public void setLeaves(Leaf[] leaves) {
        int n = leaves.length;
        this.leaves = new Leaf[n];
        for(int i = 0; i < n; i++){
            this.leaves[i] = new Leaf();
        }
    }
    public void bloom(){
        System.out.println("tree blooms");
    }
    public void makeLeavesYellow(){
        System.out.println("leaves are yellow");
    }
    public void makeLeavesFall(){
        leaves = new Leaf[0];
        System.out.println("leaves have fallen");
    }
}
