package com.tutorial.idea;

import java.util.Collection;
import java.util.function.Consumer;

// Show Intention Actions (ALT+Enter)
public class Bad {
    // tipo
    private Object unused = new Object();


    private void someMethod(Collection<String> collection) {
        if (collection.isEmpty()) {
            boolean res = collection.contains("ew");
            System.out.println(res);
        }


        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
