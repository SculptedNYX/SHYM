import java.util.Scanner;

public class Menu {
    Scanner s = new Scanner(System.in);

    void starterFunction() {
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
        System.out.println("                                           all rights reservedÂ©");

        // main loop
        mainLoop :while (true){
            System.out.println("0: Exit Game");
            System.out.println("1: Setup mission");
            int mainChoice = s.nextInt();
            switch (mainChoice){
                case(0):
                    break mainLoop;
                case(1):
                    dataLoop: while(true){
                        System.out.println("1: import pilot data");
                        System.out.println("2: import worker data");
                        System.out.println("3: import passenger data");
                        System.out.println("0: back");
                        int dataFillChoice = s.nextInt();
                        switch (dataFillChoice){
                            case(0):
                                break dataLoop;
                            case(1):
                                System.out.println("import pilot name:");
                                s.nextLine();
                                String pilotName = s.nextLine();
                                System.out.println("import pilot age (by numbers):");
                                int pilotAge = s.nextInt();
                                System.out.println("import pilot weight (by numbers):");
                                double pilotWeight = s.nextDouble();
                                System.out.println("import pilot experience (text)");
                                s.nextLine();
                                String pilotExp = s.nextLine();
                                System.out.println("import pilot flight score (numbers)");
                                int pilotScore = s.nextInt();
                                Pilot p = new Pilot(pilotName, pilotAge,pilotWeight,pilotExp,pilotScore);
                                ship.setPilot(p);
                                break;
                            case(2):
                                System.out.println("import worker name:");
                                s.nextLine();
                                String WorkerName = s.nextLine();
                                System.out.println("import worker age (by numbers):");
                                int workerAge = s.nextInt();
                                System.out.println("import worker weight (by numbers):");
                                double workerWeight = s.nextDouble();
                                Worker W = new Worker(WorkerName, workerAge,workerWeight);
                                break;
                            case(3):
                                System.out.println("import number of passengers");
                                int passengersNumber = s.nextInt();
                                Ship.setPeopleCount(Ship.getPeopleCount()+passengersNumber);
                                break;
                            default:
                                System.out.println("make sure that you have chosen 0 or 1");
                        }
                    }
                    break;
                default:
                    System.out.println("make sure that you have chosen 0 or 1");
            }
        }

        // (main game loop) movement loop
        try {
            system.movementLoop(ship, moon);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
