<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>  
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
		<meta charset="UTF-8">
		<title>Lottery</title>
	</head>
	<body style="padding: 15px">
		<form class="pure-form" method="post" action="./add">
			<fieldset>
				<button type="submit" class="pure-button pure-button-primary">
					電腦選號
				</button>
			</fieldset>
		</form>
		<p />
		<!-- 
			統計每個號碼出現的次數
			範例：9(7),8(5),31(3)...
		 -->
		<form class="pure-form" method="post" action="./statTotalAppear">
			<fieldset>
				<button type="submit" class="pure-button pure-button-primary">
					統計每個號碼出現的次數
				</button>
			</fieldset>
		</form>
		<!-- 打印結果，順序按照出現次數由大到小 -->
		<table class="pure-table pure-table-bordered">
			<tbody>
				<c:forEach varStatus="status" var="stat" items="${ statTotalAppearMap }">
					<c:choose>
						<c:when test="${ status.index % 10 == 0 }">
							<tr><td>${ stat }<td>
						</c:when>
						<c:when test="${ (status.index + 1) % 10 == 0 }">
							<td>${ stat }<td><tr>
						</c:when>
						<c:otherwise>
							<td>${ stat }<td>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</tbody>
		</table>
		<p />
		<table class="pure-table pure-table-bordered">
			<thead>
				<tr>
					<th>Index</th><th>樂透號碼</th><th>修改</th><th>刪除</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach varStatus="status" var="lottery" items="${ lotteries }">
					<tr>
						<td>${ status.index }</td><td>${ lottery }</td>
						<td>
							<button type="button"
								onclick="window.location.href='./update/${ status.index }';"
								class="pure-button pure-button-primary">
									修改
							</button>
						</td>
						<td>
							<button type="button"
								onclick="window.location.href='./delete/${ status.index }';"
								class="pure-button pure-button-primary">
									刪除
							</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>