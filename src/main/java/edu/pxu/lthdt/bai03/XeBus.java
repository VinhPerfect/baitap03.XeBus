/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pxu.lthdt.bai03;

/**
 *
 * @author lqv20
 */
public class XeBus {
    String hangxe;
    int namsanxuat;
    int dongco;
    int soghe;

    public XeBus(String hangxe, int namsanxuat, int dongco, int soghe) {
        this.hangxe = hangxe;
        this.setNamsanxuat(namsanxuat);
        this.dongco = dongco;
        this.soghe = soghe;
    }

    public String getHangxe() {
        return hangxe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        if(namsanxuat<1829 || namsanxuat>2024){
            System.out.println("nam san xuat khong hop le");
        }else {
            this.namsanxuat = namsanxuat;
        }      
    }

    public int getDongco() {
        return dongco;
    }

    public void setDongco(int dongco) {
        if(dongco<150 || dongco>800){
            System.out.println("khong co lua chon phu hop");
        }else{
            this.dongco = dongco;
        }        
    }

    public int getSoghe() {
        return soghe;
        
    }

    public void setSoghe(int soghe) {
        if(soghe<8 || soghe>104){
            System.out.println("so ghe khong hop le");
        }else {
             this.soghe = soghe;
        }
       
    }

    @Override
    public String toString() {
        if(namsanxuat==0 || dongco==0 || soghe==0){
            return "Xe Bus{" + "hang xe=" + hangxe + '}'; 
        }else if(namsanxuat==0){
            return "Xe Bus{" + "hang xe=" + hangxe + ", dong co=" + dongco + ", so ghe=" + soghe + '}';
        }else if (dongco==0){
            return "Xe Bus{" + "hang xe=" + hangxe + ", nam san xuat=" + namsanxuat + ", so ghe=" + soghe + '}';
        }
        else if(soghe==0){
            return "Xe Bus{" + "hang xe=" + hangxe + ", nam san xuat=" + namsanxuat + ", dong co=" + dongco + '}';
        }else {
            return "Xe Bus{" + "hang xe=" + hangxe + ", nam san xuat=" + namsanxuat + ", dong co=" + dongco + ", so ghe=" + soghe + '}';
        }
        
    }
    
    
    
}
