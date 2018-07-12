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
