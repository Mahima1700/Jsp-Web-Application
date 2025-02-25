/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Remote
 */
public class printTableTag extends TagSupport {

    public void setNumber(int number) {
        this.number = number;
    }
    public int number;
    //setter
    

    @Override
    public int doStartTag() throws JspException {
        
        try{
    JspWriter out=pageContext.getOut();
        //print table:
       out.print("<br>");
        for(int i=1;i<=10;i++){
            out.println(i*number +"<br>");
            
            
        }}catch(Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
    
}
    