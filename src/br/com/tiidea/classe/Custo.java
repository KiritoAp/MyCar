/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tiidea.classe;

/**
 *
 * @author 801501279
 */
public class Custo {
    
    private int idCost;
    private double monthlyPaymentCost;
    private double trafficTicketCost;
    private double fuelCost;
    private double ipvaCost;
    private double extraCost;
    private double maintenanceCost;
    private double dpvatCost;
    private double insuranceCost;

    public int getIdCost() {
        return idCost;
    }

    public void setIdCost(int idCost) {
        this.idCost = idCost;
    }

    public double getMonthlyPaymentCost() {
        return monthlyPaymentCost;
    }

    public void setMonthlyPaymentCost(double monthlyPaymentCost) {
        this.monthlyPaymentCost = monthlyPaymentCost;
    }

    public double getTrafficTicketCost() {
        return trafficTicketCost;
    }

    public void setTrafficTicketCost(double trafficTicketCost) {
        this.trafficTicketCost = trafficTicketCost;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getIpvaCost() {
        return ipvaCost;
    }

    public void setIpvaCost(double ipvaCost) {
        this.ipvaCost = ipvaCost;
    }

    public double getExtraCost() {
        return extraCost;
    }

    public void setExtraCost(double extraCost) {
        this.extraCost = extraCost;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public double getDpvatCost() {
        return dpvatCost;
    }

    public void setDpvatCost(double dpvatCost) {
        this.dpvatCost = dpvatCost;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    @Override
    public String toString() {
        return "Custo{" + "idCost=" + idCost + ", monthlyPaymentCost=" + monthlyPaymentCost + ", trafficTicketCost=" + trafficTicketCost + ", fuelCost=" + fuelCost + ", ipvaCost=" + ipvaCost + ", extraCost=" + extraCost + ", maintenanceCost=" + maintenanceCost + ", dpvatCost=" + dpvatCost + ", insuranceCost=" + insuranceCost + '}';
    }
    
    
}
