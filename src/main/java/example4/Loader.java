package example4;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Loader implements InitializingBean{
	private Log log = LogFactory.getLog(Loader.class);

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("afterPropertiesSet: "+new Date());
		System.out.println("afterPropertiesSet: "+new Date());
	}

}
