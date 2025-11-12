package tp04.exo2;

/**
 * Un nœud texte dans un document XML.
 * 
 * 
 */
public class TextNode extends Node {
   private String text;

   public TextNode(String text) {
      this.text = text;
   }

   public String getText() {
       return text;
   }

   public void setText(String text) {
       this.text = text;
   }

   @Override
   public String textContent() {
      return text;
   }

   @Override
   public String toXML() {
	   return XMLHelper.protectText(text);
   }
   
   
}
