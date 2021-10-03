package MapUtil;

import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame{

    private Logic mapLogic;
    private BoardUI boardInterface;
    private State state;
    UserInterface(Logic logic) {
        this.mapLogic = logic;
        state = new State();
        boardInterface = new BoardUI(logic,state);


        this.setTitle("Mapping Tool");
        this.setBounds(new Rectangle(1020,1020));
        this.add(boardInterface);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public void updateFrame(){
        this.remove(boardInterface);
        boardInterface = new BoardUI(mapLogic,state);
        this.add(boardInterface);
        this.revalidate();
        this.repaint();
    }
}
