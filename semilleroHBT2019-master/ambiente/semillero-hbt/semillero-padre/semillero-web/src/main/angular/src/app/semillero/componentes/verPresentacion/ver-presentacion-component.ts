import { Component, OnInit } from '@angular/core';


/**
 * @description La clase VerPresentacionComponent Presenta el nombre y ciudad 
 * @author Yohan Sebastian Narvaez Martinez <ingen.yohan@gmail.com>
 */

@Component({
    selector: 'ver-presentacion',
    templateUrl: './ver-presentacion-component.html'
})
export class VerPresentacionComponent implements OnInit{

    /**
    * @description Constructor de la clase VerPresentacionComponent 
    * @author Yohan Sebastian Narvaez Martinez <ingen.yohan@gmail.com>
    */

    constructor(){

    }
    
    ngOnInit(): void {

        /**
         * Mensaje de Consola
         */
        console.log("Llamado a VerPresentacionComponent")
    }

}