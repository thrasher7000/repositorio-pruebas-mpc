/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.mpc.backend.model.persistence.facades;

import co.mpc.backend.model.persistence.entities.Conductor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Juank
 */
@Local
public interface ConductorFacadeLocal {

    void create(Conductor conductor);

    void edit(Conductor conductor);

    void remove(Conductor conductor);

    Conductor find(Object id);

    List<Conductor> findAll();

    List<Conductor> findRange(int[] range);

    int count();
    
}
