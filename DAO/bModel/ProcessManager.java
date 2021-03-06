package bModel;


import models.Usuario;

import java.text.ParseException;
import java.util.ArrayList;

import models.Calendario;
import models.PartidoPolitico;
import models.ProcesoElectoral;
import models.TipoProceso;

public class ProcessManager {

	private static Login log = new Login() ;
	private static PartPoliticoDB partPoliticoDB = new PartPoliticoDB();
	private static TipoProcDB tProcesoDB=new TipoProcDB();
	private static ProcesoDB procesoDB=new ProcesoDB();
	private static CalendarioDB calDB=new CalendarioDB();
	
	
	//LOGIN!
	public static boolean search (Usuario u   ) {
				return  log.chequear(  u); 
				
	};
	
	//PARTIDO POLITICOS
	public static void addPartPolitico(PartidoPolitico p)
    {
        partPoliticoDB.add(p);
    };
	
	public static ArrayList<PartidoPolitico> queryAllPartPol(){
		return partPoliticoDB.queryAllPartPol();
	};
	
	public static void updatePartPol(PartidoPolitico p){
		partPoliticoDB.updatePartPol(p);
	};
	
	public static boolean deletePartPol(int id){
		return partPoliticoDB.deletePartPol(id);
	}
	
	//TIPO DE PROCESOS
	public static void addTProc(TipoProceso tp)
    {
		tProcesoDB.add(tp);
    };
	
	public static ArrayList<TipoProceso> queryAllTProc(){
		return tProcesoDB.queryAllTProc();
	};
	
	public static void updateTProc(TipoProceso tp){
		tProcesoDB.updateTProc(tp);
	};
	
	public static boolean deleteTProc(int id){
		return tProcesoDB.deleteTProc(id);
	}
	
	public static TipoProceso queryTPById(int id){
		return tProcesoDB.queryTPById(id);
	}
	
	//PROCESO
	public static void addProc(ProcesoElectoral p)
    {
		procesoDB.add(p);
    };
	
	public static ArrayList<ProcesoElectoral> queryAllProc(){
		return procesoDB.queryAllProc();
	};
	
	public static void updateProc(ProcesoElectoral p){
		procesoDB.updateTProc(p);
	};
	
	public static boolean deleteProc(int id){
		return procesoDB.deleteTProc(id);
	}
	
	//CALENDARIO
	public static int add(Calendario c) {
		return calDB.add(c);
	}
	
	public static void updateCal(Calendario c){
		calDB.updateCal(c);
	}
	
	public static Calendario queryCalById(int id){
		return calDB.queryCalById(id);
	}
}
