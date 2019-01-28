<%-- 
    Document   : delete
    Created on : 23 Jan, 2019, 3:28:03 PM
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
        
        .button{
            background-color: aqua;
            padding: 10px 15px;
            border-radius: 15px;
        }
        
        .innerDiv{
            position: absolute;
            left: 260px;
            top: 160px;
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
                    <h1>Delete Records Here</h1>
                    <h5>Enter just employee id to delete records from database</h5>
                        <form action = "delete" method = "post" >
                            <table>
                                <tr>
                                    <td>Enter employee id: </td>
                                    <td><input type = "text" name = "eid"/></td>
                                </tr>
                                <!--
                                 <tr>
                                    <td>Enter Name: </td>
                                    <td><input type = "text" name = "ename"/></td>
                                </tr>
                                
                                 <tr>
                                    <td>Enter Your Department </td>
                                    <td><input type = "text" name = "edept"/></td>
                                </tr>
                                
                                <tr>
                                    <td>Enter Your Designation: </td>
                                    <td><input type = "text" name = "edesg"></br></td>
                                </tr>
                                        
                                <tr>
                                    <td>Enter Your Salary: </td>
                                    <td><input type = "text" name = "esal"/></td>
                                </tr>
                                 
                                <tr>
                                    <td>Enter Date Of Joining: </td>
                                    <td><input type = "date" name = "jdate"/>
                                </tr>-->
                                
                                <tr>
                                    <td><input type = "submit" value = "Delete" class = "button"></td>
                                </tr>
                            </table>
                        </form>
                </div>
         </div>
    </body>
</html>

