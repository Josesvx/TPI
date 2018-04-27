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
public interface ResponsableFacadeLocal {

    void create(Responsable responsable);

    void edit(Responsable responsable);

    void remove(Responsable responsable);

    Responsable find(Object id);

    List<Responsable> findAll();

    List<Responsable> findRange(int[] range);

    int count();
    
}
