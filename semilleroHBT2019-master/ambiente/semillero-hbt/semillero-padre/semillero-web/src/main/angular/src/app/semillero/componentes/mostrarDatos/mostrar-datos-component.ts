import { Component, OnInit } from '@angular/core';


/**
 * @description La clase MostrarDatosComponent Presenta el nombre y ciudad 
 * @author Yohan Sebastian Narvaez Martinez <ingen.yohan@gmail.com>
 */

@Component({
    selector: 'mostrar-datos',
    templateUrl: './mostrar-datos-component.html'
})
export class MostrarDatosComponent implements OnInit{

    
    /**
     * Atributo que contiene nombre de la persona
     */
    public nombre:string = "Yohan Sebastian Narvaez Martinez";
    
    /**
     * Atributo que contiene la ciduad de la persona
     */    
    public ciudad:string = "Cerete";

    /**
     * Atributo que contiene resultado de concatenacion
     */
    public datos:string = this.nombre  + " - " + this.ciudad;

    /**
    * @description Constructor de la clase MostrarDatosComponent 
    * @author Yohan Sebastian Narvaez Martinez <ingen.yohan@gmail.com>
    */

    constructor(){

    }
    
    ngOnInit(): void {

        /**
         * Mensaje de Consola
         */
        console.log("Llamado a MostrarDatosComponent")
    }

}