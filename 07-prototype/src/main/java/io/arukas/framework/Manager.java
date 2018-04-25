package io.arukas.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Product> showcase = new HashMap<String, Product>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product product = showcase.get(protoName);
        if(product == null){
            throw new RuntimeException("unsupported");
        }
        return product.createClone();
    }

}
