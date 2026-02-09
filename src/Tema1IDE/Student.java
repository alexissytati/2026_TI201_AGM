/*
 * 2026 ITESS-TICs
*Periodo:Enero-Junio
*Asignatura:Programacion Orientada a Objetos
*Docente: Alexis Garcia Montero
*Descripcion: Tema 1.- Entorno de desarrollo
                  Proceso de desarrollo de aplicaciones.
                     
*                                    
*Programador: Alexis Garcia Montero
*Fecha:06/02/2026
 */
package Tema1IDE;

/**
 * 
 */
public class Student {
    
        private String controlNumber;
        private String name;
        private String career;
        private String gender;
           public Student() {


       }


       public String getControlNumber() {
           return controlNumber;
       }

       public String getName() {
           return name;
       }

       public String getCareer() {
           return career;
       }

       public String getGender() {
           return gender;
       }

       @Override
       public String toString() {
           return "Student{" + "controlNumber=" + controlNumber + ", name=" + name + ", career=" + career + ", gender=" + gender + '}';
       }

    

   }
