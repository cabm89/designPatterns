package creational.factory.src.example2.after.implementations;

import creational.factory.src.example2.after.director.Converter;
import creational.factory.src.example2.before.Instance;

public class JSONConverter implements Converter {
    @Override
    public String serialize(Instance instance) {
        return "foo";
    }
}
