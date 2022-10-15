package injectingcollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private List<String> empList;
	private Set<String> empSet;
	private Map<String, String> empMap;
	private Properties empProps;

	public List<String> getEmpList() {
		return empList;
	}

	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}

	public Set<String> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<String> empSet) {
		this.empSet = empSet;
	}

	public Map<String, String> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<String, String> empMap) {
		this.empMap = empMap;
	}

	public Properties getEmpProps() {
		return empProps;
	}

	@Override
	public String toString() {
		return "Employee [empList=" + empList + ", empSet=" + empSet + ", empMap=" + empMap + ", empProps=" + empProps
				+ "]";
	}

	public void setEmpProps(Properties empProps) {
		this.empProps = empProps;
	}

}
