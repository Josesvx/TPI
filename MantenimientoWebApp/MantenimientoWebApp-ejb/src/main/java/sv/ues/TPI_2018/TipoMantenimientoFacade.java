/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author joker
 */
@Stateless
public class TipoMantenimientoFacade extends AbstractFacade<TipoMantenimiento> implements TipoMantenimientoFacadeLocal {

    @PersistenceContext(unitName = "MantPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoMantenimientoFacade() {
        super(TipoMantenimiento.class);
    }
    
}
