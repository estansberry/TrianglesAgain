public class Point{

  private double x;
  private double y;

  public Point(double X, double Y){
    x = X;
    y = Y;
  }
  public Point(Point p){
    x = p.x;
    y = p.y;
  }
  public double getX(){
    return(x);
  }
  public double getY(){
    return(y);
  }
  public double distanceTo(Point other){
    double total = (Math.sqrt((x - other.x)*(x- other.x) + (y- other.y)*(y- other.y)));
    return total;
  }
  public boolean equals(Point other){
    return(x == other.x && y == other.y);
  }
}
