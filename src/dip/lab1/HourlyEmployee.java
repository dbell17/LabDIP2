package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsPerYear;

    /**
     * default constructor. Is this the best way to go?
     */
    public HourlyEmployee(double hourlyRate, double totalHrsPerYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsPerYear(totalHrsPerYear);
    }

    /**
     * Convenience constructor. Is this the best way to go?
     *
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public final double getAnnualWages() {
        return hourlyRate * totalHrsPerYear;
    }

    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsPerYear() {
        return totalHrsPerYear;
    }

    public final void setTotalHrsPerYear(double totalHrsPerYear) {
        if (totalHrsPerYear < 0 || totalHrsPerYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsPerYear = totalHrsPerYear;
    }

}
