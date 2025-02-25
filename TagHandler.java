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
public class TagHandler extends TagSupport
{

    @Override
    public int doStartTag() throws JspException {
        
        try{
            //tssk....: tag
            JspWriter out=pageContext.getOut();
            out.println("<h1>This is my custom tag from tagHandler </h1>");
            out.println("<p>This is custom paragraph</p>");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return SKIP_BODY;
    }
    
}
