/*
https://github.com/TheIronman2131/MandelBrot
@author CAL
Controls Guide: https://docs.google.com/document/d/14gXeKURXv3a98MSO68iBYQ-RCAnQLKWiwFYe826Vy_4/edit?usp=sharing
 */

import processing.core.PApplet;

public class MandelBrot extends PApplet {

    float x;
    float y;
    float speed = 5;
    double zoom = 1.05;
    double xCenter = -0.5;
    double yCenter = 0.0;
    

    public static void main(String[] args) {
        PApplet.main("MandelBrot");

    }

    public void settings() {
        size(800, 1000);
    }

    public void setup() {

        background(0);
        colorMode(HSB, 255);
        noLoop();

    }

    public void draw() {
        background(0);

        

        double xRangeInitial = 3.0;
        double xRange = xRangeInitial / zoom;
        double xMin = xCenter - xRange / 2;
        double xMax = xCenter + xRange / 2;
        double aspectRatio = 0.8;
        double yRange = xRange / aspectRatio;
        double yMin = yCenter - yRange / 2;
        double yMax = yCenter + yRange / 2;
        int maxLoops = 45;

        for (int graphX = 0; graphX < width; graphX++) {
            for (int graphY = 0; graphY < height; graphY++) {
                double x1 = map(graphX, 0, width, (float) xMin, (float) xMax);
                double y1 = map(graphY, 0, height, (float) yMin, (float) yMax);
                Complex C = new Complex(x1, y1);
                Complex Z = new Complex(0, 0);

                int loops = 0;
                while (Z.magnitudeSquared() <= 4 && loops < maxLoops) {
                    Z = Z.square().add(C);
                    loops++;
                }

                int pixelColor;

                //Color Points based on if they are outside the set or not
                double smoothLoops;
                if (loops < maxLoops) {
                    double logZn = Math.log(Z.magnitudeSquared()) / 2;
                    double nu = Math.log(logZn / Math.log(2)) / Math.log(2);
                    smoothLoops = loops + 1 - nu;
                } else {
                    smoothLoops = loops;
                }

                float hue;
                if (loops == maxLoops) {
                    hue = 0;
                } else {
                    hue = map((float) smoothLoops, 0, maxLoops, 0, 255);
                }

                if (loops == maxLoops) {
                    stroke(0, 0, 0);
                } else {
                    stroke(50, 37, 194);
                }

                if (loops == maxLoops) {
                    pixelColor = color(0, 0, 0);
                } else {
                    pixelColor = color(hue, 255, 255);
                }

                stroke(pixelColor);
                point(graphX, graphY);
            }

        }
        //Minimum Zoom
        if (zoom < 1.05) {
            zoom = 1.05;
            System.out.println("You have reached the maximum zoom out distance (1.05)");
        }
        //Max Zoom
        if (zoom > 80.05) {
            zoom = 80.05;
            System.out.println("You have reached the maximum zoom in distance (50.05)");
        }
        //Redraw if zoomed in far enough (x6)
        if(zoom > 6){
            maxLoops = 100;
            redraw();
        }
        //Redraw if zoomed in far enough (x8)
        if(zoom > 8){
            maxLoops = 150;
            redraw();
        }
        //Redraw if zoomed in far enough (x10)
        if(zoom > 10){
            maxLoops = 200;
            redraw();
        }
        //Redraw if zoomed in far enough (x15)
        if(zoom > 15){
            maxLoops = 250;
            redraw();
        }
        //Redraw if zoomed in far enough (x20)
        if(zoom > 20){
            maxLoops = 300;
            redraw();
            
        }
        //Redraw if zoomed in far enough ()
        if(zoom > 25){
            maxLoops = 350;
            redraw();
        }
        //Redraw if zoomed in far enough (x10)
         if (zoom > 25) {
                maxLoops = 400;
                redraw();
            }
         //Redraw if zoomed in far enough (x10)
            if (zoom > 30) {
                maxLoops = 450;
                redraw();
            }
            //Redraw if zoomed in far enough (x35)
            if (zoom > 35) {
                maxLoops = 500;
                redraw();
            }
            //Redraw if zoomed in far enough (x40)
            if (zoom > 40) {
                maxLoops = 600;
                redraw();
            }
             //Redraw if zoomed in far enough (x45)
            if (zoom > 45) {
                maxLoops = 650;
                redraw();
            }
             //Redraw if zoomed in far enough (x50)
            if (zoom > 50) {
                maxLoops = 700;
                redraw();
            }
            //Redraw if zoomed in far enough (x55)
            if (zoom > 55) {
                maxLoops = 750;
                redraw();
            }
            //Redraw if zoomed in far enough (x60)
            if (zoom > 60) {
                maxLoops = 800;
                redraw();
            }
            //Redraw if zoomed in far enough (x65)
            if (zoom > 65) {
                maxLoops = 850;
                redraw();
            }
        
        

    }

   
    public void keyPressed() {
        //Zoom Out
        if (key == 'q' || key == 'Q') {
            zoom -= 0.02;
            System.out.println("Current Zoom is: " + zoom);
            redraw();
        }
        //Zoom In
        if (key == 'e' || key == 'E') {
            zoom *= 1.2;
            System.out.println("Current Zoom is: " + zoom);
            redraw();
        }
        //Pan Up
        if (key == 'w' || key == 'W') {
            yCenter -= 0.02;
            System.out.println("The new Y Coordinate is: " + yCenter);
            redraw();
        }
        //Pan Down
        if (key == 's' || key == 'S') {
            yCenter += 0.02;
            System.out.println("The new Y Coordinate is: " + yCenter);
            redraw();
        }
        //Pan left
        if (key == 'a' || key == 'A') {
            xCenter -= 0.02;
            System.out.println("The new X Coordinate is: " + xCenter);
            redraw();
        }
        //Pan Right
        if (key == 'd' || key == 'D') {
            xCenter += 0.02;
            System.out.println("The new X Coordinate is: " + xCenter);
            redraw();
        }
        //Home all (Zoom & Center Mandelbrot Set)
        if (key == ';') {
            
            System.out.println("\nThe new X Coordinate is: " + xCenter);
            System.out.println("The new Y Coordinate is: " + yCenter);
            System.out.println("The Zoom has been reset to (" + zoom + ")");
            System.out.println("The MandelBrot Set has been Homed to (" + xCenter + ", " + yCenter + ")");
            
            xCenter = -0.5;
            yCenter = 0.0;
            zoom = 1.05;
            redraw();
        }
        //Force Quit
        if (key == ESC) {
        exit();
    }

    }
}

class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex square() {
        return this.multiply(this);
    }

    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public double magnitudeSquared() {
        return this.real * this.real + this.imaginary * this.imaginary;
    }
}
