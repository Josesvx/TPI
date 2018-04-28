/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author joker
 */
@javax.ws.rs.ApplicationPath("ws")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(org.netbeans.rest.application.config.CorsFilters.class);
        resources.add(sv.ues.TPI_2018.boundaries.DiagnosticoParteResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.DiagnosticoResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.EquipoDetalleResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.EquipoResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.EstadoMantenimientoDetalleResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.EstadoResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.MantenimientoDetalleResources.class);
        resources.add(sv.ues.TPI_2018.boundaries.MarcaResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.ModeloResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.OrdenTrabajoResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.ParteResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.PasoResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.PrioridadResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.ProcedimientoResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.ResponsableResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.SolicitudResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.SubTipoMantenimientoResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.TipoMantenimientoResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.TipoParteResource.class);
        resources.add(sv.ues.TPI_2018.boundaries.TipoResponsableResorce.class);
        resources.add(sv.ues.TPI_2018.boundaries.UnidadResource.class);
        resources.add(sv.ues.TPI_2018.web.exceptions.ControllerExceptionMapper.class);
        resources.add(sv.ues.TPI_2018.web.exceptions.ExceptionMapper.class);
        resources.add(sv.ues.TPI_2018.web.exceptions.NotFoundMapper.class);
    }
    
}
