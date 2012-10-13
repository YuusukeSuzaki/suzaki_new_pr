package jo.co.sobal.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.Required;

@Component(instance = InstanceType.SESSION)
public class SendForm implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** 名前 */
	@Required
	public String name;

	/** 住所 */
	@Required
	public String address;
}
