/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.cal.classeshomework;

import java.util.Scanner;

/**
 *
 * @author cal
 */
public class ClassesHomework {

    public static class Car {

        String color;
        String model;
        int seats;
        int year;

        public Car(String color, String model, int seats, int year) {
            this.color = color;
            this.model = model;
            this.seats = seats;
            this.year = year;
        }

        @Override
        public String toString() {
            return "This car is a " + year + " " + model + " with a " + color + " exterior and seating for " + seats + ".";
        }

        public static class CarInventory {

            Car car1 = new Car("Red", "Ford Mustang", 4, 2024);
            Car car2 = new Car("Blue", "Ford Mustang Mach-E", 4, 2024);
            Car car3 = new Car("Black", "Ford Maverick", 4, 2024);
            Car car4 = new Car("White", "Ford Ranger", 4, 2024);
            Car car5 = new Car("Silver", "Ford F-150", 4, 2024);
            Car car6 = new Car("Gray", "Ford F-150 Lightning", 4, 2024);
            Car car7 = new Car("Blue", "Ford Super Duty", 4, 2024);
            Car car8 = new Car("Gray", "Ford Expedition MAX", 8, 2024);
            Car car9 = new Car("White", "Ford Explorer", 7, 2024);
            Car car10 = new Car("Silver", "Ford Expedition", 7, 2024); 
            Car car11 = new Car("Red", "Ford Mustang GT Convertible", 2, 2022);
            Car car12 = new Car("Red", "Ford Escape", 5, 2024);
            Car car13 = new Car("Blue", "Ford Edge", 5, 2024);
            Car car14 = new Car("Black", "Ford Bronco", 5, 2024);
            Car car15 = new Car("Black", "Ford Model T", 2, 1927);

            boolean car1InStock = true;
            boolean car2InStock = true;
            boolean car3InStock = true;
            boolean car4InStock = false;
            boolean car5InStock = false;
            boolean car6InStock = true;
            boolean car7InStock = true;
            boolean car8InStock = true;
            boolean car9InStock = true;
            boolean car10InStock = true;
            boolean car11InStock = false;
            boolean car12InStock = true;
            boolean car13InStock = false;
            boolean car14InStock = false;
            boolean car15InStock = true;
            
            public void filterCars(String color, int year, int seats) {
                System.out.println("Cars matching criteria:");
                boolean carFound = false;

                if (car1InStock && (color.isEmpty() || car1.color.equalsIgnoreCase(color)) && (year == 0 || car1.year == year) && (seats == 0 || car1.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }

                if (car2InStock && (color.isEmpty() || car2.color.equalsIgnoreCase(color)) && (year == 0 || car2.year == year) && (seats == 0 || car2.seats == seats)) {
                    System.out.println(car2);
                    carFound = true;
                }

                if (car3InStock && (color.isEmpty() || car3.color.equalsIgnoreCase(color)) && (year == 0 || car3.year == year) && (seats == 0 || car3.seats == seats)) {
                    System.out.println(car3);
                    carFound = true;
                }
                
                if (car4InStock && (color.isEmpty() || car4.color.equalsIgnoreCase(color)) && (year == 0 || car4.year == year) && (seats == 0 || car4.seats == seats)) {
                    System.out.println(car4);
                    carFound = true;
                }
                
                if (car5InStock && (color.isEmpty() || car5.color.equalsIgnoreCase(color)) && (year == 0 || car5.year == year) && (seats == 0 || car5.seats == seats)) {
                    System.out.println(car5);
                    carFound = true;
                }
                
                if (car6InStock && (color.isEmpty() || car6.color.equalsIgnoreCase(color)) && (year == 0 || car6.year == year) && (seats == 0 || car6.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                if (car7InStock && (color.isEmpty() || car7.color.equalsIgnoreCase(color)) && (year == 0 || car7.year == year) && (seats == 0 || car7.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                 if (car8InStock && (color.isEmpty() || car8.color.equalsIgnoreCase(color)) && (year == 0 || car8.year == year) && (seats == 0 || car8.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                if (car9InStock && (color.isEmpty() || car9.color.equalsIgnoreCase(color)) && (year == 0 || car9.year == year) && (seats == 0 || car9.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                if (car10InStock && (color.isEmpty() || car10.color.equalsIgnoreCase(color)) && (year == 0 || car10.year == year) && (seats == 0 || car10.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                if (car11InStock && (color.isEmpty() || car11.color.equalsIgnoreCase(color)) && (year == 0 || car11.year == year) && (seats == 0 || car11.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                if (car12InStock && (color.isEmpty() || car12.color.equalsIgnoreCase(color)) && (year == 0 || car12.year == year) && (seats == 0 || car12.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                if (car13InStock && (color.isEmpty() || car13.color.equalsIgnoreCase(color)) && (year == 0 || car13.year == year) && (seats == 0 || car13.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                if (car14InStock && (color.isEmpty() || car14.color.equalsIgnoreCase(color)) && (year == 0 || car14.year == year) && (seats == 0 || car14.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                if (car15InStock && (color.isEmpty() || car15.color.equalsIgnoreCase(color)) && (year == 0 || car15.year == year) && (seats == 0 || car15.seats == seats)) {
                    System.out.println(car1);
                    carFound = true;
                }
                

                if (!carFound) {
                    System.out.println("No cars match the specified criteria.");
                }
            }
        }

       
    }
     public static void main(String[] args) {
            Car.CarInventory inventory = new Car.CarInventory();
            Scanner johnTheScannerXIII = new Scanner(System.in);

            System.out.print("Enter color to filter by (or press Enter to skip): ");
            String color = johnTheScannerXIII.nextLine().trim();

            System.out.print("Enter year to filter by (or 0 to skip): ");
            int year = johnTheScannerXIII.nextInt();

            System.out.print("Enter number of seats to filter by (or 0 to skip): ");
            int seats = johnTheScannerXIII.nextInt();

            inventory.filterCars(color, year, seats);

            johnTheScannerXIII.close();
        }
}
