/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.entities.Diagnostico;
import sv.ues.TPI_2018.beans.DiagnosticoFacadeLocal;

/**
 *
 * @author joker
 */
@Path("diagnostico")
public class DiagnosticoResource extends AbstractResource<Diagnostico> implements FindByName<Diagnostico>{
    @EJB
    private DiagnosticoFacadeLocal dfl;
   
    @Override
    protected AbstractInterface<Diagnostico> getFacade() {
        return dfl;
    }

    @Override
    protected Diagnostico crearNuevo() {
        return new Diagnostico();
    }

    @Override
    public AbstractInterface<Diagnostico> getFacadeName() {
        return dfl;
    }

}    

