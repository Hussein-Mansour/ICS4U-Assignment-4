/*
* This is the Triangle class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2022-1-5
*/

/**
* Process class.
*/
public class Triangle {

    /**
    * Private field 1.
    * Side A (length).
    */
    protected private double sda;

    /**
    * Private field 2.
    * Side B (length).
    */
    protected private double sdb;

    /**
    * Private field 3.
    * Side C (length).
    */
    protected private double sdc;

    /**
    * Constructor.
    *
    * @param newA New A.
    * @param newB New B.
    * @param newC New C.
    */
    Triangle(double newA, double newB, double newC) {
        sda = newA;
        sdb = newB;
        sdc = newC;
    }

    /**
    * Heron Method.
    *
    * @param newsda value.
    * @param newsdb value.
    * @param newsdc value.
    * @return Area.
    */
    public double heronFormula(double newsda, double newsdb, double newsdc) {
        // Semiperimeter
        final double sem = (newsda + newsdb + newsdc) / 2;
        // Preocess.
        final double process = sem * (sem - newsda) * (sem - newsdb) * (sem - newsdc);
        // Heron's formula
        final double area = Math.sqrt(process);
        // return.
        return area;
    }

    /**
    * Parameter Method.
    *
    * @param newsda value.
    * @param newsdb value.
    * @param newsdc value.
    * @return parameter.
    */
    public double parameter(double newsda, double newsdb, double newsdc) {
        // Semiperimeter
        final double parameter = newsda + newsdb + newsdc;
        // return.
        return parameter;
    }

    /**
    * Angle A Method.
    *
    * @param newc value.
    * @param newb value.
    * @param newa value.
    * @return cosine.
    */
    public double angleA(double newa, double newb, double newc) {
        // power.
        final double pow = Math.pow(newa, 2) - Math.pow(newb, 2) - Math.pow(newc, 2);
        // 2bc.
        final double twoBc = -1 * 2 * sdb * sdc;
        // result.
        final double res = pow / twoBc;
        // Cosine-1
        final double cos = Math.toDegrees(Math.acos(res));
        // return.
        return cos;
    }

    /**
    * Angle B Method.
    *
    * @param newc value.
    * @param newb value.
    * @param newa value.
    * @return cosine.
    */
    public double angleB(double newa, double newb, double newc) {
        // power.
        final double pow = Math.pow(newb, 2) - Math.pow(newa, 2) - Math.pow(newc, 2);
        // 2bc.
        final double twoBc = -1 * 2 * newa * newc;
        // result.
        final double res = pow / twoBc;
        // Cosine-1
        final double cos = Math.toDegrees(Math.acos(res));
        // return.
        return cos;
    }

    /**
    * Angle C Method.
    *
    * @param newc value.
    * @param newb value.
    * @param newa value.
    * @return cosine.
    */
    public double angleC(double newa, double newb, double newc) {
        // power.
        final double pow = Math.pow(newc, 2) - Math.pow(newa, 2) - Math.pow(newb, 2);
        // 2bc.
        final double twoBc = -1 * 2 * newa * newb;
        // result.
        final double res = pow / twoBc;
        // Cosine-1
        final double cos = Math.toDegrees(Math.acos(res));
        // return.
        return cos;
    }
}
