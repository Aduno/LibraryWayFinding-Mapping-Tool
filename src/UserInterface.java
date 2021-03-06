import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame{

    private Logic mapLogic;
    private BoardUI boardInterface;
    private State state;
    SaveButton save;
    UserInterface(Logic logic) {
        this.mapLogic = logic;
        state = new State();
        boardInterface = new BoardUI(logic,state);
        save = new SaveButton(state.cubeMap, logic);

        this.setTitle("Mapping Tool");
        this.setLayout(new BorderLayout());
        this.setBounds(new Rectangle((int)(BoardUI.DIMENSIONS*1.1),(int)(BoardUI.DIMENSIONS*1.1)));
        this.add(boardInterface);
        this.add(save, BorderLayout.SOUTH);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public void updateFrame(){
        this.remove(boardInterface);
        boardInterface = new BoardUI(mapLogic,state);
        this.add(boardInterface);
        this.add(save, BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }
}
