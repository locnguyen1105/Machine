/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Map;
import model.Machine;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author taro.noo
 */
public class SaleAction extends ActionSupport implements SessionAware{
    
    private Map session;
    public SaleAction() {
    }
    
    public String execute() throws Exception {
        ArrayList<Machine> machine = Machine.getMachine();
        session.put("saleList", machine);
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

    public Map getSession() {
        return session;
    }

    
}
