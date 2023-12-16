package loginform;

import java.util.*;
import javax.swing.JOptionPane;

public class Utils {

  public static boolean displayError(Validate input) {
    boolean isInputsValid = true;

    if (input.getState())
      return isInputsValid;
    
    isInputsValid = false;
    JOptionPane.showMessageDialog(
      null,
      input.getError(),
      input.getErrorType(),
      JOptionPane.WARNING_MESSAGE
    );

    return isInputsValid;
  }

  public static boolean displayErrors(ArrayList<Validate> inputs) {
    boolean isInputsValid = true;

    for (Validate input : inputs) {
      boolean result = Utils.displayError(input);
      if (!result)
        isInputsValid = false;
    }

    return isInputsValid;
  }
}
