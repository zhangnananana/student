<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/18
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap-3.3.4.css"/>
    <script src="/js/jqPaginator.js"></script>
    <script src="/js/jquery-1.10.2.js"></script>
</head>
<body>

<div class="container">
    <table class="table">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>地址</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${studentPageInfo.list}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.sex}</td>
                <td>${s.address}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/del?id=${s.id}">删除</a>
                    <a href="${pageContext.request.contextPath}/update2?id=${s.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

<!-- 分页的导航栏 -->
<div class="pagination-layout">

    <div class="pagination">
        <ul class="pagination">

        </ul>


    </div>
</div>


</div>

<script>

    window.onload = function() {
        var if_fistime = true;
        $(".pagination")
            .jqPaginator(
                {
                    totalPages : ${pageInfo.pages},
                    visiblePages : 3,
                    currentPage : ${pageInfo.pageNum},
                    first : '<li class="first"><a href="javascript:void(0);">第一页</a></li>',
                    prev : '<li class="prev"><a href="javascript:void(0);">上一页</a></li>',
                    next : '<li class="next"><a href="javascript:void(0);">下一页</a></li>',
                    last : '<li class="last"><a href="javascript:void(0);">最后一页</a></li>',
                    page : '<li class="page"><a href="javascript:void(0);">{{page}}</a></li>',

                    onPageChange : function(num) {

                        /* alert(num); */
                        if (if_fistime) {
                            if_fistime = false;
                        } else {
                            changePage(num);
                        }

                    }

                })

    }

    function changePage(num) {

        window.location.href = "queryall?pageNum=" + num;
    }



</script>
</body>
</html>
