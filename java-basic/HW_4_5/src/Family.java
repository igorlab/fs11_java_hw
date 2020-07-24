public class Family {
    private final Human mother;
    private final Human father;
    private Human[] children;
    private Pet pet;
    private static long cnt = 0;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        mother.setFamily(this);
        father.setFamily(this);
        cnt++;
    }
    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        mother.setFamily(this);
        father.setFamily(this);
        cnt++;
    }
    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        mother.setFamily(this);
        father.setFamily(this);
        cnt++;
    }

    public Human getMother() {
        return mother;
    }
    public Human getFather() {
        return father;
    }

    public Human[] getChildren(){
        return this.children;
    }

    public String getChildrenS() {

        StringBuilder childrenS = new StringBuilder();
        for (Human child : this.getChildren()) {
            childrenS.append(child.toString()).append('\n');
        }

        return childrenS.toString();
    }

    public void addChildren(Human[] newChild) { // вдруг двойня

        int newChildrenLength = newChild.length + this.children.length;
        Human[] oldNewChild = new Human[newChildrenLength];

        for (Human childI : newChild) {
            childI.setFamily(this);
        }

        System.arraycopy(this.children, 0, oldNewChild, 0, this.children.length);
        System.arraycopy(newChild, 0, oldNewChild, this.children.length, newChild.length);

        this.children = oldNewChild;

        System.out.printf("Added {%s} %s%n", newChild.length, newChild.length > 1 ? "children" : "child");
    }

    public boolean deleteChild (int index) {
        Human[] NewChild = new Human[0];
        if (index >= 0 && index < this.children.length) {
            if (this.children.length > 1){
                NewChild = new Human[this.children.length-1];
                int cnt = 0;
                for (int i = 0; i < this.children.length; i++) {
                    if (index != i) {
                        NewChild[cnt] = this.children[i];
                        cnt++;
                    }
                }
                this.children = NewChild;
            }
            else this.children = NewChild;


            return true;
        } else System.out.println("index is out of range");
        return false;
    }

    public Pet getPet() {
        return pet;
    }

    public boolean isPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    protected void finalize() {
        System.out.println("delete " + this.toString());
    }

    @Override
    public String toString() {
        return  "--------------------------------------------------------------------------------------------\n" +
                "Family["+cnt+"]{\n" +
                father.toString() + '\n' +
                mother.toString() + '\n' +
                "Pet " + (pet != null ? pet.toString() : "no" )+ '\n' +
                ( children.length > 0 ? ("child: " + this.getChildrenS()) : "No child\n" ) +
                "Family consist of " + countFamily() + " humans\n" +
                "}\n--------------------------------------------------------------------------------------------\n";
    }

}