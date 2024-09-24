package cn.edu.zucc;

 
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "demo")
public class ConfigurationPropertiesBean {
    private String sValue;
    private int nValue;

    public String getsValue() {
		return sValue;
	}

	public void setsValue(String sValue) {
		this.sValue = sValue;
	}

	public int getnValue() {
		return nValue;
	}

	public void setnValue(int nValue) {
		this.nValue = nValue;
	}

	@Override
    public String toString() {
        return "ConfigurationPropertiesBean{" +
                "sValue='" + sValue + '\'' +
                ", nValue=" + nValue +
                '}';
    }
}
