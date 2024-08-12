class Shape {
    int getCorner(){
        return 0;
    }
}

class Reactangle extends Shape {

    int getCorner(){

        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
}
