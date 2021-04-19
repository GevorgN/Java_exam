package main;

import plane.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();

        boolean commandIsActive = true;

        Scanner s = new Scanner(System.in);
        Plane plane1 = service.create();
        System.out.println("Next plane\n");
        Plane plane2 = service.create();
        System.out.println("Next plane\n");
        Plane plane3 = service.create();
        Plane[] planes = {plane1, plane2, plane3};

        while (commandIsActive) {

            System.out.println("Please enter command number");
            System.out.println("1. printCostAndTopSpeed");
            System.out.println("2. newerPlane");
            System.out.println("3. countryOfPlaneWithLessSeats");
            System.out.println("4. allNotMilitary");
            System.out.println("5. allMilitaryMoreThan100");
            System.out.println("6. minimalWeight");
            System.out.println("7. minimalCostOfMilitaryPlanes");
            System.out.println("8. orderByYear");
            System.out.println("9. exit\n");
            int command = s.nextInt();
            switch (command) {
                case 1:
                    service.printCostAndTopSpeed(plane1);
                    break;
                case 2:
                    service.newerPlane(plane1, plane2).printInfo();
                    break;
                case 3:
                    service.countryOfPlaneWithLessSeats(plane1, plane2, plane3);
                case 4:
                    service.allNotMilitary(planes);
                    break;
                case 5:
                    service.allMilitaryMoreThan100(planes);
                    break;
                case 6:
                    service.minimalWeight(planes).printInfo();

                    break;
                case 7:
                    service.minimalCostOfMilitaryPlanes(planes).printInfo();

                    break;
                case 8:
                    service.orderByYear(planes);
                    break;
                case 9:
                    commandIsActive = false;
                    System.out.println("The end!");
                    break;
                default:
                    System.out.println("Please enter correct number!");
            }
        }
    }
}
