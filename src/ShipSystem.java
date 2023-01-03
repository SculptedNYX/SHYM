import java.util.Scanner;

import static java.lang.Thread.sleep;

public class ShipSystem {
    private String alarm = "Ship is safe";
    private boolean onFire = false;
    private Mission mission;
    public int movementLoop(Ship ship, Planet planet) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <=5; i++)
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
            if(!oxygenCycle(ship))
            {
                System.out.println("MISSION FAILED!!!\nno oxygen :(");
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
        if(ship.getItem() == planet.getItem() && ship.getNoBodyParts() == 0)
        {
            System.out.println("MISSION IS A SUCCESS WE ARE SAFE ON " + planet.getName());
            return 0;
        }
        else
        {
            System.out.println("MISSION FAILED!!!");
            return 1;
        }
    }

    private boolean oxygenCycle(Ship ship)
    {
        if(!ship.checkOxygen()) {return false;}
        if(ship.isOxygenLeak())
        {
            ship.setOxygenCapacity(ship.getOxygenCapacity()- Ship.getPeopleCount()*2);
        }
        else
        {
            ship.setOxygenCapacity(ship.getOxygenCapacity()- Ship.getPeopleCount());
            alarm = "Ship is safe";
        }
        return true;
    }

    private boolean oxygenFailure(Ship ship)
    {
        alarm = "OXYGEN TANK LEAKING!!!";
        ship.setOxygenLeak(true);
        return true;
    }

    private boolean fuelCycle(Ship ship)
    {
        if(!ship.checkFuel()) {return false;}
        if(ship.isFuelLeak())
        {
            //ship.setFuelCapacity(ship.getOxygenCapacity() - mission.getFuelRate);
        }
        else
        {
            //ship.setOxygenCapacity(ship.getOxygenCapacity()- Ship.getPeopleCount());
            alarm = "Ship is safe";
        }
        return true;
    }

    private boolean fuelFailure(Ship ship)
    {
        alarm = "OXYGEN TANK LEAKING!!!";
        ship.setFuelLeak(true);
        return true;
    }

    private boolean doorFailure(Ship ship)
    {
        alarm = "DOOR SUDDENLY OPENED!!!";
        ship.setDoorsStatus(true);
        return true;
    }

}
