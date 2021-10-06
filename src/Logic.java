import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logic implements ActionListener {
    private UserInterface userInterface;
    Logic(){
        userInterface = new UserInterface(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Cube cube;
        //Checks if the event was from the grid map click

        if(e.getSource().getClass()==Cube.class){
            cube = (Cube) e.getSource();
            //Toggles on or off of being a object
            cube.setObj(!cube.isObj);
        }

        userInterface.updateFrame();
    }
}
