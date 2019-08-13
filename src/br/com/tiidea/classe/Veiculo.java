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
public class Veiculo {
    private int idCar;
    private int fkidcliente;
    private String plateCar;
    private int yearCar;
    private int categoryCar;
    private String modelCar;
    private String brandCar;
    private String adapted;

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getPlateCar() {
        return plateCar;
    }

    public void setPlateCar(String plateCar) {
        this.plateCar = plateCar;
    }

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }

    public int getCategoryCar() {
        return categoryCar;
    }

    public void setCategoryCar(int categoryCar) {
        this.categoryCar = categoryCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getAdapted() {
        return adapted;
    }

    public void setAdapted(String adapted) {
        this.adapted = adapted;
    }

    public int getFkidcliente() {
        return fkidcliente;
    }

    public void setFkidcliente(Usuario fkidcliente) {
        this.fkidcliente = fkidcliente.getIdUser();
    }
    

   
   
    
}
