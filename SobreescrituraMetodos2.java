/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturametodos2;

/**
 *
 * Enríquez Israel
 * Diaz Gabriel
 */
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;

class Vehiculo {

    private String nombrePropietario;
    private int nroCedula;
    private String marca;
    private String tecnologia;
    private int modelo;

    public Vehiculo() {
        nombrePropietario = "";
        nroCedula = 0;
        marca = "";
        tecnologia = "";
        modelo = 0;
    }

    public Vehiculo(String nombrePropietario, int nroCedula, String marca,
            String tecnologia, int modelo) {
        this.nombrePropietario = nombrePropietario;
        this.nroCedula = nroCedula;
        this.marca = marca;
        this.tecnologia = tecnologia;
        this.modelo = modelo;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public int getNroCedula() {
        return nroCedula;
    }

    public String getMarca() {
        return marca;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public int getModelo() {
        return modelo;
    }
}

class Automovil extends Vehiculo {

    private String matriculaAutomovil;

    public Automovil() {
        super();
        matriculaAutomovil = "Desconocido";
    }

    public Automovil(String nombrePropietario, int nroCedula,
            String marca, String tecnologia, int modelo) {
        super(nombrePropietario, nroCedula, marca, tecnologia, modelo);
        matriculaAutomovil = "Desconocido";
    }

    public void setMatriculaAutomovil(String matriculaAutomovil) {
        this.matriculaAutomovil = matriculaAutomovil;
    }

    public String getMatriculaAutomovil() {
        return matriculaAutomovil;
    }

    public void mostrarDatos() {
        System.out.println("Datos del Automovil:\nMARCA DEL AUTOMOVIL: "
                + getMarca() + "\n" + getTecnologia()
                + "MATRICULA DEL AUTOMOVIL: " + getMatriculaAutomovil());
    }

    public void mostrarDatos1() {
        System.out.println("Datos del Propietario:\nNOMBRE DEL PROPIETARIO: "
                + getNombrePropietario() + "\nNÚMERO DE CÉDULA:" + getNroCedula()
                + "\nPropietario del automovil: " + getMarca());
    }
}

class AutomovilAutonomo extends Automovil {

    private Calendar fechaComienzoFabricacionAutonomia;

    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia) {
        super();
        fechaComienzoFabricacionAutonomia = fechaComienzoFabricacionAutonomia;
    }

    public AutomovilAutonomo(String nombrePropietario, int nroCedula,
            String marca, String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia) {
        super(nombrePropietario, nroCedula, marca, tecnologia, modelo);
        this.fechaComienzoFabricacionAutonomia = fechaComienzoFabricacionAutonomia;
    }

    public Calendar getFechaComienzoFabricacionAutonomia() {
        return fechaComienzoFabricacionAutonomia;
    }

    public void mostrarDatos() {
        System.out.println("Datos del Automovil Autonomo:\n MARCA DEL AUTOMOVIL: "
                + getMarca() + "\n" + getTecnologia()
                + "MATRICULA DEL AUTOMOVIL: " + getMatriculaAutomovil()
                + "\nFECHA DE FABRICACION: "
                + fechaComienzoFabricacionAutonomia.getTime().toString());
    }

    public void mostrarDatos1() {
        System.out.println("Datos del Propietario:\nNOMBRE DEL PROPIETARIO: "
                + getNombrePropietario() + "\nC.I.:" + getNroCedula()
                + "Propietario del automovil autonomo: " + getMarca());
    }

}

class ListadoAutomoviles {

    private ArrayList<Automovil> ListadoAutomoviles;

    //Constructor
    public ListadoAutomoviles() {
        ListadoAutomoviles = new ArrayList<Automovil>();
    }

    //Métodos
    public void addAutomovil(Automovil automovil) {
        ListadoAutomoviles.add(automovil);
    }//Cierre método addAutomovil

    public void Listar() {
        System.out.println("DATOS DE LOS AUTOMOVILES EXISTENTE EN EL LISTADO: \n");
        for (Automovil ObjetoTmp : ListadoAutomoviles) {//Uso de for extendido
            ObjetoTmp.mostrarDatos();
            {
            }
        }
    }
}

class ListadoPropietarios {

    private ArrayList<Automovil> ListadoPropietarios;

    //Constructor
    public ListadoPropietarios() {
        ListadoPropietarios = new ArrayList<Automovil>();
    }

    //Métodos
    public void addAutomovil(Automovil automovil) {
        ListadoPropietarios.add(automovil);
    }//Cierre método addAutomovil

    public void Listar() {
        System.out.println("DATOS DE LOS PROPIETARIOS EXISTENTE EN EL LISTADO: \n");
        for (Automovil ObjetoTmp : ListadoPropietarios) {//Uso de for extendido
            ObjetoTmp.mostrarDatos1();
            {
            }
        }
    }
}

public class SobreescrituraMetodos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE - LATACUNGA\n");
        System.out.println("Nombres: Díaz Vera Gabriel Alexander"
                + "\nEnríquez Armendariz Israel Sebastian");
        System.out.println("Asignatura: Programación");
        System.out.println("Nrc: 7450");
        System.out.println("Tema: Sobreescritura\n");
        Scanner at = new Scanner(System.in);
        int ap;
        do {

            System.out.println("\t\t Datos de vehiculos y propietarios.");
            System.out.println("Elija una opción: ");
            System.out.println("1.Datos del Automovil");
            System.out.println("2.Datos del Propietario");
            System.out.println("3.Salir del Programa\n");
            System.out.println();
            ap = at.nextInt();

            switch (ap) {

                case 1:
                    int da;
                    System.out.println("\t\tDatos de los automoviles");
                    System.out.println("Elija una opción: ");
                    System.out.println("1.Ford");
                    System.out.println("2.Nissan\n");
                    da = at.nextInt();
                    switch (da) {

                        case 1:
                            Automovil auto1 = new Automovil("", 0, "Ford",
                                    "TECNOLOGÍA: Canadiense\n", 2018);
                            auto1.setMatriculaAutomovil("Ontario ABZM-264-20\n");
                            ListadoAutomoviles listado1 = new ListadoAutomoviles();
                            listado1.addAutomovil(auto1);

                            listado1.Listar();

                            break;

                        case 2:

                            Calendar fecha1 = Calendar.getInstance();
                            fecha1.set(2019, 10, 22);//Los meses van de 0 a 11, luego 10 representa noviembre
                            AutomovilAutonomo at1 = new AutomovilAutonomo("", 0,
                                    "Nissan", "TECNOLOGÍA: Europea\n", 2020, fecha1);

                            ListadoAutomoviles listado2 = new ListadoAutomoviles();
                            listado2.addAutomovil(at1);

                            listado2.Listar();

                            break;
                    }
                    break;

                case 2:
                    int dp;
                    System.out.println("\t\t\tDatos de los propietarios");
                    System.out.println("Elija una opción: ");
                    System.out.println("1.Propietario automovil");
                    System.out.println("2.Propietario automovil autónomo\n");
                    dp = at.nextInt();
                    switch (dp) {

                        case 1:

                            Automovil auto2 = new Automovil("Diaz Gabriel",
                                    123485424 - 3, "Ford", "", 0);
                            auto2.setMatriculaAutomovil("Ontario ABZM-264-20\n");
                            ListadoPropietarios listado3 = new ListadoPropietarios();
                            listado3.addAutomovil(auto2);
                            listado3.Listar();
                            break;

                        case 2:

                            Automovil at2 = new Automovil("Enríquez Israel",
                                    175072311 - 4, "Nissan", "", 0);
                            at2.setMatriculaAutomovil("Ontario ABZM-264-20\n");
                            ListadoPropietarios listado4 = new ListadoPropietarios();
                            listado4.addAutomovil(at2);
                            listado4.Listar();
                            break;
                    }
                    break;
            }
        } while (ap < 3);
    }

}
