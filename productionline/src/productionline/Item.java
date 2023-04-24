package productionline;

import java.util.Date;

public interface Item {
	public final String MANUFACTURER = "OracleProduction";
	public void setProductionNumber(int val);
	public void setName(String name);
	public String getName();
	public Date getManufactureDate();
	public int getSerialNumber();
}
