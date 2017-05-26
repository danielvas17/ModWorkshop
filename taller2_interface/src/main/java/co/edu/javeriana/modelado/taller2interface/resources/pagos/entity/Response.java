/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.modelado.taller2interface.resources.pagos.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
    private int status;
    private String response;

    public Response(int status, String response) {
        this.status = status;
        this.response = response;
    }

    public int getStatus() {
        return status;
    }

    public String getResponse() {
        return response;
    }
    
    
}
