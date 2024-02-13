package Mundo;

public class Tarea {
    
    private int Id;
    private String Descripcion;
    private int Prioridad;

    public Tarea(int idTarea, String descricion, int proridad) { 
        this.Id = idTarea;
        this.Descripcion = descricion;
        this.Prioridad = proridad;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }
}