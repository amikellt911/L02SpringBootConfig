package cn.edu.zucc;

 
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zucc
 * @version 1.0
 * @date 2021/03/14 10:20
 */
 
@Configuration
@EnableConfigurationProperties(ZuccConfig.class)
@PropertySource("classpath:zucc.properties")
@ConfigurationProperties(prefix ="zucc")
public class ZuccConfig {
    private int year;

    @Bean
    public OurSchool ourSchool(){
        if(year < 2020){
            return new OurSchool("浙江大学城市学院"+year);
        } else {
            return new OurSchool("浙大城市学院"+year);
        }
    }

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
}
