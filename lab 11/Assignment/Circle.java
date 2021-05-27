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
public class Circle implements Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
public void setRadius(double radius) {
this.radius = radius;
}
public double getRadius() {
return radius;
}
@Override
public double area() {
return Math.PI * radius * radius;
}
}
