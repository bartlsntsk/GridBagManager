# GridBagManager

Class developed to wrap GridBagLayout and GridBagConstraints. Reducing boilerplate code amount.

There are two abstract classes attached to GridBagManager, which is AbstractGridBagPanel and AbstractPanelManager, both utilizing GridBagManager and helping you in your journey with GridBagLayout.

GridBagManager class - 
Declares and initializes its own GridBagLayout and GridBagConstraints objects, which can be retrieved when needed. Provides many useful methods. You can modify them to suit your needs.

AbstractGridBagPanel extends JPanel class - 
Has its own GridBagManager object, which is then used in custom add methods. You don't have to use add(comp,gbc) anymore,
just take quickAdd to add component exactly where gbc is pointed at, addNextX to insert component in next X or addNextY to insert
component below. Contains abstract method createPanel() which has to be overridden.

AbstractPanelManager (T extends AbstractGridBagPanel) extends AbstractGridBagPanel class - 
Has List(T) of panels it will be managing. Creates grid for many panels of the same type. Has its own GridBagManager object (inheritance).
createPanel() iterates over list of panels and puts them in a grid. You can think of it as GridLayout, but you will have more
control of how panels are displayed.
