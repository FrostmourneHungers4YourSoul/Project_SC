package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Egg6 {

    @Autowired
    private Needle7 needle7;

    @Override
    public String toString() {
        return ",\n в яйце иголка " + needle7.toString();
    }
}
