/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.EquipoDetalleFacadeLocal;
import sv.ues.TPI_2018.entities.EquipoDetalle;

/**
 *
 * @author joker
 */
@Path("equipodetalle")
public class EquipoDetalleResource extends AbstractResource<EquipoDetalle>{
    
    @EJB
    private EquipoDetalleFacadeLocal edfl;

    @Override
    protected AbstractInterface<EquipoDetalle> getFacade() {
        return edfl;
    }

    @Override
    protected EquipoDetalle crearNuevo() {
        return new EquipoDetalle();
    }
    
 
    
}
