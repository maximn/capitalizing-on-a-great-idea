package com.tutorial.idea;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

// Show Intention Actions (ALT+Enter)
public class Bad {
    // Show descriptions of error at caret (CMD + F1)

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

        List<Integer> arr = Arrays.asList(1, 2, 3);

        boolean b = arr.stream().count() == 0;

        boolean present = arr.stream().filter(i -> i > 2).findFirst().isPresent();
    }
}