public class NormalVehicleFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(int avg) {
        if(avg<25){
            return new Suzuki();
        }else{
            return new Nano();
        }
    }
}
