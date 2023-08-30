public class Vogel<T> {
    private T height;
    private T wingspann;
    private T weight;
    private T habitat;
    private T color;
    private T name;
    private T fly;

    public Vogel() {
    }

    public Vogel(T height, T wingspann, T weight, T habitat, T color, T name,T fly) {

        this.height = height;
        this.wingspann = wingspann;
        this.weight = weight;
        this.habitat = habitat;
        this.color = color;
        this.name = name;
        this.fly = fly;
    }
    public T getHeight() {
        return height;
    }
    public void setHeight(T height){
        this.height = height;
    }
    public T getWingspann() {
        return wingspann;
    }
    public void setWingspann(T wingspann){
        this.wingspann = wingspann;
    }
    public T getWeight(){
        return weight;
    }
    public void setWeight(T weight){
        this.weight = weight;
    }
    public T getHabitat(){
        return habitat;
    }
    public void setHabitat(T habitat) {
        this.habitat = habitat;
    }
    public T getColor() {
        return color;
    }
    public void setColor(T color) {
        this.color = color;
    }
    public T getFly() {
        return fly;
    }
    public void setFly(T fly) {
        this.fly = fly;
    }
    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vogel{" +
                "height=" + height +
                ", wingspann=" + wingspann +
                ", weight=" + weight +
                ", habitat=" + habitat +
                ", color=" + color +
                ", name=" + name +
                ", fly=" + fly +
                '}';
    }

    // Wir legen innerhalb unserer selbst erstellten Klasse Vogel eine eigene Methode an!
    // Wir pr�fen ob unser Attribut "fly" auf unsere Objekte zutrifft oder nicht!
   /* public void fliegen(<T>) {
        // If-Else Unterscheidung pr�ft zugewiesenen Wert im jeweiligen Objekt mit dem Inhalt der Eigenschaft "fly"!
        if(this.fly == true) {
            System.out.println("Unser Vogel kann fliegen!");
        } else {
            System.out.println("Unser Vogel kann leider nicht fliegen!");
        }
    }*/
}

// Hier würde eine Änderung stehen oder auch nicht. 