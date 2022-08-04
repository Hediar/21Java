package ch09_03;

import java.awt.Color;
class Mini extends Car{
    Color color;
    public Mini(){
        this(Color.RED);
    }

    public Mini(Color c) {
        super("Mini");
        color = c;
        //more initialization
    }

    public Mini(int size) {
        super(size);
    }
}
