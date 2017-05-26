/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.modelado.taller2interface.resources.pagos.services;

import co.edu.javeriana.modelado.taller2interface.resources.pagos.entity.Service;
import javax.ejb.Local;

@Local
public interface RoutingSessionBeanLocal {
    
    public Service getService(int serviceId);
    
}
