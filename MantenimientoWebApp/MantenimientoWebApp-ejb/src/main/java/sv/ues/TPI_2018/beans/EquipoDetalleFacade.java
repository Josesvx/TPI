/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.beans;

import sv.ues.TPI_2018.beans.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.ues.TPI_2018.entities.EquipoDetalle;

/**
 *
 * @author joker
 */
@Stateless
public class EquipoDetalleFacade extends AbstractFacade<EquipoDetalle> implements EquipoDetalleFacadeLocal {

    @PersistenceContext(unitName = "MantPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquipoDetalleFacade() {
        super(EquipoDetalle.class);
    }
    
}
