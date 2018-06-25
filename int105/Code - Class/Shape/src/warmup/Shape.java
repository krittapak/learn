/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

/**
 *
 * @author INT105
 */
public abstract class Shape {
    protected int shapeId;

    public Shape() {
    }

    public Shape(int shapeId) {
        this.shapeId = shapeId;
    }

    @Override
    public String toString() {
        return "Shape{" + "shapeId=" + shapeId + '}';
    }

    public abstract double findArea();
    public abstract double findCircumference();
}
