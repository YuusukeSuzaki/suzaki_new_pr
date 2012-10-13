/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jo.co.sobal.action;

import java.io.IOException;

import javax.annotation.Resource;

import jo.co.sobal.dto.SendDto;
import jo.co.sobal.form.SendForm;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.ConnectionInfo;
import ch.ethz.ssh2.SCPClient;

public class SendAction {

	@Resource
	@ActionForm
	protected SendForm sendForm;

	@Resource
	protected SendDto sendDto;

    @Execute(validator = false)
	public String index() {
        return "index.jsp";
	}

    @Execute(validator = false)
    public String confirm() throws IOException{

    	Connection connection = new Connection("192.168.163.128");
    	ConnectionInfo info = connection.connect();
    	boolean result = connection.authenticateWithPassword("root", "tanyao");

    	if(result){
    		SCPClient scpClient = connection.createSCPClient();
    		scpClient.put("C:\\pleiades\\test.txt", "/root/test/");
    	}

    	if(null != connection){
    		connection.close();
    	}

    	return "confirm.jsp";
    }

    @Execute(validator = false)
    public String complete() {



    	return "complete.jsp";
    }
}
