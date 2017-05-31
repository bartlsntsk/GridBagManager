package gridbagmanager.abstractpanel;

import gridbagmanager.GridBagManager;
import java.awt.Component;
import javax.swing.JPanel;

/**
 * 
 *
 * @author bartlsntsk
 */
public abstract class AbstractGridBagPanel extends JPanel {

    public GridBagManager gbm;

    public AbstractGridBagPanel() {
        super();
        gbm = new GridBagManager();
        this.setLayout(gbm.getGridBagLayout());
    }

    public void quickAdd(Component comp) {
        this.add(comp, gbm.getGbc());
    }

    public void addNextX(Component comp) {
        gbm.increaseX();
        this.add(comp, gbm.getGbc());
    }

    public void addNextY(Component comp) {
        gbm.increaseY();
        this.add(comp, gbm.getGbc());
    }

    public void addNextXY(Component comp) {
        gbm.increaseX();
        gbm.increaseY();
        this.add(comp, gbm.getGbc());
    }

    public abstract void createPanel();
}
