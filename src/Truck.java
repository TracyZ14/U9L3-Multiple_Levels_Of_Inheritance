public class Truck extends Vehicle
{
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
    {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public int getAxles()
    {
        return axles;
    }

    public boolean hasTrailer()
    {
        return hasTrailer;
    }

    public void printTruck()
    {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Number of axles: " + axles);
        System.out.println("Has trailer: " + hasTrailer);
    }

    public boolean validateLicensePlate()
    {
        if(hasTrailer)
        {
            String ending = getLicensePlate().substring(getLicensePlate().length() - 2);
            if((axles > 4) && (ending.equals("MX")))
            {
                return true;
            }
            if((axles <= 4) && (ending.equals("LX")))
            {
                return true;
            }
            return false;
        }
        return true;
    }
}