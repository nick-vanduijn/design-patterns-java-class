package patterns.decorator;

/**
 * Concrete Component - Plain text implementation
 */
public class PlainText implements TextComponent {

  private String text;

  public PlainText(String text) {
    this.text = text;
  }

  @Override
  public String render() {
    return text;
  }
}