/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooii;
import javax.swing.JOptionPane;
/**
 *Crear un programa en java en el cual se pida al usuario ingresar su nombre, 
 * apellido, edad, hobbie, editor de código preferido, sistema operativo que 
 * utiliza, luego deberá mostrarse por consola los datos ingresados.
 * @author Andres
 */
public class Usuario {
 private String nombre;
 private String apellido;
 private String edad;
 private String hobbie;
 private String editorPreferido;
 private String sistemaOperativo;
 
 public Usuario(){
     
 }
 public Usuario(String nombre, String apellido, String edad, String hobbie, String editorPreferido, String sistemaOperativo){
     this.nombre= nombre;
     this.apellido=apellido;
     this.edad=edad;
     this.hobbie=hobbie;
     this.editorPreferido=editorPreferido;
     this.sistemaOperativo=sistemaOperativo;
 }
public void obtener(){
 this.nombre = JOptionPane.showInputDialog("Ingrese su nombre");
 this.apellido= JOptionPane.showInputDialog("Ingrese su apellido");
 this.edad = JOptionPane.showInputDialog("Ingrese su edad");
 this.hobbie= JOptionPane.showInputDialog("Ingrese su hobbie");
 this.editorPreferido= JOptionPane.showInputDialog("Ingrese su editor de código preferido:");
 this.sistemaOperativo= JOptionPane.showInputDialog("Ingrese su sistema operativo:");
}

    @Override
    public String toString() {
        return "Usuario:" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", hobbie=" + hobbie + ", editorPreferido=" + editorPreferido + ", sistemaOperativo=" + sistemaOperativo;
    }






}
