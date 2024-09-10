package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Gimnasio {

    public String nombre;
    public LinkedList<Miembro> miembros;
    public LinkedList<Entrenador> entrenadores;

    /*
    *Constructor
     */
    public Gimnasio(String nombre) {
        this.nombre = nombre;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();
    }

    /*    
    *Metedo para verificar un miembro por su nomb    
     */
    public boolean verificarMiembro(String nombre) {
        boolean centinela = false;
        for (Miembro miembro : miembros) {
            if (miembro.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*    
        *Metodo para agregar miembro nuevo al gimnasio.     
     */
    public void agregarMiembro(Miembro miembro) {
        if (!verificarMiembro(miembro.getNombre())) {
            miembro.add(miembro);
        }
    }

    /*
        *Metodo para agregar un entrenador nuevo al gimnasio.
     */
    public void agregarEntrenador(Entrenador entrenador) {
        if (!verificarEntrenador(entrenador.getCorreo())) {
            entrenador.add(entrenador);
        }
    }

    /*
        *Metodo para verificar un entrenador del gimnasio.
     */
    public boolean verificarEntrenador(String correo) {
        boolean centinela = false;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    *Metodo para eliminar un miembro del gimnasio.
     */
    public void eliminarMiembro(String nombre) {
        for (Miembro miembro : miembros) {
            if (miembro.getNombre().equals(nombre)) {
                miembro.remove(miembro);
                break;

            }
        }
    }

    /*
    *Metodo para eliminar un entrenador del gimnasio.
     */
    public void eliminarEntrenador(String correo) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                entrenadores.remove(entrenador);
                break;
            }
        }
    }

    /*
    *Metodo para mostrar mensaje del programa con los datos que se soliciten.
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);

    }

    /*
    *Metodo para mostrar los nombres de los miembros ingresados desde el mas reciente hasta el mas antiguo.
     */
    public void listaNombresInversos() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());

        }
    }

    /*
    *Metodo para obtener a los miembros que son menores de 18 años.
     */
    public LinkedList<Miembro> ObtenerMenorEdad() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);

            }
        }
        return menores;
    }

    /*
    *Metodo para verificar las vocales en un nombre.
     */
    public static boolean isVocal(char nombre) {
        boolean centinela = false;
        if (nombre == 'a' || nombre == 'e' || nombre == 'i' || nombre == 'o' || nombre == 'u') {
            centinela = true;
        }
        return centinela;
    }

    /*
    *Metodo para contar las vocales que contiene un nombre.
     */
    public static int contarVocales(String nombre) {
        int cont = 0;
        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            if (isVocal(letra)) {
                cont++;
            }
        }
        return cont;
    }

    /*
    *Metodo para eliminar un miembro con un nombre que contenga 3 vocales o mas en su nombre.
     */
    public boolean vocalesCont(int cont, Miembro nombre) {
        boolean centinela = false;
        if (cont >= 3) {
            nombre.remove(nombre);
        } else if (cont <= 3) {
            centinela = true;
        }
        return centinela;
    }

    /*
    *Metodo para calcular el promedio de edad.
     */
    public int calcularPromedioEdad(Miembro miembros, int edad) {
        int acum = 0;
        int cont = 0;
        i = 0;
        j = 0;
        for (int i = 0; acum >= 0; i++) {
            for (int j = 0; cont >= 0; j++) {
            }
            acum = acum / cont;
        }
        return acum;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", miembros=" + miembros + ", entrenadores=" + entrenadores + "]";
    }
}
