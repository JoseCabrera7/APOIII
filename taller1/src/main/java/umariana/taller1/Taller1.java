package umariana.taller1;

import Mundo.Tarea;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Taller1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Tarea> misTareas = new ArrayList<>();
        
        boolean activo = true;
        do{
            System.out.println("==MENU DE OPCIONES==");
            System.out.println("1. AGREGAR TAREAS");
            System.out.println("2. MOSTRAR TAREAS");
            System.out.println("3. TAREAS ORDENADAS");
            System.out.println("4. PROGRAMA TERMINADO");
            
            int opcion = lector.nextInt();
            switch(opcion){
                case 1:
                        System.out.println("INGRESE EL ID DE LA TAREA");
                        int Id = lector.nextInt();
                        System.out.println("INGRESE LA DESCRIPCION DE LA TAREA");
                        String Descripcion = lector.next();
                        System.out.println("INGRESE LA PRIORIDAD DE 1 - 5");
                        int Prioridad = lector.nextInt();
                        Tarea nuevaTarea = new Tarea (Id, Descripcion, Prioridad);
                        misTareas.add(nuevaTarea);
                        System.out.println("==TAREA AGREGADA CORRECTAMENTE==");
                        break;
                case 2:
                        System.out.println("==TAREAS AGREGADAS==");
                        for(Tarea t : misTareas)
                        {
                            System.out.println("ID: " + t.getId());
                            System.out.println("DESCRIPCION: " + t.getDescripcion());
                            System.out.println("PRIORIDAD: " + t.getPrioridad());
                        }
                        break;
                case 3:
                            Collections.sort(misTareas, (tarea1, tarea2) -> tarea1.getPrioridad() - tarea2.getPrioridad());
                            System.out.println("TAREAS ORDENADAS POR PRIORIDAD:");
                            for (Tarea n : misTareas) {
                            System.out.println("ID: " + n.getId());
                            System.out.println("DESCRIPCION: " + n.getDescripcion());
                            System.out.println("PRIORIDAD: " + n.getPrioridad());
                     }
                    break;
                case 4:
                        activo = false; 
                        System.out.println("PROGRAMA TERMINADO");
                        break;
                default:
                        System.out.println("OPCION INVALIDA");
            }
        }while(activo);
    }
}