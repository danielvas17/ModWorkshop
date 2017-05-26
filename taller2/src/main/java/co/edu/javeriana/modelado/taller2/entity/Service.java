/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.modelado.taller2.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Service {
    private int code;
    private String url;
    private int port;
    private String endpoint;

    public Service(int code, String url, int port, String endpoint) {
        this.code = code;
        this.url = url;
        this.port = port;
        this.endpoint = endpoint;
    }

    public int getCode() {
        return code;
    }

    public String getUrl() {
        return url;
    }

    public int getPort() {
        return port;
    }

    public String getEndpoint() {
        return endpoint;
    }
    
    
}
