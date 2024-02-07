// Superclass
class HillStations 
{
    public void location()
   {
        System.out.println("Location: Various locations in India");
    }

    public void famousFor()
   {
        System.out.println("Famous for: Natural beauty and tourism");
    }
}

// Subclass 1
class Manali extends HillStations 
{
    @Override
    public void location() 
   {
        System.out.println("Location: Manali, Himachal Pradesh, India");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Adventure sports and scenic views");
    }
}

// Subclass 2
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Mussoorie, Uttarakhand, India");
    }

    @Override
    public void famousFor()
    {
        System.out.println("Famous for: Hill stations and educational institutions");
    }
}

// Subclass 3
class Gulmarg extends HillStations
{
    @Override
    public void location()
    {
        System.out.println("Location: Gulmarg, Jammu and Kashmir, India");
    }

    @Override
    public void famousFor()
    {
        System.out.println("Famous for: Skiing and snowboarding");
    }
}

public class Mainh 
{
    public static void main(String[] args) 
    {
        HillStations hillStation;

        // Creating objects of each subclass
        hillStation = new Manali();
        System.out.println("Details of Manali:");
        hillStation.location();
        hillStation.famousFor();

        hillStation = new Mussoorie();
        System.out.println("\nDetails of Mussoorie:");
        hillStation.location();
        hillStation.famousFor();

        hillStation = new Gulmarg();
        System.out.println("\nDetails of Gulmarg:");
        hillStation.location();
        hillStation.famousFor();
    }
}
