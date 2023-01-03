import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class ShipSystem {
    private String alarm = "Ship is safe";
    private boolean onFire = false;

    public int movementLoop(Ship ship, Planet planet) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        for(int i = 5; i >= 1; i--)
        {
            System.out.println(i);
            sleep(1000);
        }
        String liftText = "LIFT OFF!! WE HAVE LIFT OFF!!!";

        for(int i = 0; i < liftText.length(); i++)
        {
            System.out.print(liftText.charAt(i));
            sleep(100);
        }
        System.out.println("\nWHSOOOOOOOOOSHOOOOOOOO!!!!!!!");
        sleep(2000);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        for(int i = 0; i < planet.getDistance(); i++)
        {
            if(alarm == "Ship is safe")
            {
                riskMaker(planet,ship);
            }

            System.out.println("Ship: " + ship.getSpaceShipType() + ", total weight = 18TONS");
            System.out.println("Planet: " + planet.getName() + ", risk level = " + planet.getMission_Risk());

            if(!oxygenCycle(ship))
            {
                System.out.println("MISSION FAILED!!!\nno oxygen :(");
                return 1;
            }

            if(!fuelCycle(ship))
            {
                System.out.println("MISSION FAILED!!!\nno fuel :(");
                return 1;
            }

            for (int j = 0; j < i; j++)
            {
                System.out.print("...");
            }
            System.out.print("**");
            for (int j = 0; j < ship.getNoBodyParts(); j++)
            {
                System.out.print("==");
            }
            System.out.print(">");
            for (int j = 0; j < planet.getDistance() - i; j++)
            {
                System.out.print("...");
            }
            System.out.println("0");
            System.out.println("\n"+alarm);

            if(i % 5 == 0)
            {
                if(ship.getNoBodyParts() - 1 >= 0) {
                    System.out.println("Please eject part of the ship");
                    // Call menu

                    // Temp code
                    if (scanner.nextInt() == 1) {
                        ship.getPilot().releaseBodyPart(ship);
                    }
                }
                else
                {
                    System.out.println("MISSION FAILED!!!\nmissing parts :(");
                    return 1;
                }
            }

            sleep(500);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        if(!ship.getItem().equals(planet.getRequiredItem()))
        {
            System.out.println("MISSION FAILED!!!\nwrong item :(");
            return 1;
        }

        if(ship.getNoBodyParts() != 0)
        {
            System.out.println("MISSION FAILED!!!\ntoo many parts :(");
            return 1;
        }

        System.out.println("MISSION IS A SUCCESS WE ARE SAFE ON " + planet.getName());
        return 0;

    }

    private boolean oxygenCycle(Ship ship)
    {
        if(!ship.checkOxygen()) {return false;}
        if(ship.isOxygenLeak()|| ship.isOnFire())
        {
            ship.setOxygenCapacity(ship.getOxygenCapacity()- Ship.getPeopleCount()*2);
            System.out.println("OXYGEN PENALTY");
        }
        else
        {
            ship.setOxygenCapacity(ship.getOxygenCapacity()- Ship.getPeopleCount());
        }
        return true;
    }

    private boolean fuelCycle(Ship ship)
    {
        if(!ship.checkFuel()) {return false;}
        if(ship.isFuelLeak())
        {
            ship.setFuelCapacity(ship.getFuelCapacity() - Ship.getPeopleCount()*2);
            System.out.println("FUEL PENALTY");
        }
        else
        {
            ship.setFuelCapacity(ship.getFuelCapacity() - Ship.getPeopleCount());
        }
        return true;
    }

    private void oxygenFailure(Ship ship)
    {
        alarm = "OXYGEN TANK LEAKING!!!";
        ship.setOxygenLeak(true);
    }

    private void fuelFailure(Ship ship)
    {
        alarm = "FUEL TANK LEAKING!!!";
        ship.setFuelLeak(true);
    }

    private void fireFaliure(Ship ship)
    {
        alarm = "FIRE SUDDENLY STARTED!!!";
        ship.setOnFire(true);
    }

    private void riskMaker(Planet planet, Ship ship)
    {
        int baseRisk = (int) (100 - planet.getMission_Risk());
        Random rand = new Random();
        int randNum = rand.nextInt(baseRisk);
        switch (randNum)
        {
            case (0):
                oxygenFailure(ship);
                break;
            case(1):
                fuelFailure(ship);
                break;
            case(2):
                fireFaliure(ship);
            default:
                break;
        }
    }

}
