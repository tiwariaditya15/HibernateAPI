<%-- 
    Document   : successful
    Created on : 23 Jan, 2019, 6:12:01 PM
    Author     : WorkSpace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <link rel = "stylesheet" type = "text/css" href = "pages.css">
    <style>  
        
        th, td{
            padding: 10px;
        }
        .outerDiv{
                    position: absolute;
                    background-color: bisque;
                    width: 55%;
                    height: 98%;
                    left: 300px;
                    border-radius: 15px;
                   
	}
        
        .innerDiv{
            position: absolute;
            left: 260px;
            top: 160px;
        }
        
        .button{
            background-color: aqua;
            padding: 10px 15px;
            border-radius: 15px;
        }
    </style>    
  </head>
    <body>
        <div class = "outerDiv">
            <table>
                <tr>
                    <td><a href = "index.jsp">Add Records</a></td>
                    <td><a href = "delete.jsp">Delete Records</a></td> 
                    <td><a href = "update.jsp">Update Records</a></td>
                </tr>
            </table>
                <div class = "innerDiv">
                        <h1>Operation Successfull....</h1>
                </div>
         </div>
    </body>
</html>
