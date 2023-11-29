package com.xjgv.recursividad.ejemplos;

import com.xjgv.recursividad.ejemplos.models.Componente;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete PC ATX");
        Componente fuentePoder = new Componente("Fuente Poder 700w");
        Componente placaMadre = new Componente("MainBoard Asus");
        Componente cpu = new Componente("CPU AMD Ryzen 5");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080");
        Componente gpu = new Componente("Nvidia GPU RTA");
        Componente gpuRAM = new Componente("4gb RAM");
        Componente gpuRAM2 = new Componente("4gb RAM");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente RAM = new Componente("Memoria RAM 32GB");
        Componente ssd = new Componente("Disco SSD 21");

        cpu.addComponente(ventilador).
                addComponente(disipador);

        tv.addComponente(gpu)
                .addComponente(gpuRAM)
                .addComponente(gpuRAM2)
                .addComponente(gpuVentiladores);

        placaMadre.addComponente(cpu)
                .addComponente(tv)
                .addComponente(RAM)
                .addComponente(ssd);

        pc.addComponente(fuentePoder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mosue"));



    }
}
