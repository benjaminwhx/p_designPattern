package com.jd.jr.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-04-11
 * Time: 8:29 pm
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        char[] cs = new char[depth];
        for (int i = 0; i < depth; ++i) {
            cs[i] = '-';
        }
        System.out.println(new String(cs) + name);
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
