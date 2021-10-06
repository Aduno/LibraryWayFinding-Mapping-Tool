package MapClasses;

public class Map {
    class Point {
        public int[] coord;
        public boolean isObs;
        Point(int[] coord, boolean isObs){
            this.coord = coord;
            this.isObs = isObs;
        }
    }

    Point[][] map;
    int size;

    Map(int size){
        map = new Point[size][size];
    }

    public static void main(String[] args){


    }
}
