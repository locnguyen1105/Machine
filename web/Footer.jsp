<%-- 
    Document   : Footer
    Created on : Mar 7, 2020, 9:21:32 PM
    Author     : taro.noo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div id="right" class="span3">
    <div class="sidebar">
        <div class="wrapper share-box">
            <style>    .wordwrapfix {
                    word-wrap:break-word;
                }
            </style>
            <div class="heading wordwrapfix">
                <h4>Share this page</h4>
            </div>
            <div class="content"><span><ul>
                        <li><a id="share-facebook" href="https://www.facebook.com/sharer/sharer.php?u=http://localhost:8084/CoffeShop/#" target="blank"><i class="fa fa-facebook-square"></i><span>Share on Facebook</span></a></li>
                        <li><a id="share-twitter" href="https://twitter.com/sharer/sharer.php?u=http://localhost:8084/CoffeShop/#" target="blank"><i class="fa fa-twitter-square"></i><span>Share on Twitter</span></a></li> 
                    </ul></span></div>
        </div>
    </div>
</div>
</div>        
</div>
</div>  <!-- the controller has determined which view to be shown in the content -->

<div class="container-fluid footer-wrapper" id="footer"> <!-- this is the Footer Wrapper -->
    <div class="container">
        <div class="footer-page-counter" style="display: block;">
            <c:forEach var="n" items="${count}">
                <span class="footer-page-counter-item">${n}</span>
            </c:forEach>
        </div>
        <div id="css_simplesite_com_fallback" class="hide"></div>
    </div>
</div>
<script>
    $(document).ready(function () {
        $(".fancybox").fancybox();
    });
</script>