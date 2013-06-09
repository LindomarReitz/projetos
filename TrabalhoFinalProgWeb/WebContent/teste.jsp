<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.io.File"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="org.apache.commons.fileupload.FileUpload"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.DiskFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<%  
   boolean isMultipart = FileUpload.isMultipartContent(request);  
   if (isMultipart) {  
      // Create a new file upload handler  
      DiskFileUpload upload = new DiskFileUpload();  
        
      // Set upload parameters  
      upload.setSizeMax(50*1024*1024); //50Mb  
        
      // Parse the request  
      List items = upload.parseRequest(request);  
        
      Iterator it = items.iterator();  
      while (it.hasNext()) {  
         FileItem fitem = (FileItem) it.next();  
       
%>
		 <% 
		 	StringBuffer buffer = new StringBuffer();
         	buffer.append("c:/temp/");
        	buffer.append(fitem.getName());
        	File file = new File(buffer.toString());
         	fitem.write(file);
         	response.sendRedirect("sobre.jsp");
		 %>
	<%= fitem.getName() %> - <%= fitem.getSize() %> bytes  
<%  
         }   
   }  
%>  
</body>
</html>