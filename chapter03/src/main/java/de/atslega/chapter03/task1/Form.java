package de.atslega.chapter03.task1;

import java.awt.*;

public abstract class Form{
    protected int x;
    protected int y;

    protected Form(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Graphics2D draw(Graphics g) {
        return (Graphics2D) g;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
