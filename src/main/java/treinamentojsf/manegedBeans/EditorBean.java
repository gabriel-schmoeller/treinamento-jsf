package treinamentojsf.manegedBeans;

import javax.faces.bean.ManagedBean;

/**
 * Created by Lais Lodi on 29/08/2017.
 */
@ManagedBean(name = "editorMB")
public class EditorBean {

    private String value = "This editor is provided by PrimeFaces";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}