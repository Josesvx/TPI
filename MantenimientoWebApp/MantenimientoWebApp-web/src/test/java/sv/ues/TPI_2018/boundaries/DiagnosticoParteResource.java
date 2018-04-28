/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.ues.TPI_2018.boundaries;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import sv.ues.TPI_2018.beans.AbstractInterface;
import sv.ues.TPI_2018.entities.DiagnosticoParte;
import sv.ues.TPI_2018.beans.DiagnosticoParteFacadeLocal;


/**
 *
 * @author joker
 */
@Path("diagnosticoparte")
public class DiagnosticoParteResource extends AbstractResource<DiagnosticoParte>{
    
    @EJB
    private DiagnosticoParteFacadeLocal dpfl;

    @Override
    protected AbstractInterface<DiagnosticoParte> getFacade() {
        return dpfl;
    }

    @Override
    protected DiagnosticoParte crearNuevo() {
        return new DiagnosticoParte();
    }
    

    
}
