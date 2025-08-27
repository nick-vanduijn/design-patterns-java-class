package patterns.decorator;

/**
 * Concrete Decorator - Makes text bold
 */
public class BoldTextDecorator extends TextDecorator {

  public BoldTextDecorator(TextComponent textComponent) {
    super(textComponent);
  }

  @Override
  public String render() {
    return "<b>" + textComponent.render() + "</b>";
  }
}