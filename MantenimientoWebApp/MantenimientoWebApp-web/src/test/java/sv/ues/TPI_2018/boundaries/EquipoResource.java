/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.beans.EquipoFacadeLocal;
import sv.ues.TPI_2018.entities.Equipo;

/**
 *
 * @author joker
 */
@Path("equipo")
public class EquipoResource extends AbstractResource<Equipo>{
    
    @EJB
    private EquipoFacadeLocal efl;

    @Override
    protected AbstractInterface<Equipo> getFacade() {
        return efl;
    }

    @Override
    protected Equipo crearNuevo() {
        return new Equipo();
    }
    

    
}
