/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.EstadoMantenimientoDetalleFacadeLocal;
import sv.ues.TPI_2018.entities.EstadoMantenimientoDetalle;
import sv.ues.TPI_2018.beans.AbstractInterface;

/**
 *
 * @author joker
 */
@Path("estadomantenimientodetalle")
public class EstadoMantenimientoDetalleResource extends AbstractResource<EstadoMantenimientoDetalle>{
    
    @EJB
    private EstadoMantenimientoDetalleFacadeLocal emdfl;
    

    @Override
    protected AbstractInterface<EstadoMantenimientoDetalle> getFacade() {
        return emdfl;
    }

    @Override
    protected EstadoMantenimientoDetalle crearNuevo() {
        return new EstadoMantenimientoDetalle();
    }
    
    
}
