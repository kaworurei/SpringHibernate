<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/9
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="//v3.bootcss.com/examples/signin/signin.css" rel="stylesheet">
    <script src="../js/jquery-1.9.1.min.js"></script>
    <script src="../js/bootstrap.js"></script>


</head>
<body>
    <ul class="nav nav-tabs">
        <li role="presentation"><a href="javascript:void(0)">Home</a></li>
        <li role="presentation" class="active"><a href="javascript:void(0)">Profile</a></li>
        <li role="presentation"><a href="javascript:void(0)">Messages</a></li>
    </ul>
    <div class="row">
        <div class="col-lg-6">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Search for...">
                  <span class="input-group-btn">
                    <button class="btn btn-default" type="submit">Go!</button>
                  </span>
            </div><!-- /input-group -->
        </div><!-- /.col-lg-6 -->
    </div><!-- /.row -->
    <input type="text" id="liselect">
    <script>
        $('.nav.nav-tabs li a').click(function(){
            $('.nav.nav-tabs li').removeClass("active");
            $(this).parent().addClass("active");
            $("#liselect").val($(this).text());
        });
    </script>
</body>
</html>
