import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class EventDemo extends JFrame {
private JTextField eventTextField;

public EventDemo() {
    setTitle("Event Demo");
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    JLabel label = new JLabel("Events Triggered");
    add(label);

    eventTextField = new JTextField(30);
    eventTextField.setEditable(false);
    add(eventTextField);

    // ActionEvent
    JButton actionButton = new JButton("Action Event");
    actionButton.addActionListener(e -> displayEvent("ActionEvent triggered"));
    add(actionButton);

    // MouseEvent
    JButton mouseButton = new JButton("Mouse Event");
    mouseButton.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            displayEvent("MouseEnteredEvent triggered");
        }

        public void mouseExited(MouseEvent e) {
            displayEvent("MouseExitedEvent triggered");
        }

        public void mouseClicked(MouseEvent e) {
            displayEvent("MouseClickedEvent triggered");
        }
    });
    add(mouseButton);

    // KeyEvent
    JTextField keyField = new JTextField("Key Event", 10);
    keyField.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
            displayEvent("KeyEvent triggered");
        }
    });
    add(keyField);

    // ComponentEvent
    JLabel componentLabel = new JLabel("Component Event");
    componentLabel.addComponentListener(new ComponentAdapter() {
        public void componentShown(ComponentEvent e) {
            displayEvent("ComponentEvent shown triggered");
        }

        public void componentHidden(ComponentEvent e) {
            displayEvent("ComponentEvent hidden triggered");
        }

        public void componentResized(ComponentEvent e) {
            displayEvent("ComponentEvent resized triggered");
        }

        public void componentMoved(ComponentEvent e) {
            displayEvent("ComponentEvent moved triggered");
        }
    });
    add(componentLabel);

    // WindowEvent
    addWindowListener(new WindowAdapter() {
        public void windowOpened(WindowEvent e) {
            displayEvent("WindowOpenedEvent triggered");
        }

        public void windowClosing(WindowEvent e) {
            displayEvent("WindowClosingEvent triggered");
        }

        public void windowClosed(WindowEvent e) {
            displayEvent("WindowClosedEvent triggered");
        }

        public void windowIconified(WindowEvent e) {
            displayEvent("WindowIconifiedEvent triggered");
        }

        public void windowDeiconified(WindowEvent e) {
            displayEvent("WindowDeiconifiedEvent triggered");
        }

        public void windowActivated(WindowEvent e) {
            displayEvent("WindowActivatedEvent triggered");
        }

        public void windowDeactivated(WindowEvent e) {
            displayEvent("WindowDeactivatedEvent triggered");
        }
    });
}

private void displayEvent(String eventDescription) {
    eventTextField.setText(eventDescription);
}

public static void main(String[] args) {
    EventDemo frame = new EventDemo();
    frame.setVisible(true);
}
}