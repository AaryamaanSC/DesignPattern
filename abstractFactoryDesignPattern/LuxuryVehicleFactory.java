public class LuxuryVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(int avg) {
        if(avg<20){
            return new Lamborghini();
        }else{
            return new Mercedes();
        }
    }
}
