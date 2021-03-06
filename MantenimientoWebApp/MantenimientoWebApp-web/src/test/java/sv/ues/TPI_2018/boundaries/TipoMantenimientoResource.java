/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.TipoMantenimientoFacadeLocal;
import sv.ues.TPI_2018.entities.TipoMantenimiento;

/**
 *
 * @author joker
 */
@Path("tipomantenimiento")
public class TipoMantenimientoResource extends AbstractResource<TipoMantenimiento> implements FindByName<TipoMantenimiento>{
    
    @EJB
    private TipoMantenimientoFacadeLocal tmfl;

    @Override
    protected AbstractInterface<TipoMantenimiento> getFacade() {
        return tmfl;
    }

    @Override
    protected TipoMantenimiento crearNuevo() {
        return new TipoMantenimiento();
    }

    @Override
    public AbstractInterface<TipoMantenimiento> getFacadeName() {
        return tmfl;
    }
    
 
}
