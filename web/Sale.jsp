<%-- 
    Document   : Sale
    Created on : Mar 8, 2020, 10:14:21 AM
    Author     : taro.noo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US" class="">
    <title>Machines for Sale</title>
    <body data-pid="423587159" data-iid="">
        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <%@include file="Header.jsp" %>
            <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
                <div class="container">
                    <div class="row-fluid content-inner">
                        <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                            <div class="wrapper ">
                                <div class="content">
                                    <div class="section article">
                                        <style>    .wordwrapfix {
                                                word-wrap:break-word;
                                            }
                                        </style>
                                        <div class="heading wordwrapfix">
                                            <h3>Machines for Sale</h3>
                                        </div>

                                        <div class="content">
                                            <c:forEach var="machine" items="${saleList}">
                                                <div class="section article" id="${machine.name}">
                                                <div class="img-simple span4 pull-left">
                                                    <div class="image">
                                                        <a class="fancybox" rel="group" href="./Images/${machine.img}"><img src="./Images/${machine.img}"></a>
                                                    </div>
                                                </div>
                                                <p><span style="font-size: 24px;">${machine.name}</span></p> 
                                                <p><span>${machine.description}</span></p>    
                                                </div>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%@include file="Footer.jsp" %>
                    </div>
                    </body>
                    </html>