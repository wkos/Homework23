public class Table {
    String shape;
    String material;
    int numberOfLegs;
    int tableFor;

    Table(){}
    Table(String shape, String material, int legs, int people){
        this.shape = shape;
        this.material = material;
        numberOfLegs = legs;
        tableFor = people;
    }
}
