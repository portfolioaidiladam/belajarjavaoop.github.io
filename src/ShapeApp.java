public class ShapeApp {
    public static void main(String[] args) {


        var shape = new Shape();
        System.out.println(shape.getCorner());

        var ratangle =new Reactangle();
        System.out.println(ratangle.getCorner());
        System.out.println(ratangle.getParentCorner());
    }
}
