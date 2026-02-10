package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //crear persona con constructor vacio
    Persona p1 = new Persona();
    p1.setNombre("cesilia");
    p1.setEdad(90);
    p1.setGenero("niña");

    // crear persona con constructor lleno

        Persona p2 = new Persona("sasha",3,"niña");

        //imprimir contostring
        System.out.println(p1.toString());
        System.out.println(p2.toString());


    }

}