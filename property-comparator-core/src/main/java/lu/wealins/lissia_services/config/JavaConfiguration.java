/**
 * 
 */
package lu.wealins.lissia_services.config;

import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author xqv66
 *
 */
@Configuration
@EnableTransactionManagement
public class JavaConfiguration {

	@Value("${Credentials.Username}")
	private String username;

	@Value("${Credentials.Password}")
	private String password;

	@Bean
	Credentials credentials() {
		return new UsernamePasswordCredentials(username, password);
	}


}
