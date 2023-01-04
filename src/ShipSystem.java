import java.util.Random;

import static java.lang.Thread.sleep;

public class ShipSystem {
    private String alarm = "Ship is safe";

    public void movementLoop(Ship ship, Planet planet) throws InterruptedException{
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
            if(alarm.equals("Ship is safe"))
            {
                riskMaker(planet,ship);
            }

            if(ship.isOnFire())
            {
                alarm = "FIRE BROKE OUT";
            }
            else if (ship.isFuelLeak())
            {
                alarm = "FUEL IS LEAKING";
            }
            else if(ship.isOxygenLeak())
            {
                alarm = "OXYGEN IS LEAKING";
            }
            else
            {
                alarm = "Ship is safe";
            }

            System.out.println("Ship: " + ship.getSpaceShipType() + ", total weight = 18TONS");
            System.out.println("Planet: " + planet.getName() + ", risk level = " + planet.getMission_Risk());

            if(!oxygenCycle(ship))
            {
                System.out.println("MISSION FAILED!!!\nno oxygen :(");
                return;
            }

            if(!fuelCycle(ship))
            {
                System.out.println("MISSION FAILED!!!\nno fuel :(");
                return;
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
            System.out.println("O");
            System.out.println("\n"+alarm);

            if(i % 5 == 0)
            {
                if(ship.getNoBodyParts() - 1 >= 0) {
                    Menu.controllers(ship);
                }
                else
                {
                    System.out.println("MISSION FAILED!!!\nmissing parts :(");
                    return;
                }
            }

            sleep(500);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        if(!ship.getItem().equals(planet.getRequiredItem()))
        {
            System.out.println("MISSION FAILED!!!\nwrong item :(");
            return;
        }

        if(ship.getNoBodyParts() != 0)
        {
            System.out.println("MISSION FAILED!!!\ntoo many parts :(");
            return;
        }

        System.out.println("MISSION IS A SUCCESS WE ARE SAFE ON " + planet.getName());
        System.out.println("***************************************************************");

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

    private void riskMaker(Planet planet, Ship ship)
    {
        int baseRisk = (int) (80 - planet.getMission_Risk());
        Random rand = new Random();
        int randNum = rand.nextInt(baseRisk);
        switch (randNum)
        {
            case (0):
                ship.setOxygenLeak(true);
                break;
            case(1):
                ship.setFuelLeak(true);
                break;
            case(2):
                ship.setOnFire(true);
            default:
                break;
        }
    }

}
