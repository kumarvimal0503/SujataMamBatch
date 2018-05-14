package com.demo.taghandler;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport{
	

		@Override
		public int doStartTag() {
			
			JspWriter out = pageContext.getOut();
			try {
				out.println(Calendar.getInstance().getTime());
			} catch (IOException e) {
				e.printStackTrace();
			}
			return SKIP_BODY;
		}
		

}
