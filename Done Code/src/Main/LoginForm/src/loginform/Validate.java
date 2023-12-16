package loginform;

/**
 * The {@code Validate} class represents a validation result containing information about
 * the validation state, any associated error message, and the type of error.
 *
 * <p>The class includes methods to retrieve and modify the validation state, error message,
 * and error type.</p>
 *
 * <p>Usage example:</p>
 * <pre>
 *     // Creating a validation result with a successful state
 *     Validate validationResult = new Validate(true, null, null);
 *
 *     // Checking the validation state
 *     boolean isValid = validationResult.isState();
 *
 *     // Getting the error message (if any)
 *     String error = validationResult.getError();
 *
 *     // Getting the error type (if any)
 *     String errorType = validationResult.getErrorType();
 *
 *     // Modifying the validation state
 *     validationResult.setState(false);
 *
 *     // Setting an error message
 *     validationResult.setError("Validation failed due to...");
 *
 *     // Setting an error type
 *     validationResult.setErrorType("Type of Validation Error");
 * </pre>
 *
 * @author Khemu
 * @version 1.0
 * @since 2023-12-16
 */

public class Validate {

  private boolean state;
  private String error;
  private String errorType;

  public Validate(boolean state, String error, String errorType) {
    this.state = state;
    this.error = error;
    this.errorType = errorType;
  }

  public boolean isState() {
    return this.state;
  }

  public boolean getState() {
    return this.state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public String getError() {
    return this.error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getErrorType() {
    return this.errorType;
  }

  public void setRrrorType(String errorType) {
    this.errorType = errorType;
  }
}
