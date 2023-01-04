import java.util.Scanner;

public class Menu {
    Scanner s = new Scanner(System.in);



    public void starterFunction() {
        Planet Mercury = new Planet(10, 10, 30, 5,"heat shield","MERCURY");
        Planet Venus = new Planet(15, 15, 20, 5,"robot","VENUS");
        Planet Mars = new Planet(30, 30, 20, 4,"oxygenator","MARS");
        Planet Jupiter = new Planet(40, 40, 50, 4,"gas mask","JUPITER");
        Planet Saturn = new Planet(50, 50, 50, 3,"light prism","SATURN");
        Planet Uranus = new Planet(60, 60, 65, 3,"sampler","URANUS");
        Planet Neptune = new Planet(70, 70, 70, 3,"cultivator","NEPTUNE");


        // -------------- initial data values

        // pilot
        String pilotName = "";
        int pilotAge = 0;
        double pilotWeight = 0;
        String pilotExp = "";
        int pilotScore = 0;
        boolean pilotExist = false;

        // worker
        String WorkerName;
        int workerAge = 0;
        double workerWeight = 0;
        boolean workerExist = false;

        // passengers number
        int passengersNumber = 0;
        boolean passengersExist = false;

        // planet
        Planet planet = Mercury;

        // ship
        Ship ship = new Ship();
        int oxygen = 0;
        int fuel = 0;
        String item = "";
        int bodyPartsNumber = 0;
        int industryDate = 0;
        String shipType = "";
        boolean shipExist = false;

        // intro screen
        System.out.println("**************************  CREATORS  **************************");
        System.out.println("Yehya Al-Ashmawy / Mohamed Aymn / Hamza Mohamed / Shadi Mostafa");
        System.out.println("***************************************************************");
        System.out.println("                                           all rights reserved©");

        while (true){
            System.out.println("0: Exit Menu");
            System.out.println("1: Setup mission");
            System.out.println("***************************************************************");
            int mainChoice = s.nextInt();
            switch (mainChoice){
                case(0):
                    return;
                case(1):
                    boolean mainCont = true;
                    while(mainCont)
                    {
                        System.out.println("people, destination and ship data are required !!!");
                        System.out.println("1: people data");
                        System.out.println("2: destination data");
                        System.out.println("3: ship data");
                        System.out.println("4: go to launchpad");
                        System.out.println("0: back");
                        System.out.println("***************************************************************");
                        int dataChoice = s.nextInt();
                        switch(dataChoice)
                        {
                            case(0):
                                mainCont = false;
                                break;
                            case(1):
                                boolean peopleCont = true;
                                while(peopleCont)
                                {
                                    System.out.println("1: import pilot data [data: " + "Name/ " + pilotName + ", Age/ " + pilotAge + ", Weight/ " + pilotWeight + ", Experience/ " + pilotExp + ", Score/ " + pilotScore + "]");
                                    System.out.println("2: import worker data [data: " + "Name/ " + workerAge + ", Age/ " + workerAge + ", weight/ " + workerWeight + "]");
                                    System.out.println("3: import passenger data [data: " + "Number/ " + passengersNumber + "]");
                                    System.out.println("0: back");
                                    System.out.println("***************************************************************");
                                    int peopleChoice = s.nextInt();
                                    switch (peopleChoice)
                                    {
                                        case(0):
                                            peopleCont = false;
                                            break;
                                        case(1):
                                            System.out.print("import pilot name: ");
                                            s.nextLine();
                                            while(true){
                                                pilotName = s.nextLine();
                                                if (!pilotName.equals("")) break;
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
                                                if (!pilotExp.equals("0")) break;
                                                System.out.print("      enter a valid input: ");
                                            }
                                            //
                                            System.out.print("import pilot flight score (numbers) ");
                                            while(true){
                                                pilotScore = s.nextInt();
                                                if (pilotScore != 0 ) break;
                                                System.out.print("      enter a valid input: ");
                                            }
                                            System.out.println("***************************************************************");
                                            Pilot p = new Pilot(pilotName, pilotAge,pilotWeight,pilotExp,pilotScore);
                                            ship.setPilot(p);
                                            pilotExist = true;
                                            break;
                                        case(2):
                                            System.out.print("import worker name:");
                                            s.nextLine();
                                            while(true){
                                                WorkerName = s.nextLine();
                                                if (!WorkerName.equals("")) break;
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
                                            System.out.println("***************************************************************");
                                            Worker w = new Worker(WorkerName, workerAge,workerWeight);
                                            ship.setWorker(w);
                                            workerExist = true;
                                            break;
                                        case(3):
                                            System.out.print("import number of passengers ");
                                            while(true){
                                                passengersNumber = s.nextInt();
                                                if (passengersNumber != 0 ) break;
                                                System.out.print("      enter a valid input: ");
                                            }
                                            System.out.println("***************************************************************");
                                            Ship.setPeopleCount(Ship.getPeopleCount()+passengersNumber);
                                            passengersExist = true;
                                            break;
                                    }
                                }
                                break;
                            case(2):
                                boolean planetCont = true;
                                while (planetCont)
                                {
                                    System.out.println("choose your destination, Current planet is " + planet.getName() + ", Needed item is " + planet.getRequiredItem() + ", Distance to fuel is " + planet.getFuel_Required() + ", Recommended parts are " + (planet.getDistance()/5));
                                    System.out.println("1: Mercury");
                                    System.out.println("2: Venus");
                                    System.out.println("3: Mars");
                                    System.out.println("4: Jupiter");
                                    System.out.println("5: Saturn");
                                    System.out.println("6: Uranus");
                                    System.out.println("7: Neptune");
                                    System.out.println("0: back");
                                    System.out.println("***************************************************************");
                                    int destinationChoice = s.nextInt();
                                    switch (destinationChoice){
                                        case(0):
                                            planetCont = false;
                                            break;
                                        case(1):
                                            planet = Mercury;
                                            break;
                                        case(2):
                                            planet = Venus;
                                            break;
                                        case(3):
                                            planet = Mars;
                                            break;
                                        case(4):
                                            planet = Jupiter;
                                            break;
                                        case(5):
                                            planet = Saturn;
                                            break;
                                        case(6):
                                            planet = Uranus;
                                            break;
                                        case(7):
                                            planet = Neptune;
                                            break;
                                    }
                                }
                                break;
                            case(3):
                                boolean shipCont = true;
                                while(shipCont)
                                {
                                    System.out.println("Ship type: " + shipType + ", Industry date "+ industryDate + ", Oxygen amount " + oxygen + ", Fuel amount " + fuel + ", Item " + item + ", Body parts " + bodyPartsNumber);
                                    System.out.println("1: Edit");
                                    System.out.println("0: back");
                                    System.out.println("***************************************************************");
                                    int shipChoice = s.nextInt();
                                    switch (shipChoice)
                                    {
                                        case (0):
                                            shipCont = false;
                                            break;
                                        case (1):
                                            System.out.println("Enter ship type");
                                            s.nextLine();
                                            shipType = s.nextLine();
                                            ship.setSpaceShipType(shipType);

                                            System.out.println("Enter amount of oxygen");
                                            oxygen = s.nextInt();
                                            ship.setOxygenCapacity(oxygen);

                                            System.out.println("Enter amount of fuel");
                                            fuel = s.nextInt();
                                            ship.setFuelCapacity(fuel);

                                            System.out.println("Enter item");
                                            s.nextLine();
                                            item = s.nextLine();
                                            ship.setItem(item);

                                            System.out.println("Enter number of body parts");
                                            bodyPartsNumber = s.nextInt();
                                            ship.setNoBodyParts(bodyPartsNumber);

                                            System.out.println("Enter industry date");
                                            s.nextLine();
                                            industryDate = s.nextInt();
                                            ship.setIndustryDate(industryDate);
                                            shipExist = true;
                                            break;
                                    }
                                }
                                break;
                            case(4):
                                boolean ready = true;
                                if(!pilotExist)
                                {
                                    ready = false;
                                    System.out.println("Please add a pilot");
                                }

                                if(!workerExist)
                                {
                                    ready = false;
                                    System.out.println("Please add a worker");
                                }

                                if(!passengersExist)
                                {
                                    ready = false;
                                    System.out.println("Please add passangers");
                                }

                                if(!shipExist)
                                {
                                    ready = false;
                                    System.out.println("Please add ship");
                                }
                                System.out.println("***************************************************************");

                                if(ready)
                                {
                                    // (main game loop) movement loop
                                    try {
                                        ShipSystem system = new ShipSystem();
                                        system.movementLoop(ship, planet);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }

                            break;
                        }
                    }
            }


        }


    }

    static void controllers(Ship ship) {
        Scanner s = new Scanner(System.in);
        while (true){
            int choice;
            Pilot p = ship.getPilot();
            Worker w = ship.getWorker();

            System.out.println("choose who will perform the action");
            System.out.println("1: pilot");
            System.out.println("2: worker");
            System.out.println("0: back");
            System.out.println("***************************************************************");
            choice = s.nextInt();
            switch (choice){
                case 0:
                    return;
                case 1:
                        System.out.println("choose an action");
                        System.out.println("1: releaseBodyPart");
                        System.out.println("2: waterSystem");
                        System.out.println("3: Speak");
                        System.out.println("0: back");
                        int pilotChoice = s.nextInt();
                        switch (pilotChoice){
                            case 0:

                                break;
                            case 1:
                                p.releaseBodyPart(ship);
                                break;
                            case 2:
                                p.waterSystem(ship);
                                break;
                            case 3:
                                p.speak();
                                break;
                        }

                    break;
                case 2:
                        System.out.println("choose an action");
                        System.out.println("1: repair fuel");
                        System.out.println("2: repair oxygen");
                        System.out.println("3: Speak");
                        System.out.println("0: back");
                        int workerChoice = s.nextInt();
                        switch (workerChoice){
                            case 0:

                                break;
                            case 1:
                                w.repairFuel(ship);
                                break;
                            case 2:
                                w.repairOxygen(ship);
                                break;
                            case 3:
                                w.speak();
                                break;
                        }

                    break;
                default:
                    System.out.println("make sure that you have chosen 1 or 2");
            }
        }
    }

}
