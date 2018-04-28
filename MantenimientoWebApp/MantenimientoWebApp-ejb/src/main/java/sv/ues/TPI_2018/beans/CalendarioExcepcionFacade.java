/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.beans;

import sv.ues.TPI_2018.beans.AbstractFacade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.ues.TPI_2018.entities.CalendarioExcepcion;

/**
 *
 * @author joker
 */
@Stateless
public class CalendarioExcepcionFacade extends AbstractFacade<CalendarioExcepcion> implements CalendarioExcepcionFacadeLocal {

    @PersistenceContext(unitName = "MantPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalendarioExcepcionFacade() {
        super(CalendarioExcepcion.class);
    }




    
}
