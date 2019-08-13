/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tiidea.classe;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Usuario {

    //Usarios:
    private int idUser;
    private String loginUser;
    private String passwordUser;
    private String nameUser;
    private String dateUser;
    private int genderUser;
    private String cpfUser;
    private String phoneUser;
    private String emailUser;
    private String addressUser;
    private String amountCarUser;
    private String cepUser;
    private String countryUser;
    private String cityUser;
    private String districtUser;
    private String numberHouseUser;
    private String complementHouseUser;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public int getGenderUser() {
        return genderUser;
    }

    public void setGenderUser(int genderUser) {
        this.genderUser = genderUser;
    }

    public String getDateUser() {
        return dateUser;
    }

    public void setDateUser(String dateUser) {
        this.dateUser = dateUser;
    }

    public String getCepUser() {
        return cepUser;
    }

    public void setCepUser(String cepUser) {
        this.cepUser = cepUser;
    }

    public String getCityUser() {
        return cityUser;
    }

    public void setCityUser(String cityUser) {
        this.cityUser = cityUser;
    }

    public String getCpfUser() {
        return cpfUser;
    }

    public void setCpfUser(String cpfUser) {
        this.cpfUser = cpfUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getAmountCarUser() {
        return amountCarUser;
    }

    public void setAmountCarUser(String amountCarUser) {
        this.amountCarUser = amountCarUser;
    }

    public String getAddressUser() {
        return addressUser;
    }

    public void setAddressUser(String addressUser) {
        this.addressUser = addressUser;
    }

    public String getCountryUser() {
        return countryUser;
    }

    public void setCountryUser(String countryUser) {
        this.countryUser = countryUser;
    }

    public String getDistrictUser() {
        return districtUser;
    }

    public void setDistrictUser(String districtUser) {
        this.districtUser = districtUser;
    }

    public String getNumberHouseUser() {
        return numberHouseUser;
    }

    public void setNumberHouseUser(String numberHouseUser) {
        this.numberHouseUser = numberHouseUser;
    }

    public String getComplementHouseUser() {
        return complementHouseUser;
    }

    public void setComplementHouseUser(String complementHouseUser) {
        this.complementHouseUser = complementHouseUser;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUser + ", loginUser=" + loginUser + ", passwordUser=" + passwordUser + ", nameUser=" + nameUser + ", dateUser=" + dateUser + ", genderUser=" + genderUser + ", cpfUser=" + cpfUser + ", phoneUser=" + phoneUser + ", emailUser=" + emailUser + ", addressUser=" + addressUser + ", amountCarUser=" + amountCarUser + ", cepUser=" + cepUser + ", countryUser=" + countryUser + ", cityUser=" + cityUser + ", districtUser=" + districtUser + ", numberHouseUser=" + numberHouseUser + ", complementHouseUser=" + complementHouseUser + '}';
    }

}
