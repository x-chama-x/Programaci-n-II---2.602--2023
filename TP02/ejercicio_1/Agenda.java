
package ejercicio_1;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Persona> personas; // atributo privado del tipo ArrayList para almacenar la colección de personas

    //CONSTRUCTOR (sin parámetros) 
    public Agenda() {
        personas = new ArrayList<Persona>();
    }
    
    // MÉTODOS
    
    // comparar DNI si son = o !=
    private Boolean isDistintoDni(String DNI){
        for (Persona persona : personas){
            if(DNI.equals(persona.getDNI())){
                return false;
            }
        }
        return true;
    }
    
    // punto D
    public Boolean agregarPersona(Persona persona) { 
        if(isDistintoDni(persona.getDNI())== true){
            personas.add(persona);
            return true;
        }
        else{
           return false;
        }
    }    
    
    
    // punto A
    public void listarPersonas() {
        if(personas.isEmpty()){
            System.out.println("no hay personas agendadas");
        }
        else
        {
            for (Persona persona : personas) {
                System.out.println(persona);
            }            
        }
    }
    
    // punto B
    // devuelve el último objeto de la colección de personas en la agenda
    public Persona devolverUltimo(){
        return this.personas.get(personas.size()-1);
    }
    
    // punto C
    public Persona buscarPersona(String DNI){
        for(Persona persona : personas){
            if(DNI.equals(persona.getDNI())){
                return persona;
            }
        }
        return null;
    }
    
    // punto E
    public Persona removerPersona(String DNI){
        for(Persona persona : personas){
            if(DNI.equals(persona.getDNI())){
                personas.remove(persona);
                return persona;
            }
        }
        return null;
    }
    
    // punto F
    public Boolean modificarDomicilio(String DNI, Domicilio dom){
        for(Persona persona : personas){
            if(DNI.equals(persona.getDNI())){
                persona.setDomicilio(dom);
                return true;
            }
        }
        return false;
    }
    
    // punto G
    // creo una funcion que devuelva un nuevo arreglo que devuelve 
    // a las personas del mismo barrio
    public ArrayList<Persona> obtenerPorBarrio(String barrio){
        ArrayList<Persona> personasEnBarrio = new ArrayList<>();
        for(Persona persona : personas){
            if(barrio.equals(persona.getBarrio())){
                personasEnBarrio.add(persona);
            }
        }
        return personasEnBarrio;
    }
    
    // punto H
    public void vaciar(){
        while(!personas.isEmpty()){
            personas.remove(0);
        }
    }
}
