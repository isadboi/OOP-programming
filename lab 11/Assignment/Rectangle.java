/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Ibrhaim
 */
public class Rectangle implements Shape {
private double height;
private double width;
public Rectangle(double height, double width) {
this.height = height;
this.width = width;
}
public void setHeight(double height) {
this.height = height;
}
public double getHeight() {
return height;
}
public void setWidth(double width) {
this.width = width;
}
public double getWidth() {
return width;
}
@Override
public double area() {
return height * width;
}
}
