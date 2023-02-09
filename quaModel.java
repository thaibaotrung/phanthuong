/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5cnpm;

/**
 *
 * @author oOOo
 */
public class quaService {
    private int id;
    private String hoTen;
    private int tuoi;
    private String tenqua;
    private int giatien;

    public quaService() {
    }

    public quaService(int id, String hoTen, int tuoi, String tenqua, int giatien) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.tenqua = tenqua;
        this.giatien = giatien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTenqua() {
        return tenqua;
    }

    public void setTenqua(String tenqua) {
        this.tenqua = tenqua;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

   
}
