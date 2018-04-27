/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author joker
 */
@Local
public interface OrdenTrabajoFacadeLocal {

    void create(OrdenTrabajo ordenTrabajo);

    void edit(OrdenTrabajo ordenTrabajo);

    void remove(OrdenTrabajo ordenTrabajo);

    OrdenTrabajo find(Object id);

    List<OrdenTrabajo> findAll();

    List<OrdenTrabajo> findRange(int[] range);

    int count();
    
}
