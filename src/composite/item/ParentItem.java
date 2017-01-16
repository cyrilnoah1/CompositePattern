package composite.item;

import composite.CompositeClass;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Parent item that contains all the sub items.
 */
public class ParentItem extends CompositeClass {
    private ArrayList<CompositeClass> subItems = new ArrayList<>();
    private String parentName;

    /**
     * Constructor for the Parent item.
     *
     * @param parentName Parent Item's name.
     */
    public ParentItem(String parentName) {
        this.parentName = parentName;
    }

    /**
     * To add Sub item to the Parent item.
     *
     * @param subItem Sub item for the Parent item.
     */
    public void addSubItem(CompositeClass subItem) {
        subItems.add(subItem);
    }

    /**
     * To remove Sub item from the Parent item.
     *
     * @param subItem Sub item under the parent item.
     */
    public void removeSubItem(CompositeClass subItem) {
        subItems.remove(subItem);
    }

    @Override
    public String getCompositeName() {
        return parentName;
    }

    @Override
    public void print() {
        System.out.println("Parent Item: " + getCompositeName());

        // Using an iterator, we're printing the names of the sub-items.
        Iterator<CompositeClass> iterator = subItems.iterator();
        //noinspection WhileLoopReplaceableByForEach
        while (iterator.hasNext()) {
            CompositeClass sub = iterator.next();
            sub.print();
        }
    }


}
