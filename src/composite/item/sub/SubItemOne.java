package composite.item.sub;

import composite.CompositeClass;

/**
 * Sub item for the Parent item.
 */
public class SubItemOne extends CompositeClass {
    private String subName;

    public SubItemOne(String subName) {
        this.subName = subName;
    }

    @Override
    public String getCompositeName() {
        return subName;
    }

    @Override
    public void print() {
        System.out.println("Sub Item: " + getCompositeName());
    }
}
