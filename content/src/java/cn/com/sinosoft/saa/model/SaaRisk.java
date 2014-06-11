package cn.com.sinosoft.saa.model;

// Generated by Hibernate Tools 3.2.0.b9 (sinosoft version)

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * SaaRisk generated by Tools.Don't edit.
 */
@Entity
@Table(name = "saa_risk")
public class SaaRisk implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** ���� */
	private String riskCode;

	/** ������������ */
	private String riskcname;

	/** ������� */
	private String classCode;

	/** ��Ʒ�ߴ��� */
	private String businessLineCode;

	/** �Ƿ���Ч */
	private String validStatus;

	public SaaRisk() {
	}

	/**       
	 * ����
	 */
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "riskcode")
	public String getRiskCode() {
		return this.riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	/**       
	 * ������������
	 */

	@Column(name = "RISKCNAME")
	public String getRiskcname() {
		return this.riskcname;
	}

	public void setRiskcname(String riskcname) {
		this.riskcname = riskcname;
	}

	/**       
	 * �������
	 */

	@Column(name = "CLASSCODE")
	public String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	/**       
	 * ��Ʒ�ߴ���
	 */

	@Column(name = "BusinessLineCode")
	public String getBusinessLineCode() {
		return this.businessLineCode;
	}

	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}

	/**       
	 * �Ƿ���Ч
	 */

	@Column(name = "VALIDSTATUS")
	public String getValidStatus() {
		return this.validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

}