package nl.novi.backendspringboottechiteasy.models;

import javax.persistence.*;
//  Door de annotatie entity te gebruiken worden automatisch entiteiten (tabellen) gemaakt.
@Entity
public class Speaker {
    @Id
//   De volgende annotatie zorgt dat Java zelf een id aan een televisie toewijst
    @GeneratedValue
    private Long id;
//  We maken de columns aan voor de attributen
    private String brand;
    private String name;
    private Double price;
    private Boolean wifi;
    private Boolean dolbySurround;
    private Boolean bluetooth;
    private Boolean voiceControl;
    private Integer originalStock;
    private Integer sold;
//    De getters en de setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getDolbySurround() {
        return dolbySurround;
    }

    public void setDolbySurround(Boolean dolbySurround) {
        this.dolbySurround = dolbySurround;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Boolean getVoiceControl() {
        return voiceControl;
    }

    public void setVoiceControl(Boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public Integer getOriginalStock() {
        return originalStock;
    }

    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }
}
