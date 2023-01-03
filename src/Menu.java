import java.util.Scanner;

public class Menu {
    Scanner s = new Scanner(System.in);

    int starterFunction() {
        ShipSystem system = new ShipSystem();
        Planet moon = new Planet();
        moon.setDistance(10);
        Ship ship = new Ship();
        ship.setNoBodyParts(2);
        ship.setItem("mask");
        ship.setOxygenCapacity(20);

        // intro screen
        System.out.println("**************************  CREATORS  **************************");
        System.out.println("Yehya Al-Ashmawy / Mohamed Aymn / Hamza Mohamed / Sahdi Mostafa");
        System.out.println("***************************************************************");
        System.out.println("                                           all rights reserved©");


        // -------------- initial data values
        // pilot
        String pilotName = "";
        int pilotAge = 0;
        double pilotWeight = 0;
        String pilotExp = "";
        int pilotScore = 0;
        // worker
        String WorkerName = "";
        int workerAge = 0;
        double workerWeight = 0;
        // passengers number
        int passengersNumber = 0;


        // main loop
        while (true){
            System.out.println("0: Exit Game");
            System.out.println("1: Setup mission");
            int mainChoice = s.nextInt();
            switch (mainChoice){
                case(0):
                    return 0;
                case(1):
                    dataLoop: while(true){
                        // options
                        System.out.println("1: import pilot data [data: " + "Name/ " + pilotName + " Age/ " + pilotAge + " Weight/ " + pilotWeight + " Experience/ " + pilotExp + " Score/ " + pilotScore + " ]");
                        System.out.println("2: import worker data [data: " + "Name/ " + workerAge + " Age/ " + workerAge + " weight/ " + workerWeight + " ]");
                        System.out.println("3: import passenger data [data: " + "Number/ " + passengersNumber + " ]");
                        System.out.println("0: back");
                        int dataFillChoice = s.nextInt();
                        switch (dataFillChoice){
                            case(0):
                                break dataLoop;
                            case(1):
                                System.out.print("import pilot name: ");
                                s.nextLine();
                                while(true){
                                    pilotName = s.nextLine();
                                    if (pilotName != "" ) break;
                                    System.out.print("      enter a valid input: ");
                                }
                                //
                                System.out.print("import pilot age (by numbers):");
                                while(true){
                                    pilotAge = s.nextInt();
                                    if (pilotAge != 0 ) break;
                                    System.out.print("      enter a valid input: ");
                                }
                                //
                                System.out.print("import pilot weight (by numbers): ");
                                pilotWeight = s.nextDouble();
                                //
                                System.out.print("import pilot experience (text) ");
                                s.nextLine();
                                while(true){
                                    pilotExp = s.nextLine();
                                    if (pilotExp != "0" ) break;
                                    System.out.print("      enter a valid input: ");
                                }
                                //
                                System.out.print("import pilot flight score (numbers) ");
                                while(true){
                                    pilotScore = s.nextInt();
                                    if (pilotScore != 0 ) break;
                                    System.out.print("      enter a valid input: ");
                                }
                                Pilot p = new Pilot(pilotName, pilotAge,pilotWeight,pilotExp,pilotScore);
                                ship.setPilot(p);
                                break;
                            case(2):
                                System.out.println("import worker name:");
                                s.nextLine();
                                while(true){
                                    WorkerName = s.nextLine();
                                    if (WorkerName != "" ) break;
                                    System.out.print("      enter a valid input: ");
                                }
                                System.out.println("import worker age (by numbers):");
                                while(true){
                                    workerAge = s.nextInt();
                                    if (workerAge != 0 ) break;
                                    System.out.print("      enter a valid input: ");
                                }

                                System.out.println("import worker weight (by numbers):");
                                while(true){
                                    workerWeight = s.nextDouble();
                                    if (workerWeight != 0 ) break;
                                    System.out.print("      enter a valid input: ");
                                }
                                Worker W = new Worker(WorkerName, workerAge,workerWeight);
                                break;
                            case(3):
                                System.out.println("import number of passengers");
                                while(true){
                                    passengersNumber = s.nextInt();
                                    if (passengersNumber != 0 ) break;
                                    System.out.print("      enter a valid input: ");
                                }
                                ship.setPeopleCount(ship.getPeopleCount()+passengersNumber);
                                break;
                            default:
                                System.out.println("make sure that you have chosen 0 or 1");
                        }
                    }
                    break;

                default:
                    System.out.println("make sure that you have chosen 0 or 1");
            }

            // (main game loop) movement loop
            try {
                system.movementLoop(ship, moon);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    int controllers() {
//        first switch pilot or worker
//        worker functions (repear fuel, repear ox)
//        pilot functions (releaseBodyPart)



        System.out.print("1: repear fuel");
//        switch()
        double pilotWeight = s.nextDouble();
        return 0;
    }

}
