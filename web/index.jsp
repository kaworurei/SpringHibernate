<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/6
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="//v3.bootcss.com/examples/signin/signin.css" rel="stylesheet">
    <script src="js/jquery-1.9.1.min.js"></script>
  </head>

  <body>
    <div class="container">

      <form class="form-signin" action="main/login" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" name="inputEmail" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="inputPassword"  id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input  name="checkbox" type="checkbox" value="remember-me"> Remember me
          </label>
          <input type="hidden" name="checkbox"/>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->
  </body>
</html>
