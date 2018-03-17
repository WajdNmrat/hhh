/**
 * Created by nmrat on 26/01/2018.
 */

public class Accounting extends Person  {
    private double workhours;
    private String Placcofeducation;
    private double Yearofservice;

    @Override
    public String toString() {
        return "Accounting{" +
                "workhours=" + workhours +
                ", Placcofeducation='" + Placcofeducation + '\'' +
                ", Yearofservice=" + Yearofservice +
                '}';
    }
}
