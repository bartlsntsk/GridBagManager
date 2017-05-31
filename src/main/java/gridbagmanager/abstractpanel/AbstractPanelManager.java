package gridbagmanager.abstractpanel;

import gridbagmanager.abstractpanel.AbstractGridBagPanel;
import java.util.ArrayList;
import java.util.List;

/**
 *Panel managing many panels of type T, which must extend AbstractGridBagPanel.
 * Basically it's creating a grid for panels of type T.
 * 
 * @author bartlsntsk
 * @param <T>
 */
public abstract class AbstractPanelManager<T extends AbstractGridBagPanel> extends AbstractGridBagPanel {

    protected List<T> panels;

    public AbstractPanelManager() {
        super();
        panels = new ArrayList<>();
    }

    /**
     *
     * @param dataPanel
     */
    public void addPanel(T dataPanel) {
        panels.add(dataPanel);
    }

    public List<T> getPanels() {
        return panels;
    }
    
    public T getPanel(int index)
    {
        return panels.get(index);
    }
    
    
}
