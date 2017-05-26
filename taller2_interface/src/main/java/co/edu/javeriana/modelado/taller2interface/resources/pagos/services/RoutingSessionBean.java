/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.modelado.taller2interface.resources.pagos.services;

import co.edu.javeriana.modelado.taller2interface.resources.pagos.entity.Service;
import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Stateless
public class RoutingSessionBean implements RoutingSessionBeanLocal {

    private Client client;
    private WebTarget target;
    private static final String BASE_URI = "http://localhost:9990/servicios/enrutador";

    @Override
    public Service getService(int serviceId) {
        client = ClientBuilder.newClient();
        target = client.target(BASE_URI).path(Integer.toString(serviceId));

        return target.request(MediaType.APPLICATION_JSON).get(Service.class);
    }
}
