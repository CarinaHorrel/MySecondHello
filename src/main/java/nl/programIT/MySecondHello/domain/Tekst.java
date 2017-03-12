package nl.programIT.MySecondHello.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tekst {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 

	private long id;
	private String tekst;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the tekst
	 */
	public String getTekst() {
		return tekst;
	}
	/**
	 * @param tekst the tekst to set
	 */
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	
}
