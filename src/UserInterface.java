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
        this.setBounds(new Rectangle(820,800));
        this.add(boardInterface,BorderLayout.NORTH);
        this.add(save);
        this.setResizable(true);
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
