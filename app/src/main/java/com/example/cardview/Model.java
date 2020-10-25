package com.example.cardview;

public class Model {

    private int Image;
    private String nombre;
    private String apellidos;
    private int descripcion;

    public Model(int image, String nombre, String apellidos, int descripcion) {
        Image = image;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.descripcion = descripcion;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }
}
