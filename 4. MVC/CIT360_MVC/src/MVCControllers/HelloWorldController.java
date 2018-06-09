package MVCControllers;

import MVCViews.*;
import MVCModels.*;

/**
 *
 * @author Paul Darr
 */
public class HelloWorldController {
    
    public void startApplication() {
        // View the application's GUI
        HelloWorldView view = new HelloWorldView();
        view.setVisible(true);
    }
    
    public String getMessage() {
        try {
            HelloWorldModel model = new HelloWorldModel();
            return model.getData();
        } catch (Exception er) {
            return "There was an error.";
        }
    }
    
    public boolean writeMessage(String message) {
        try {
            HelloWorldModel model = new HelloWorldModel();
            return model.writeData(message);
        } catch (Exception er) {
            return false;
        }
    }
}