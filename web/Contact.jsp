<%-- 
    Document   : Contact
    Created on : Mar 8, 2020, 10:19:23 AM
    Author     : taro.noo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US" class="">
    <title>Contact</title>
    <body data-pid="423587167" data-iid="">
        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <%@include file="Header.jsp" %>
            <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
                <div class="container">
                    <div class="row-fluid content-inner">
                        <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                            <div class="wrapper contact">
                                <div class="heading">
                                    <h1 class="page-title">Contact</h1>
                                </div>

                                <div class="content">
                                    <div class="section">
                                        <div class="content">
                                            <div class="span12 contact-text">
                                                <h4>${company.name}</h4>
                                                <p>
                                                    Address: &nbsp; ${company.address}<br>
                                                    City: &nbsp; ${company.city}<br>
                                                    Country: &nbsp; ${company.country}
                                                </p> 
                                                <p>
                                                    Tel: &nbsp; ${company.phone}<br>
                                                    Email: &nbsp; ${company.email}
                                                </p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="section contact-form"><div class="content"><div class="alert alert-success hide">
                                                Thank you for your message.
                                            </div>
                                            <div class="alert alert-error hide">
                                                <button type="button" class="close">×</button>
                                            </div>
                                            <p>Write your message here. Fill out the form:</p>
                                            <form action="SendMail" method="post">
                                                <fieldset>
                                                    <div class="row-fluid">
                                                        <div class="span6">
                                                            <input type="text" name="subject" placeholder="Write your subject here" style="margin-bottom:11px!important">
                                                            <span class="_help-block"></span>
                                                        </div>

                                                        <div class="span6">
                                                            <input type="text" name="mail" placeholder="Write your email here" style="margin-bottom:11px!important">
                                                            <span class="_help-block"></span>
                                                        </div>
                                                    </div>
                                                    <div class="row-fluid">
                                                        <div class="span12">
                                                            <textarea id="contactFormMessageText" name="message" placeholder="Write your message here" style="margin-bottom:11px!important"></textarea>
                                                            <span class="_help-block"></span>
                                                        </div>
                                                    </div>

                                                    <div id="recaptcha" class="row-fluid"></div>  

                                                    <div class="row-fluid">
                                                        <div class="span12">
                                                            <button class="btn btn-primary pull-right" type="submit" data-default="Send - Click here" data-progress="&lt;i class=&#39;icon-spin icon-spinner&#39;&gt;&lt;/i&gt; Sending" data-error="Send - Click here" data-success="&lt;i class=&#39;icon-ok&#39;&gt;&lt;/i&gt; Sent">Send - Click here
                                                            </button>
                                                        </div>
                                                    </div>
                                                </fieldset>
                                            </form>
                                            <script type="text/javascript">

                                                $('#contactFormMessageText').blur(function () {
                                                    var text = $('#contactFormMessageText').val().trim();
                                                    $('#contactFormMessageText').val(text);
                                                });

                                            </script></div></div>
                                </div>


                            </div>
                        </div>
                        <%@include file="Footer.jsp" %>
                    </div>
                    </body>
                    </html>