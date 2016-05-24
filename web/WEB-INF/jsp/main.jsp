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
    <link href="http://<%=request.getLocalAddr()%>:<%=request.getLocalPort()%><%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="http://cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <link href="http://<%=request.getLocalAddr()%>:<%=request.getLocalPort()%><%=request.getContextPath()%>/css/CSS.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <script src="http://<%=request.getLocalAddr()%>:<%=request.getLocalPort()%><%=request.getContextPath()%>/js/jquery-1.9.1.min.js"></script>
    <script src="http://<%=request.getLocalAddr()%>:<%=request.getLocalPort()%><%=request.getContextPath()%>/js/bootstrap.js"></script>


</head>
    <body>
    <div class="body">
        <header class="main-head" style="background-image: url(http://image.golaravel.com/5/c9/44e1c4e50d55159c65da6a41bc07e.jpg)" >
            <div class="container">
                <div class="row">
                    <div class="col-sm-12 ">
                      <h1>这是一个标题</h1>
                    </div>
                    <div class="col-sm-12 ">
                        <a class="btn btn-default btn-doc">按钮---按钮1</a>
                        <a class="btn btn-default btn-doc">按钮---按钮1</a>
                        <a class="btn btn-default btn-doc">按钮---按钮1</a>
                        <a class="btn btn-default btn-doc">按钮---按钮1</a>
                        <a class="btn btn-default btn-doc">按钮---按钮1</a>
                    </div>
                </div>
            </div>
        </header>
        <nav class="main-nav">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="navbar-header">
                            <span class="nav-toggle-button collapsed" aria-expanded="false"  data-toggle="collapse" data-target="#main-menu" >
                                <span class="sr-only">Toggle navigation</span>
                                <i class="fa fa-bars"></i>
                            </span>
                        </div>
                        <div id="main-menu" class="navbar-collapse collapse" aria-expanded="false">
                            <ul class="nav">
                                <li role="presentation"><a href="javascript:void(0)">导航1</a></li>
                                <li role="presentation"><a href="javascript:void(0)">导航1</a></li>
                                <li role="presentation"><a href="javascript:void(0)">导航1</a></li>
                                <li role="presentation"><a href="javascript:void(0)">导航1</a></li>
                                <li role="presentation"><a href="javascript:void(0)">导航1</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <main class="col-md-8">
                    <article class="article">
                        <div class="article-head">
                            <h1>
                                <a href="javascript:void(0)">这是一个标题</a>
                            </h1>
                            <div class="article-meta">
                                <span>作者：<a>张三</a></span>
                                <time>2016年4月6日</time>
                            </div>
                        </div>
                        <div class="article-media">
                            <a href="javascript:void(0)">
                                <img src="http://image.phpcomposer.com/1/6e/db5b3341b0b013db10affad656fbf.jpg">
                            </a>
                        </div>
                        <div class="article-content">
                            <p>Composer 项目刚刚宣布在其第五个生日的同一天发布了 V1.0 正式版。 以下翻译自 Composer 创始人 Jordi Boggiano 的原文： 五年前的今天，Composer 诞生了。在某些方面，这感觉就像昨天发生的事，至少它不像过去了五年。但在其他方面，好像是上辈子的事了，没有一个完整的 PHP 生</p>
                        </div>
                        <div>
                            <a class="btn btn-default btn-content" href="javascript:void(0)">阅读全文</a>
                        </div>
                        <div class="article-footer">
                            <div class="article-footer-icon">
                                <i class="fa fa-folder-open-o"></i>
                                <a href="javascript:void(0)">Tag1</a>,
                                <a href="http://www.baidu.com">TagTag2</a>
                            </div>
                        </div>
                    </article>


                    <article class="article">
                        <div class="article-head">
                            <h1>
                                <a href="javascript:void(0)">这是一个标题</a>
                            </h1>
                            <div class="article-meta">
                                <span>作者：<a>张三</a></span>
                                <time>2016年4月6日</time>
                            </div>
                        </div>
                        <div class="article-media">
                            <a href="javascript:void(0)">
                                <img src="http://image.phpcomposer.com/1/6e/db5b3341b0b013db10affad656fbf.jpg">
                            </a>
                        </div>
                        <div class="article-content">
                            <p>Composer 项目刚刚宣布在其第五个生日的同一天发布了 V1.0 正式版。 以下翻译自 Composer 创始人 Jordi Boggiano 的原文： 五年前的今天，Composer 诞生了。在某些方面，这感觉就像昨天发生的事，至少它不像过去了五年。但在其他方面，好像是上辈子的事了，没有一个完整的 PHP 生</p>
                        </div>
                        <div>
                            <a class="btn btn-default btn-content" href="javascript:void(0)">阅读全文</a>
                        </div>
                    </article>

                </main>
                <div class="col-md-4">
                    <div class="widget">
                        <h4 class="title">标签</h4>
                        <div class="tag-cloud">
                            <a href="javascript:void(0)">标签1</a>
                            <a href="javascript:void(0)">标签1biao1</a>
                            <a href="javascript:void(0)">来个长点的</a>
                            <a href="javascript:void(0)">短</a>
                            <a href="javascript:void(0)">还没到第二排？</a>
                            <a href="javascript:void(0)">继续继续</a>
                            <a href="javascript:void(0)">加油</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>
