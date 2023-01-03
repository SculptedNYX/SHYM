import java.util.Scanner;

public class Menu {
    Scanner s = new Scanner(System.in);

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
    // planet
    String planet;

    // ship
    int oxygen;
    int fuel;
    String item;
    int bodyPartsNumber;
    String industryDate;
    String shipType;
    Pilot p = new Pilot(pilotName, pilotAge,pilotWeight,pilotExp,pilotScore);
    Worker w = new Worker(WorkerName, workerAge,workerWeight);
//    ship s = new Ship()

    int starterFunction() {
        ShipSystem system = new ShipSystem();
        Planet Mercury = new Planet(30, 50, 30, 5,"heat shield","MERCURY");
        Planet Venus = new Planet(15, 45, 20, 5,"robot","VENUS");
        Planet Mars = new Planet(10, 35, 20, 4,"oxygenator","MARS");
        Planet Jupiter = new Planet(40, 55, 50, 4,"gas mask","JUPITER");
        Planet Saturn = new Planet(50, 65, 50, 3,"light prism","SATURN");
        Planet Uranus = new Planet(60, 75, 65, 3,"sampler","URANUS");
        Planet Neptune = new Planet(70, 90, 70, 3,"cultivator","NEPTUNE");
        Ship ship = new Ship();
        ship.setNoBodyParts(2);
        ship.setItem("oxygenator");
        ship.setOxygenCapacity(20);
        ship.setFuelCapacity(20);
        ship.setFuelRate(1);

        // intro screen
        System.out.println("**************************  CREATORS  **************************");
        System.out.println("Yehya Al-Ashmawy / Mohamed Aymn / Hamza Mohamed / Shadi Mostafa");
        System.out.println("***************************************************************");
        System.out.println("                                           all rights reserved©");


        while (true){
            System.out.println("0: Exit Game");
            System.out.println("1: Setup mission");
            int mainChoice = s.nextInt();
            switch (mainChoice){
                case(0):
                    return(0);
                case(1):
                    System.out.println("people, destination and ship data are required !!!");
                    System.out.println("1: people data");
                    System.out.println("2: destination data");
                    System.out.println("3: ship data");
                    System.out.println("0: back");
                    int dataChoice = s.nextInt();
                    switch (dataChoice){
                        case(1):
                            innerLoop:while(true){
                                // options
                                System.out.println("1: import pilot data [data: " + "Name/ " + pilotName + ", Age/ " + pilotAge + ", Weight/ " + pilotWeight + ", Experience/ " + pilotExp + ", Score/ " + pilotScore + "]");
                                System.out.println("2: import worker data [data: " + "Name/ " + workerAge + ", Age/ " + workerAge + ", weight/ " + workerWeight + "]");
                                System.out.println("3: import passenger data [data: " + "Number/ " + passengersNumber + "]");
                                System.out.println("0: back");
                                int dataFillChoice = s.nextInt();
                                switch (dataFillChoice){
                                    case(0):
                                        break innerLoop;
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
                                        ship.setPilot(p);
                                        break;
                                    case(2):
                                        System.out.print("import worker name:");
                                        s.nextLine();
                                        while(true){
                                            WorkerName = s.nextLine();
                                            if (WorkerName != "" ) break;
                                            System.out.print("      enter a valid input: ");
                                        }
                                        System.out.print("import worker age (by numbers):");
                                        while(true){
                                            workerAge = s.nextInt();
                                            if (workerAge != 0 ) break;
                                            System.out.print("      enter a valid input: ");
                                        }

                                        System.out.print("import worker weight (by numbers):");
                                        while(true){
                                            workerWeight = s.nextDouble();
                                            if (workerWeight != 0 ) break;
                                            System.out.print("      enter a valid input: ");
                                        }
                                        break;
                                    case(3):
                                        System.out.print("import number of passengers");
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
                                break;
                            }
//                        destination data
                        case(2):
                            planetLoop:while (true){
                                System.out.println("choose your destination");
                                System.out.println("1: Mars");
                                System.out.println("2: Jupiter");
                                System.out.println("3: Saturn");
                                System.out.println("4: Uranus");
                                System.out.println("5: Neptune");
                                System.out.println("0: back");
                                int destinationChoice = s.nextInt();
                                switch (destinationChoice){
                                    case(0):
                                        break planetLoop;
                                    case(1):
                                        planet = Mars;
                                        break;
                                    case(2):
                                        planet = Jupiter;
                                        break;
                                    case(3):
                                        planet = Saturn;
                                        break;
                                    case(4):
                                        planet = Uranus;
                                        break;
                                    case(5):
                                        planet = Neptune;
                                        break;
                                }
                            }
//                            ship data
                        case(3):
                            System.out.println("Enter amount of oxygen");
                            oxygen = s.nextInt();

                            System.out.println("Enter amount of fuel");
                            fuel = s.nextInt();

                            System.out.println("Enter item");
                            s.nextLine();
                            item = s.nextLine();

                            System.out.println("4: number of body parts");
                            bodyPartsNumber = s.nextInt();

                            System.out.println("Enter industry date");
                            s.nextLine();
                            industryDate = s.nextLine();

                            System.out.println("Enter ship type");
                            s.nextLine();
                            shipType = s.nextLine();

                            break;
                        case(0):
                            break;
                    }
                    break;
                default:
                    System.out.println("Please choose 1 or 0");
            }

            // (main game loop) movement loop
            try {
                system.movementLoop(ship, Mars);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    int controllers() {
        while (true){
            int choice;
            System.out.println("choose who will perform the action");
            System.out.println("1: pilot");
            System.out.println("2: worker");
            choice = s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("choose an action");
                    System.out.println("1: releaseBodyPart");
                    System.out.println("0: back");
                    int pilotChoice = s.nextInt();
                    switch (pilotChoice){
                        case 0:
                            break;
                        case 1:
                            p.releaseBodyPart(ship);
                            return 0;
                    }
                    break;
                case 2:
                    System.out.println("choose an action");
                    System.out.println("1: reaper fuel");
                    System.out.println("2: reaper ox");
                    System.out.println("0: back");
                    int workerChoice = s.nextInt();
                    switch (workerChoice){
                        case 0:
                            break;
                        case 1:
                            w.repairFuel(ship);
                            return 0;
                        case 2:
                            w.repairOxygen(ship);
                            return 0;
                    }
                    break;
                default:
                    System.out.println("make sure that you have chosen 1 or 2");
            }
        }
    }

}
