package com.jd.jr.dp.structural.composite;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-04-11
 * Time: 8:26 pm
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        char[] cs = new char[depth];
        for (int i = 0; i < depth; ++i) {
            cs[i] = '-';
        }
        System.out.println(new String(cs) + name);
    }
}
