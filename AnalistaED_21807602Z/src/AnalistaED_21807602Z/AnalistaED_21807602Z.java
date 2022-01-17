/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalistaED_21807602Z;

import java.util.*;
/**
 * <h1>EJERCICIO PRACTICO EXAMEN EVAL 1 ED</h1>
 * @author CARMEN FERNANDEZ DNI 21807602Z
 * @version
 */
/**
 * Constructor con tres parámetros
 * nombreCompleto nombre completo en mayúsculas
 * dni documento nacional de identidad con letra y sin espacios
 */
public class AnalistaED_21807602Z {
static final double FACTOR_HORA_EXTRA = 1.2;
private String nombreCompleto, dni;
private double salarioBasePorHora = 10.56;
public AnalistaED_21807602Z(String nombreCompleto, String dni) {
this.nombreCompleto = nombreCompleto;
this.dni = dni;
}
/**
 * Calcula el salario bruto mensual en función del salario base por hora y las horas extras.
 * FACTOR_HORA_EXTRA constante que determina el precio por hora de la hora extra.
 * @param horasExtra número de horas extra dedicadas redondeado a la baja (entero)
 * @return salarioFinal devuelve el salario bruto mensual en euros con dos decimales.
 */
public double getSalarioEsteMes(int horasExtra) {
double cantidadExtra, salarioFinal;
cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
return salarioFinal;
}
// Este método no lo comentaremos con JavaDoc
public static void main(String[] args) {
AnalistaED_21807602Z emp = new AnalistaED_21807602Z("CARMEN FERNANDEZ VERDU",
"2180720Z");
int horasExtra = 2;
System.out.println("El salario de " + emp.nombreCompleto + "este mes será de" + emp.getSalarioEsteMes(horasExtra)
+ " euros, al hacer " + horasExtra + " horas extra.");
}
}
