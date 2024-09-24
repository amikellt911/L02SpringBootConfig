package cn.edu.zucc;

 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 
 
@Component
public class ConfigurationPropertiesBeanValue {
    @Value("${demo-value.string}")
    private String sValue;
    @Value("${demo-value.int}")
    private int nValue;

    @Override
    public String toString() {
        return "ConfigurationPropertiesBeanValue{" +
                "sValue='" + sValue + '\'' +
                ", nValue=" + nValue +
                '}';
    }
    
}
