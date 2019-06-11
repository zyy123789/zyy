<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/index3.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
function page(cpage){
	$("[name='cpage']").val(cpage);
	$("form").submit();
}
/* function o(){
	$("[name='oo']").val("asc");
	$("form").submit();
} */
function qx(){
	$("[name='mids']").attr("checked",$(":checkbox:first").prop("checked"));
}
function fx(){
	$("[name='mids']").each(function(){
		$(this).prop("checked",!$(this).prop("checked"));
	})
}
function plsc(){
	var mids = "";
	$("[name='mids']:checked").each(function(){
		mids += ","+$(this).val();
	})
	mids = mids.substring(1);
	$.post("delete.do",{mids:mids},function(i){
		if (i>0) {
			alert("删除成功");
			location = "list.do";
		} else {
			alert("删除失败");
		}
	},"json");
}
</script>
</head>
<body>
<form action="list.do" method="post">
	<input type="hidden" name="cpage">
	<%-- <input type="hidden" name="oo" value="${map.oo }"> --%>
	影片名:<input type="text" name="mname" value="${map.mname }">
	导演:<input type="text" name="name" value="${map.name }"><br>
	年代:<input type="text" name="year" value="${map.year }"><br>
	上映时间:<input type="text" name="t1" value="${map.t1 }">--<input type="text" name="t2" value="${map.t2 }"><br>
	价格:<input type="text" name="p1" value="${map.p1 }">--<input type="text" name="p2" value="${map.p2 }"><br>
	<input type="submit" value="查询 ">
</form>
<input type="button" value="批量删除" onclick="plsc()">
<table>
	<tr>
		<td>
			<input type="checkbox" onclick="qx()">全选/全不选
			<input type="checkbox" onclick="fx()">反选
		</td>
		<td>影片名</td>
		<td>导演</td>
		<td>票价</td>
		<td onclick="o()">上映时间</td>
		<td>时长</td>
		<td>类型</td>
		<td>年代</td>
		<td>区域</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list }" var="m">
	<tr>
		<td>
			<input type="checkbox" value="${m.mid }" name="mids">
		</td>
		<td>${m.mname }</td>
		<td>${m.name }</td>
		<td>${m.price }</td>
		<td>${m.mtime }</td>
		<td>${m.longtime }</td>
		<td>${m.mtype }</td>
		<td>${m.year }</td>
		<td>${m.addr }</td>
		<td>${m.sta }</td>
		<td>
			<c:if test="${m.sid==1 }">
				<input type="button" value="下架" onclick="location='down.do?mid=${m.mid}'">
			</c:if>
			<c:if test="${m.sid==2 }">
				<input type="button" value="上架" onclick="location='up.do?mid=${m.mid}'">
			</c:if>
			<c:if test="${m.sid==3 }">
				<input type="button" value="上架" onclick="location='up.do?mid=${m.mid}'">
			</c:if>
		</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="11">
			<input type="button" value="首页" onclick="page('1')">
			<input type="button" value="上一页" onclick="page('${page.prePage==0?1:page.prePage}')">
			<input type="button" value="下一页" onclick="page('${page.nextPage==0?page.lastPage:page.nextPage}')">
			<input type="button" value="尾页" onclick="page('${page.lastPage}')">
			当前第${page.pageNum }页/共${page.pages }页
		</td>
	</tr>
</table>
</body>
</html>