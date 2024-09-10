package co.edu.uniquindio.poo;

public class Miembro {

    private String nombre, genero;
    private int edad;
    private Tipo_membresia tipo_membresia;

    public Miembro(String nombre, int edad, String genero, Tipo_membresia tipo_membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipo_membresia = tipo_membresia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo_membresia(Tipo_membresia tipo_membresia) {
        this.tipo_membresia = tipo_membresia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public Tipo_membresia getTipo_membresia() {
        return tipo_membresia;
    }

    @Override
    public String toString() {
        return "Miembro [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", tipo_membresia="
                + tipo_membresia + "]";
    }

    public void remove(Miembro miembro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void add(Miembro miembro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
