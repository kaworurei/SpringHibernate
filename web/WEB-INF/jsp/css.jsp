<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/19
  Time: 14:03
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

    <style>
        [class*="col-"] {
            padding-top: 15px;
            padding-bottom: 15px;
            background-color: #eee;
            background-color: rgba(86,61,124,.15);
            border: 1px solid #ddd;
            border: 1px solid rgba(86,61,124,.2);
        }
    </style>
</head>
<body>
    <%--container-fluid--%>
    <div class="container">
        <div class="row show-grid">
            <div class="row">
                <div class="col-xs-12 col-md-4">.col-md-2</div>
                <div class="col-xs-6 col-md-4">.col-md-1</div>
                <div class="col-xs-6 col-md-4">.col-md-3</div>
            </div>
            <p></p>
            <div class="row">
                <div class="col-xs-12 col-md-6">.col-xs-12 .col-md-8</div>
                <div class="col-xs-6 col-md-3">.col-xs-6 .col-md-4</div>
                <div class="col-xs-6 col-md-3">.col-xs-6 .col-md-4</div>
            </div>
            <p></p>
            <div class="row">
                <div class="col-xs-12">.col-sm-4</div>
                <div class="col-xs-8">.col-sm-4</div>
                <div class="col-xs-4">.col-sm-4</div>
            </div>
            <p></p>
            <div class="row">
                <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
                <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
                <!-- Add the extra clearfix for only the required viewport -->
                <div class="clearfix visible-xs-block"></div>

                <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
                <div class="col-xs-6 col-sm-3">.col-xs-6 .col-sm-3</div>
            </div>


        </div>
        <address>
            <strong>Twitter, Inc.</strong><br>
            <s>795 Folsom Ave, Suite 600</s><br>
            San Francisco, CA 94107<br>
            <abbr title="Phone">P:</abbr> (123) 456-7890
        </address>

        <address>
            <strong>Full Name</strong><br>
            <a href="mailto:#">first.last@example.com</a>
        </address>

        <%--<blockquote class="blockquote-reverse">--%>
        <blockquote>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
            <footer>Someone famous in <cite title="Source Title">Source Title</cite></footer>
        </blockquote>
        <p></p>

        <div class="table-responsive">
            <table class="table">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                </tr>
                </tbody>
            </table>
        </div><!-- /.table-responsive -->

        <div class="table-responsive">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                    <th>Table heading</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                    <td>Table cell</td>
                </tr>
                </tbody>
            </table>
        </div><!-- /.table-responsive -->
    </div>
</body>
</html>
