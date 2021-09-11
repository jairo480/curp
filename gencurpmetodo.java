package curp;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class gencurpmetodo {
    public gencurpmetodo(){
    }
        String nombre="";
        String apaterno="";
        String amaterno="";
        String genero="";
        String estado="";
        String curpg="";
        Integer dia=1, mes=1, año=1989;
        char a,b;
        public void getFecha(String d, String m, String a){
            dia= Integer.parseInt(d);
            mes= Integer.parseInt(m);
            año= Integer.parseInt(a);
        }
        public void getgenero(String radio){
            genero=radio;
        }
        public void getestado(String boxestado){
        estado= boxestado;
    }
        public void getnombrecompleto(String n, String a, String am){
        nombre= n.toUpperCase();
        apaterno= a.toUpperCase();
        amaterno= am.toUpperCase();
    }
           public void entidadfederativa(){
         
        //este metodo asigna las letras de la entidad federativa
        switch(estado){
             
        case "Aguascalientes":
            a='A';
            b='S';
            break;
         
        case "Baja California":
            a='B';
            b='C';
            break;
            
        case "Baja California Sur":
            a='B';
            b='S';
            
            break;

        case "Campeche":
            a='C';
            b='C';
            break;
        
        case "Coahuila de Zaragoza":
            a='C';
            b='L';
            break;
            
        case "Colima":
            a='C';
            b='M';
            break;

        case "Chiapas":
            a='C';
            b='S';
            break;

        case "Chihuahua":
            a='C';
            b='H';
            break;

        case "Distrito Federal":
            a='D';
            b='F';
            break;

        case "Durango":
            a='D';
            b='G';
            break;

        case "Guanajuato":
            a='G';
            b='T';
            break;

        case "Guerrero":
            a='G';
            b='R';
            break;

        case "Hidalgo":
            a='H';
            b='G';
            break;
            
        case "Jalisco":
            a='J';
            b='C';
            break;

        case "Estado de Mexico":
            a='M';
            b='C';
            break;

        
        case "Michoacan":
            a='M';
            b='N';
            break;

        case "Morelos":
            a='M';
            b='S';
            break;

        case "Nayarit":
            a='N';
            b='T';
            break;

        case "Nuevo Leon":
            a='N';
            b='L';
            break;

        case "Oaxaca":
            a='O';
            b='C';
            break;

        case "Puebla":
            a='P';
            b='L';
            break;
            
        case "Queretaro":
            a='Q';
            b='T';
            break;
            
        case "Quintana Roo":
            a='Q';
            b='R';
            break;

        case "San Luis Potosi":
            a='S';
            b='P';
            break;

        case "Sinaloa":
            a='S';
            b='L';
            break;

        case "Sonora":
            a='S';
            b='R';
            break;

        case "Tabasco":
            a='T';
            b='C';
            break;

        case "Tamaulipas":
            a='T';
            b='S';
            break;
        case "Tlaxcala":
            a='T';
            b='L';
            break;

        case "Veracruz":
            a='V';
            b='Z';
            break;
        
        case "Yucatan":
            a='Y';
            b='N';
            break;
                 
        case "Zacatecas":    
            a='Z';
            b='S';
            break;         
         }  
           }
         public void curpgenn(){
        char c1 = apaterno.charAt(0);
        char c2 = 0;
        for (int i = 1; i < apaterno.length(); i++) {
            char l = apaterno.charAt(i);
            if(l=='A'||l=='E'||l=='I'||l=='O'||l=='U'){
                c2=l;
                break;
            }
        }
        char c3= amaterno.charAt(0);
        char c4= nombre.charAt(0);
        String year= String.valueOf(año);
        char c5= year.charAt(2);
        char c6= year.charAt(3);
        String month= String.valueOf(mes);
        char c7=0;
        char c8=0;
        if (mes<10){
            c7='0';
            c8=month.charAt(0);
        }
        else{
            c7=month.charAt(0);
            c8=month.charAt(1);
        }
        String day= String.valueOf(dia);
        char c9;
        char c10;
        if(dia<10){
            c9='0';
            c10= day.charAt(0);
        }else{
            c9=day.charAt(0);
            c10=day.charAt(1);
        }
        char c11= genero.charAt(0);
        entidadfederativa();
        char c12=a;
        char c13=b;
        char c14=0;
        for (int i = 1; i < apaterno.length(); i++) {
            char l = apaterno.charAt(i);
            if(l != 'A'&& l != 'E' && l != 'I' && l!= 'O' && l != 'U'){
                c14=l;
                break;
            }
        }
        char c15=0;
        for (int i = 1; i < amaterno.length(); i++) {
            char l = amaterno.charAt(i);
            if(l != 'A'&& l != 'E' && l != 'I' && l!= 'O' && l != 'U'){
                c15=l;
                break;
            }
        }
        char c16=0;
                for (int i = 1; i < nombre.length(); i++) {
            char l = nombre.charAt(i);
            if(l != 'A'&& l != 'E' && l != 'I' && l!= 'O' && l != 'U'){
                c16=l;
                break;
            }
                }
                int numero=(int) (Math.random()*9+1);
                String n = String.valueOf(numero);
                char c17=n.charAt(0);
                int num=(int) (Math.random()*9+1);
                String n2 = String.valueOf(num);
                char c18=n2.charAt(0);
                JOptionPane.showMessageDialog(null,c1+""+c2+""+c3+""+c4+""+c5+""+c6+""+c7+""+c8+""+c9+""+c10+""+c11+""+c12+""+c13+""+c14+""+c15+""+c16+""+c17+""+c18);
         }
}
                