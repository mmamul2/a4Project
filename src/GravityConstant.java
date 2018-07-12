/**
 * Class to implement a GravityModel which users a constant value, such as 9.81 for Earth's gravity.
 */
public class GravityConstant implements GravityModel {
   double g;

   GravityConstant(double g){
       this.g = g;
   }


    @Override
    public double getGravitationalField() {
        return g;
    }
}
