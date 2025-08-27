package patterns.decorator;

/**
 * Concrete Decorator - Underlines text
 */
public class UnderlineTextDecorator extends TextDecorator {

  public UnderlineTextDecorator(TextComponent textComponent) {
    super(textComponent);
  }

  @Override
  public String render() {
    return "<u>" + textComponent.render() + "</u>";
  }
}