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
import model.Company;
import model.Display;
import model.Machine;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author taro.noo
 */
public class HomeAction extends ActionSupport implements SessionAware {

    private Map session;

    public HomeAction() {
    }

    public String execute() throws Exception {
        Display display = Display.getDisplay();
        ArrayList<Machine> machine = Machine.getMachine();
        Company company = Company.getInfo();
        session.put("display", display);
        session.put("machineList", machine);
        session.put("company", company);
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
