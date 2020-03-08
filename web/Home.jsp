<%-- 
    Document   : Home
    Created on : Mar 7, 2020, 9:16:52 PM
    Author     : taro.noo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US" class="">
    <title>Home</title>
    <body data-pid="423587158" data-iid="">
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
                                            <h3>${display.title}</h3>
                                        </div>

                                        <div class="content">
                                            <p><span style="font-size: 18px;"><span data-mce-mark="1">${display.content}</span></p>
                                            <div class="img-simple">
                                                <div class="image">
                                                    <img src="./Images/${display.img}"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="section">
                                        <div class="content">
                                            <ul class="thumbnails column-article-section">
                                                <c:forEach var="machine" items="${machineList}">
                                                    <li class="span4">
                                                        <div class="img-simple span12 ">
                                                            <div class="image"><a class="fancybox" rel="group" href="./Images/${machine.img}"><img src="./Images/${machine.img}"/></a>
                                                            </div>
                                                        </div>
                                                        <h4>
                                                            <a href="Sale#${machine.name}"> ${machine.name}</a>
                                                        </h4>
                                                        <p>${machine.shortdescription}</p>
                                                    </li>
                                                </c:forEach>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%@include file="Footer.jsp" %>
                        <!-- this is the Footer content -->
                    </div>
                    </body>
                    </html>