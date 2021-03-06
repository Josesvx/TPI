/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.SolicitudFacadeLocal;
import sv.ues.TPI_2018.entities.Solicitud;

/**
 *
 * @author joker
 */
@Path("solicitud")
public class SolicitudResource extends AbstractResource<Solicitud>{
    
    @EJB
    private SolicitudFacadeLocal sfl;

    @Override
    protected AbstractInterface<Solicitud> getFacade() {
        return sfl;
    }

    @Override
    protected Solicitud crearNuevo() {
        return new Solicitud();
    }
    
    
}
