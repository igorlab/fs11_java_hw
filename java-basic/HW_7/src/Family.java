public class Family {
    private final Human0 mother;
    private final Human0 father;
    private Human0[] children;
    private Pet0 pet0;
    private static long cnt = 0;

    public Family(Human0 mother, Human0 father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human0[0];
        mother.setFamily0(this);
        father.setFamily0(this);
        cnt++;
    }
    public Family(Human0 mother, Human0 father, Human0[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        mother.setFamily0(this);
        father.setFamily0(this);
        cnt++;
    }
    public Family(Human0 mother, Human0 father, Human0[] children, Pet0 pet0) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet0 = pet0;
        mother.setFamily0(this);
        father.setFamily0(this);
        cnt++;
    }

    public Human0 getMother() {
        return mother;
    }
    public Human0 getFather() {
        return father;
    }

    public Human0[] getChildren(){
        return this.children;
    }

    public String getChildrenS() {

        StringBuilder childrenS = new StringBuilder();
        for (Human0 child : this.getChildren()) {
            childrenS.append(child.toString()).append('\n');
        }

        return childrenS.toString();
    }

    public void setChildren(Human0[] newChild) { // вдруг двойня

        int newChildrenLength = newChild.length + this.children.length;
        Human0[] oldNewChild = new Human0[newChildrenLength];

        for (Human0 childI : newChild) {
            childI.setFamily0(this);
        }

        System.arraycopy(this.children, 0, oldNewChild, 0, this.children.length);
        System.arraycopy(newChild, 0, oldNewChild, this.children.length, newChild.length);

        this.children = oldNewChild;

        System.out.printf("Added {%s} %s%n", newChild.length, newChild.length > 1 ? "children" : "child");
    }

    public Pet0 getPet() {
        return pet0;
    }

    public boolean getPet0() {
        return pet0 != null;
    }

    public void setPet0(Pet0 pet0) {
        this.pet0 = pet0;
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
                "Pet " + (pet0 != null ? pet0.toString() : "no" )+ '\n' +
                ( children.length > 0 ? ("child: " + this.getChildrenS()) : "No child\n" ) +
                "Family consist of " + countFamily() + " humans\n" +
                "}\n--------------------------------------------------------------------------------------------\n";
    }

}