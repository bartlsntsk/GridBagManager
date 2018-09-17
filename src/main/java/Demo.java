import demopanels.DemoPanel;
import demopanels.DemoButtonPanel;
import demopanels.DemoPanelManager;
import bigby.gridbagmanager.GridBagManager;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author bigby
 */
public final class Demo extends JFrame {

    private GridBagManager gbm;

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        demo.setSize(1024, 768);
        demo.setExtendedState(JFrame.MAXIMIZED_BOTH);
        SwingUtilities.invokeLater(() -> {
            demo.setVisible(true);
        });
    }

    public Demo() {
        super();
        this.initMainGridBag();
        this.createGUI();
    }

    public void createGUI() {
        DemoPanelManager demoPanelManager = new DemoPanelManager(); //creating DemoPanelManager

        for (int i = 0; i < 32; i++) //injecting DemoPanels into DemoPanelManager
        {
            demoPanelManager.addPanel(new DemoPanel());

            demoPanelManager.getPanel(i).setBackground(new Color(255 - i * 5, 255 - i * 7, 255 - i * 7));//setting background
        }

        demoPanelManager.createPanel(); //initializing panel using injected DemoPanels

        JScrollPane demoManagerScrollPane = new JScrollPane(demoPanelManager);//if elements need more vertical space
        demoManagerScrollPane.setBorder(BorderFactory.createEmptyBorder());//nice touch

        gbm.setInsets(10, 0, 0, 10);
        gbm.setWeights(0, 1);

        this.add(new DemoButtonPanel(), gbm.getGbc()); //traditional add method using GridBagLayout

        gbm.increaseX();
        gbm.setWeights(1, 1);
        this.add(demoManagerScrollPane, gbm.getGbc());
    }

    public void initMainGridBag() {
        gbm = new GridBagManager();
        this.setLayout(gbm.getGridBagLayout());
    }
}
