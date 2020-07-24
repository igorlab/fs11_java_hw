public class Family {
    private Human mother;
    private Human father;
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

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren(){
        return this.children;
    }


    public String getChildrenS() {


        StringBuilder childrenS = new StringBuilder();
        for (Human child : this.getChildren()) {
            childrenS.append(child.toString()+'\n');
        }

        return childrenS.toString();
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family["+cnt+"]{\n" +
                father.toString() + '\n' +
                mother.toString() + '\n' +
                (pet != null ? pet.toString() : "no pet" )+ '\n' +
                ( children.length > 0 ? ("child: " + this.getChildrenS()) : "No child\n" ) +
                "}";
    }
}
