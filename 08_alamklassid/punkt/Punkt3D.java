class Punkt3D extends Punkt2D{
  double z = 0;
  public Punkt3D(double uus_x, double uus_y, double uus_z){
    super(uus_x, uus_y);
    z=uus_z;  
  }

  public String kirjutaAndmed(){
    return "x="+x+" y="+y+" z="+z;
  }

  public double kaugusNullist(){
     return Math.sqrt(x*x+y*y+z*z);
  }
}