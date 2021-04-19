package service;

import plane.Plane;

import java.util.Scanner;

public class PlaneService {
    public Plane create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter plane model");
        String model = s.next();
        System.out.println("Enter plane country");
        String country = s.next();
        System.out.println("Enter plane production year");
        int year = s.nextInt();
        System.out.println("Enter plane hours in air");
        double hours = s.nextDouble();
        System.out.println("Plane is Military y/n");
        boolean isMilitary = s.next().charAt(0) == 'y';
        System.out.println("Enter plane weight");
        double weight = s.nextDouble();
        System.out.println("Enter plane top speed");
        double topSpeed = s.nextDouble();
        System.out.println("Enter plane seats number");
        int seats = s.nextInt();
        System.out.println("Enter cost of the plane");
        double cost = s.nextDouble();

        Plane plane = new Plane(model, country);
        plane.setYear(year);
        plane.setHours(hours);
        plane.setMilitary(isMilitary);
        plane.setWeight(weight);
        plane.setTopSpeed(topSpeed);
        plane.setSeats(seats);
        plane.setCost(cost);
        return plane;
    }


    public void printCostAndTopSpeed(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println(plane.getTopSpeed());
            System.out.println(plane.getCost());
        } else {
            System.out.println(plane.getModel());
            System.out.println(plane.getCountry());
        }
    }


    public Plane newerPlane(Plane plane1, Plane plane2) {
        return plane1.getYear() >= plane2.getYear() ? plane1 : plane2;
    }


    public void countryOfPlaneWithLessSeats(Plane plane1, Plane plane2, Plane plane3) {
        Plane smallest = plane1.getSeats() <= plane2.getSeats() ? plane1 : plane2;
        if (smallest.getSeats() >= plane2.getSeats()) {
            smallest = plane3;
        }
        System.out.println(smallest.getCountry());
    }



    public void allNotMilitary(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary()) {
                planes[i].printInfo();
            }
        }
    }



    public void allMilitaryMoreThan100(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getHours() > 100) {
                planes[i].printInfo();
            }
        }
    }


    public Plane minimalWeight(Plane[] planes) {
        Plane minimal = planes[0];
        for (int i = 1; i < planes.length - 1; i++) {
            if (minimal.getWeight() >= planes[i].getWeight()) {
                minimal = planes[i];
            }
        }
        return minimal;

    }


    public Plane minimalCostOfMilitaryPlanes(Plane[] planes) {
        Plane mimimal = null;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                mimimal = planes[i];
                if (mimimal.getCost() >= planes[i].getCost()) {
                    mimimal = planes[i];
                }
            }
        }
        return mimimal;
    }


    public void orderByYear(Plane[] planes) {
        int count = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < planes.length - 1 - count; i++) {
                if (planes[i].getYear() > planes[i + 1].getYear()) {
                    Plane tmp = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = tmp;
                    flag = true;
                }
            }
            count++;
        }
        for (int i = 0; i < planes.length; i++) {
            planes[i].printInfo();
        }

    }

}
