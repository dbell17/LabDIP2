/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab1;

/**
 *
 * @author Don
 */
public class HourlyPlusBonusEmployee implements Employee {
   
    private double hourlyRate;
    private double totalHrsPerYear;
    
    public HourlyPlusBonusEmployee(double hourlyRate, double totalHrsPerYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsPerYear(totalHrsPerYear);
    }

    public final double getAnnualWages() {
        return hourlyRate * totalHrsPerYear + 50;
    }
    
    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsForYear() {
        return totalHrsPerYear;
    }

    public final void setTotalHrsPerYear(double totalHrsPerYear) {
        if(totalHrsPerYear < 0 || totalHrsPerYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsPerYear = totalHrsPerYear;
    }    
}
