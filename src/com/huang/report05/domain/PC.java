package com.huang.report05.domain;

public class PC {
    CPU cpu;
    HardDisk hd;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHd() {
        return hd;
    }

    public void setHd(HardDisk hd) {
        this.hd = hd;
    }
    public void show(){
        System.out.println("CPU的速度:" + cpu.getSpeed());
        System.out.println("disk的容量:" + hd.getAmount());
    }
}
