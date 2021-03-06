package bModel;

import java.util.ArrayList;

import businessModel.Dao.DAOFactory;
import businessModel.Dao.DAOPartPolitico;
import businessModel.Dao.DAOTipoProceso;
import models.PartidoPolitico;
import models.TipoProceso;

public class TipoProcDB {
	DAOFactory daoFactory = DAOFactory.getDAOFactory();
    DAOTipoProceso daoTProc = daoFactory.getDAOTProceso(); // POLIMORFISMO
    
    public void add(TipoProceso tp) {
    	daoTProc.add(tp);
    }
    
    public ArrayList<TipoProceso> queryAllTProc(){
    	return daoTProc.queryAllTProc();
    }
    
    public void updateTProc(TipoProceso tp){
    	daoTProc.updateTProc(tp);
    }
    
    public boolean deleteTProc(int id){
    	return daoTProc.deleteTProc(id);
    }
    
    public TipoProceso queryTPById(int id){
    	return daoTProc.queryTPById(id);
    }
}
