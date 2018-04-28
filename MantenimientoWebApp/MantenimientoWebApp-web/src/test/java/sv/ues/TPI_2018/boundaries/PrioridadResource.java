/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.boundaries;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.PrioridadFacadeLocal;
import sv.ues.TPI_2018.entities.Prioridad;

/**
 *
 * @author joker
 */
@Path("prioridad")
public class PrioridadResource extends AbstractResource<Prioridad> implements FindByName<Prioridad>{
    
    @EJB
    private PrioridadFacadeLocal pfl;

    @Override
    protected AbstractInterface<Prioridad> getFacade() {
        return pfl;
    }

    @Override
    protected Prioridad crearNuevo() {
        return new Prioridad();
    }

    @Override
    public AbstractInterface<Prioridad> getFacadeName() {
        return pfl;
    }
    
    
}
