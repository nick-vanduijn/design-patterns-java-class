package patterns.decorator;

/**
 * Concrete Decorator - Makes text italic
 */
public class ItalicTextDecorator extends TextDecorator {

  public ItalicTextDecorator(TextComponent textComponent) {
    super(textComponent);
  }

  @Override
  public String render() {
    return "<i>" + textComponent.render() + "</i>";
  }
}