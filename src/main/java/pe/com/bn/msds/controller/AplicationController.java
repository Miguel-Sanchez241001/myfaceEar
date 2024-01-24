package pe.com.bn.msds.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import pe.com.bn.msds.model.Persona;

@ManagedBean(name = "aplicationController")
@RequestScoped
public class AplicationController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1992418821826071947L;

	
	private final String mensahe = "mensaj 1";
	
	
	public Persona getJuan() {
		return juan;
	}


	public void setJuan(Persona juan) {
		this.juan = juan;
	}


	public String getMensahe() {
		return mensahe;
	}


	public String getSalida() {
		return salida;
	}


	private final String salida = " Salidaaaaa";
	
	private Persona juan;
	
	
	public void ShowPersona() {
		juan = new Persona("Juan",10);
	}
	
	public void updateMessagesVista(ActionEvent actionEvenet) {
		
		
		// MENSAJE EN VISTA
		FacesContext.getCurrentInstance().addMessage("Message", new FacesMessage("Buscando...","Resutlado"));
		
	}
}
