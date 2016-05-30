<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic CRUD Application - jQuery EasyUI CRUD Demo</title>
    <link rel="stylesheet" type="text/css" href="../../css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../css/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../css/easyui/themes/color.css">
    <script type="text/javascript" src="../../js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="../../js/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
<div data-options="region:'west',split:true,hideCollapsedContent:false,title:'菜单'" style="width:200px;">
    <div class="easyui-accordion" data-options="fit:true,border:false">
        <div title="文章管理"  style="overflow:auto;padding-top: 5px">
            <ul id="articles" name="articles" class="easyui-tree" data-options="animate:true,lines:true">
                <li><a onclick="addtab('文章浏览','articleslist')">文章浏览</a></li>
                <li><a >文章Tag</a></li>
            </ul>
        </div>
        <div title="用户管理"  style="overflow:auto;padding-top: 5px">
            <ul id="users" class="easyui-tree" data-options="animate:true,lines:true">
                <li>用户信息</li>
                <li>用户权限</li>
            </ul>
        </div>
    </div>
</div>
<div data-options="region:'center'">
    <div id="tabs" class="easyui-tabs"  fit="true" border="false"  style="width: 100%">
    </div>
</div>
<script>
    
    function addtab(title,url) {
        $(".easyui-tree").not($(this).parent(".easyui-tree")).find('.tree-node-selected').removeClass('tree-node-selected');
        if ($('#tabs').tabs('exists', title)) {
            $('#tabs').tabs('select', title);
        } else {
            var content = '<iframe frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
            $('#tabs').tabs('add', {
                title: title,
                content: content,
                closable: true
            });
        }
    }
//    $('#articles,#users').tree({
//        onClick: function(node) {
//            $(".easyui-tree").not($(this)).find('.tree-node-selected').removeClass('tree-node-selected');
//            if ($('#tabs').tabs('exists', node.text)) {
//                $('#tabs').tabs('select', node.text);
//            } else {
//                $('#tabs').tabs('add', {
//                    title: node.text,
//                    content: '<div style="padding:10px">Content' + node.text + '</div>',
//                    closable: true
//                });
//            }
//        }
//    });
</script>
</body>

</html>