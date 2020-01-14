package beans;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CIRCLE_MASTER" ,catalog="test")
//@EntityListeners(AuditingEntityListener.class)
/*@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
        allowGetters = true)*/
public class CircleMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")	
    private int ID;

	@Column(name="NAME")
    @NotBlank 
    private String NAME;

	@Column(name="DESCRIPTION")
    @NotBlank
    private String DESCRIPTION;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	
	
    
    
	
}
