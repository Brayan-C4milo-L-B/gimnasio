package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Entrenador {

    private String nombre;
    private String telefono;
    private String especialidad;
    private String correo;
    private LinkedList<Miembro> miembros;

    public Entrenador(String nombre, String telefono, String especialidad, String correo,
            LinkedList<Miembro> miembros) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.correo = correo;
        miembros = new LinkedList<>();
    }

    /*
    *Metedo para verificar miembro que se asigna al entrenador.
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
    *Metodo para agregar un miembro nuevo a los asignados al entrenador.
     */
    public void agregarMiembro(Miembro miembro) {
        if (!verificarMiembro(miembro.getNombre())) {
            miembro.add(miembro);
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCorreo() {
        return correo;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", telefono=" + telefono + ", especialidad=" + especialidad
                + ", correo=" + correo + ", miembros=" + miembros + "]";
    }

    public void add(Entrenador entrenador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
