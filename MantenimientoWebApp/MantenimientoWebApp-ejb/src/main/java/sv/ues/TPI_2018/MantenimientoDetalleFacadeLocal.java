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
public interface MantenimientoDetalleFacadeLocal {

    void create(MantenimientoDetalle mantenimientoDetalle);

    void edit(MantenimientoDetalle mantenimientoDetalle);

    void remove(MantenimientoDetalle mantenimientoDetalle);

    MantenimientoDetalle find(Object id);

    List<MantenimientoDetalle> findAll();

    List<MantenimientoDetalle> findRange(int[] range);

    int count();
    
}
