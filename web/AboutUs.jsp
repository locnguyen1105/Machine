<%-- 
    Document   : AboutUs
    Created on : Mar 8, 2020, 10:21:46 AM
    Author     : taro.noo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<!-- saved from url=(0048)http://us-123-machinery.simplesite.com/423587166 -->
<html lang="en-US" class="">
    <title>About Our Company</title>
    <body data-pid="423587166" data-iid="">
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
                                            <h3>About Our Company</h3>
                                        </div>

                                        <div class="content">
                                            <div class="img-simple span6 pull-right">
                                                <div class="image">
                                                    <a rel="nofollow" data-ss="imagemodal" data-href="./Images/${company.img}"><img src="./Images/${company.img}"></a>
                                                </div>
                                            </div>
                                                    <div class="country"> <p><span>${company.description}</span></p> </div>    </div>
                                    </div>
                                </div>


                            </div>
                        </div>
                        <%@include file="Footer.jsp" %>
                    </div>
                    </body>
                    </html>