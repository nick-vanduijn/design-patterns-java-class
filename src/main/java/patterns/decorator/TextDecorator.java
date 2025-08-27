package patterns.decorator;

/**
 * Base Text Decorator class
 */
public abstract class TextDecorator implements TextComponent {

  protected TextComponent textComponent;

  public TextDecorator(TextComponent textComponent) {
    this.textComponent = textComponent;
  }

  @Override
  public String render() {
    return textComponent.render();
  }
}