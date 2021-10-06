public class State {
    protected Cube[] cubeMap;
    State(){
        cubeMap = new Cube[BoardUI.RESOLUTION*BoardUI.RESOLUTION];
        for(int i=0;i<BoardUI.RESOLUTION;i++){
            for(int x=0;x<BoardUI.RESOLUTION;x++){
                cubeMap[x+(i*BoardUI.RESOLUTION)] = new Cube();
            }
        }
    }
}
