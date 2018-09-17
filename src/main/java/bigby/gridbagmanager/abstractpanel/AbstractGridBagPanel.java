package bigby.gridbagmanager.abstractpanel;

import bigby.gridbagmanager.GridBagManager;

import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 *
 * @author bigby
 */
public abstract class AbstractGridBagPanel extends JPanel {

    protected GridBagManager gbm;

    public AbstractGridBagPanel() {
        super();
        this.gbm = new GridBagManager();
        this.setGridBagManagerLayout();
    }

    public GridBagManager getGbm() {
        return gbm;
    }
    
    private void setGridBagManagerLayout()
    {
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

    /**
     *Adds component at desired (X,Y), leaving GridBagConstraints pointed at it.
     * 
     * @param comp component
     * @param x int
     * @param y int
     */
    public void addAtXY(Component comp, int x, int y) {
        gbm.setX(x);
        gbm.setY(y);
        this.add(comp, gbm.getGbc());
    }

    /**
     *Method jumps to desired (X,Y) coords, then returns
     * to previous location.
     * 
     * @param comp component
     * @param x int
     * @param y int
     */
    public void addJumpXY(Component comp, int x, int y) {
        int[] previousCoords = gbm.getXY();
        
        gbm.setX(x);
        gbm.setY(y);
        this.add(comp, gbm.getGbc());
        
        gbm.setXY(previousCoords[0], previousCoords[1]);
    }

    /**
     *Create panel with its components using GridBagManager.
     */
    public abstract void createPanel();
}
