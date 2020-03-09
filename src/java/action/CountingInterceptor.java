/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;
import model.Company;
import model.Display;

/**
 *
 * @author taro.noo
 */
public class CountingInterceptor extends AbstractInterceptor {

    public CountingInterceptor() {
    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> session = ActionContext.getContext().getSession();
        int count = Display.getDisplay().getCount();
        count++;
        session.put("count", Display.toArray(count));
        Display.updateCount(count);
        return actionInvocation.invoke();
    }
}
