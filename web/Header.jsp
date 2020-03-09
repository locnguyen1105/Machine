<%-- 
    Document   : Header
    Created on : Mar 7, 2020, 9:19:52 PM
    Author     : taro.noo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<jsp:useBean id="company" class="model.Company" scope="session"/>
<jsp:useBean id="display" class="model.Display" scope="session"/>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="./CSS/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script type="text/javascript" async="" src="./JS/analytics.js.download"></script>
    <script async="" src="./JS/gtm.js.download"></script>
    <style type="text/css">.fancybox-margin{margin-right:17px;}</style>

    <script src="https://cdn.jsdelivr.net/npm/jquery@3.4.1/dist/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/fancyapps/fancybox@3.5.7/dist/jquery.fancybox.min.css" />
    <script src="https://cdn.jsdelivr.net/gh/fancyapps/fancybox@3.5.7/dist/jquery.fancybox.min.js"></script>
</head>
<div class="container-fluid header-wrapper " id="header"> <!-- this is the Header Wrapper -->
    <div class="container" style="background-color: darkgrey;">
        <div class="title-wrapper">
            <div class="title-wrapper-inner">
                <a rel="nofollow" class="logo " href="http://us-123-machinery.simplesite.com/">
                </a>
                <div class="title ">
                    ${company.name}
                </div>
                <div class="subtitle">
                    Welcome to ${company.name}!!!
                </div>
            </div>
        </div>  <!-- these are the titles -->
        <div class="navbar navbar-compact">
            <div class="navbar-inner">
                <div class="container">
                    <!-- .btn-navbar is used as the toggle for collapsed navbar content -->
                    <a rel="nofollow" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse" title="Toggle menu">
                        <span class="menu-name">Menu</span>
                        <span class="menu-bars">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </span>
                    </a>



                    <!-- Everything you want hidden at 940px or less, place within here -->
                    <div class="nav-collapse collapse">
                        <ul class="nav" id="topMenu" data-submenu="horizontal">
                            <li class=" active " id="home">
                                <a href="Home">Home</a>
                            </li><li class="  " id="sale">
                                <a href="Sale">Machines for Sale</a>
                            </li><li class="  " id="about">
                                <a href="Info">About Our Company</a>
                            </li><li class="  " id="contact">
                                <a href="Contact">Contact</a>
                            </li>                </ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- this is the Menu content -->
    </div>
</div>  <!-- this is the Header content -->
<script>
    $(document).ready(function () {
        var pathname = window.location.pathname;
        var current = pathname.substring(pathname.lastIndexOf("/") + 1, pathname.length);
        if (current != 'Home') {
            $('#home').removeClass('active');
            if (current == 'Sale') {
                $('#sale').addClass('active');
            } else if (current == 'Info') {
                $('#about').addClass('active');
            } else if (current == 'Contact') {
                $('#contact').addClass('active');
            }
        }
    });
</script>