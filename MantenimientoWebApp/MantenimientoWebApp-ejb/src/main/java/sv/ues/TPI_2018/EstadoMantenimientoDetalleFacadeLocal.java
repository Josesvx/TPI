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
public interface EstadoMantenimientoDetalleFacadeLocal {

    void create(EstadoMantenimientoDetalle estadoMantenimientoDetalle);

    void edit(EstadoMantenimientoDetalle estadoMantenimientoDetalle);

    void remove(EstadoMantenimientoDetalle estadoMantenimientoDetalle);

    EstadoMantenimientoDetalle find(Object id);

    List<EstadoMantenimientoDetalle> findAll();

    List<EstadoMantenimientoDetalle> findRange(int[] range);

    int count();
    
}