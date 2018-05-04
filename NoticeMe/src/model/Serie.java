package model;

public class Serie {
    private int id;
    private String nombre;
    private int dia_capitulo;
    private boolean en_emision;

    public Serie() {
    }

    public Serie(int id, String nombre, int dia_capitulo, boolean en_emision) {
        this.id = id;
        this.nombre = nombre;
        this.dia_capitulo = dia_capitulo;
        this.en_emision = en_emision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia_capitulo() {
        return dia_capitulo;
    }

    public void setDia_capitulo(int dia_capitulo) {
        this.dia_capitulo = dia_capitulo;
    }

    public boolean isEn_emision() {
        return en_emision;
    }

    public void setEn_emision(boolean en_emision) {
        this.en_emision = en_emision;
    }
    
    
}
