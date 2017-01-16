import composite.item.ParentItem;
import composite.item.sub.SubItemOne;
import composite.item.sub.SubItemTwo;

/**
 * Class containing the main method.
 */
public class MainClass {

    /**
     * Main method.
     *
     * @param args String arguments.
     */
    public static void main(String[] args) {
        // Iterate the Composite items.
        processCompositeItems();
    }

    /**
     * Processing the Parent item and its Sub items.
     */
    private static void processCompositeItems() {
        // The Skywalker family tree.
        ParentItem parentItem = new ParentItem("Anakin Skywalker"); // Darth Vader.

        SubItemOne subItemOne = new SubItemOne("Luke Skywalker");
        SubItemTwo subItemTwo = new SubItemTwo("Leia Skywalker");

        parentItem.addSubItem(subItemOne);
        parentItem.addSubItem(subItemTwo);
        // Printing the whole family ( :) ).
        parentItem.print();

        System.out.println("\nBut Liea is dead in real life (as of 12/Jan/2017). So, killing Liea here too.");
        System.out.println("Hence...\n");
        // Killing Liea.
        parentItem.removeSubItem(subItemTwo);
        // Printing the family without Liea ( :'( ).
        parentItem.print();
    }
}
