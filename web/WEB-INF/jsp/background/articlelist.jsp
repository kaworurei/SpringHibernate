<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/30
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="http://cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <link href="../../css/CSS.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <script src="../../js/jquery-1.9.1.min.js"></script>
    <script src="../../js/bootstrap.js"></script>
    <link rel="stylesheet" type="text/css" href="../../css/themes/default/easyui.css">
    <script type="text/javascript" src="../../js/jquery.easyui.min.js"></script>
</head>
<body>
    <div style="padding: 10px">
        <div class="row"></div>
        <table class="table table-condensed table-hover">
            <thead>
            <tr>
                <th><input id="totalcheckbox"  type="checkbox" style="margin-bottom: 7px"></th>
                <th>标题</th>
                <th>投稿人</th>
                <th>投稿日期</th>
                <th>状态</th>
                <th><a style="color: green;font-size: 18px" onclick="SelectDisEnable(true)" href="javascript:void(0)"><span class="glyphicon glyphicon-play" aria-hidden="true"></span></a>
                    <a style="color: grey;font-size: 18px;margin-left: 5px;margin-right: 5px" onclick="SelectDisEnable(false)"  href="javascript:void(0)"><span class="glyphicon glyphicon-stop" aria-hidden="true"></span></a>
                    <a style="color: red;font-size: 18px"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></a></th>
            </tr>
            </thead>
            <tbody>
                ${tablehtml}
            </tbody>
        </table>
    </div>
</body>

    <script>
        function SelectDisEnable (enable) {
            var str="";
            var obj=$(".table.table-condensed.table-hover tbody input[type='checkbox']");
            obj.each(function () {
                if($(this).prop('checked')==true){
                    str=str+','+$(this).data('articleid')+'';
                }
            });
            if(str.length==0)
                return;
            $.ajax({
                type : 'POST',
                url:'articledisable',
                data:'id=['+str.substring(1)+']&enable='+enable,
                success:function (data) {
                    $(".table.table-condensed.table-hover tbody").html(data);
                    $("#totalcheckbox").prop("checked",false);
                },
                error:function () {
                    alert("删除失败");
                }
            });
        };

        $("#totalcheckbox").click(function(){
            if($("#totalcheckbox").prop('checked')==true){
                $(".table.table-condensed.table-hover tbody input[type='checkbox']").prop("checked",true);
            }else {
                $(".table.table-condensed.table-hover tbody input[type='checkbox']").prop("checked",false);
            }
        });
    </script>
</html>
