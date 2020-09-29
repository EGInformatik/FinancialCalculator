/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author alex
 */
public class FinancialModels {
    

    /**
     * Funktion til at beregne rentefod
     * @param futureCapital angiver Kn = slutværdien
     * @param presentCapital angiver K0 = startværdien
     * @param periods angiver n = antallet af terminer
     * @return r = den beregnede rentefod over den givne periode og kapitalforøgelse/formindskelse
     */
    public double calculateInterest(double futureCapital, double presentCapital, double periods) {
        return -1+Math.pow((futureCapital/presentCapital),(1/periods));
    }   
    
    public double calculatePresentCapital(double futureCapital, double interest, double periods) {
        return futureCapital/Math.pow(1+interest,periods);
    }
    
     /**
     * Funktion til at beregne fremtidig værdi
     * @param presentCapital angiver K0 = startværdien
     * @param interest angiver r = rentefoden
     * @param periods angiver n = antallet af terminer
     * @return Kn = slutværdien efter en given mængde terminer med en bestmt rentefod og kapital
     */
    public double calculateFutureCapital(double presentCapital, double interest, double periods) {
        return presentCapital*(Math.pow((1+interest),periods));
    }
    
    public double calculatePeriods(double futureCapital, double presentCapital, double interest) {
        return (Math.log(futureCapital)-Math.log(presentCapital))/Math.log(1+interest);
    }
}
