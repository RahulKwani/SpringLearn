<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>

<script src="js/jquery/jquery.bind.js" type="text/javascript"></script>
</head>
<body>
	<jsp:include page="Menu.jsp" />
	<div id="content-outer">
		<div id="content">

			<!--  start page-heading -->
			<div id="page-heading">
				<h1>Add product</h1>
			</div>
			<!-- end page-heading -->

			<table id="content-table">
				<tr>
					<th rowspan="3" class="sized"><img
						src="images/shared/side_shadowleft.jpg" width="20" height="300"
						alt="" /></th>
					<th class="topleft"></th>
					<td id="tbl-border-top">&nbsp;</td>
					<th class="topright"></th>
					<th rowspan="3" class="sized"><img
						src="images/shared/side_shadowright.jpg" width="20" height="300"
						alt="" /></th>
				</tr>
				<tr>
					<td id="tbl-border-left"></td>
					<td>
						<!--  start content-table-inner ...................................................................... START -->
						<div id="content-table-inner">

							<!--  start table-content  -->
							<div id="table-content">
								<!--  start product-table ..................................................................................... -->
								<form id="mainform" action="">
									<table id="product-table">
										<tr>
											<th class="table-header-check"><a id="toggle-all"></a></th>
											<th class="table-header-repeat line-left minwidth-1"><a
												href="">User Name</a></th>
											<th class="table-header-repeat line-left minwidth-1"><a
												href="">Password</a></th>
											<th class="table-header-repeat line-left"><a href="">Mobile
													Number</a></th>
											<th class="table-header-repeat line-left"><a href="">Gender</a></th>
											<th class="table-header-repeat line-left"><a href="">Role</a></th>
											<th class="table-header-options line-left"><a href="">Options</a></th>
										</tr>
										<c:forEach items="${userList}" var="user">
											<tr>
												<td><input type="checkbox" /></td>
												<td>${user.userName}</td>
												<td>${user.password}</td>
												<td><a href="">${user.mobileNum}</a></td>
												<td>${user.gender}</td>
												<td><a href="">${user.role}</a></td>
												<td class="options-width"><a href="" title="Edit"
													class="icon-1 info-tooltip"></a> <a href="" title="Edit"
													class="icon-2 info-tooltip"></a> <a href="" title="Edit"
													class="icon-3 info-tooltip"></a> <a href="" title="Edit"
													class="icon-4 info-tooltip"></a> <a href="" title="Edit"
													class="icon-5 info-tooltip"></a></td>
											</tr>
										</c:forEach>
									</table>
								</form>
								<div class="clear"></div>
							</div>
							<!--  start actions-box ............................................... -->
							<div id="actions-box">
								<a href="" class="action-slider"></a>
								<div id="actions-box-slider">
									<a href="" class="action-edit">Edit</a> 
									<a href="" class="action-delete">Delete</a>
								</div>
								<div class="clear"></div>
							</div>
							<!-- end actions-box........... -->

							<!--  start paging..................................................... -->
							<table id="paging-table">
								<tr>
									<td><a href="" class="page-far-left"></a> <a href=""
										class="page-left"></a>
										<div id="page-info">
											Page <strong>1</strong> / 15
										</div> <a href="" class="page-right"></a> <a href=""
										class="page-far-right"></a></td>
									<td><select class="styledselect_pages">
											<option value="">Number of rows</option>
											<option value="">1</option>
											<option value="">2</option>
											<option value="">3</option>
									</select></td>
								</tr>
							</table>
							<!--  end paging................ -->
							<div class="clear"></div>
						</div>
					</td>
					<td id="tbl-border-right"></td>
				</tr>
				<tr>
					<th class="sized bottomleft"></th>
					<td id="tbl-border-bottom">&nbsp;</td>
					<th class="sized bottomright"></th>
				</tr>
			</table>
			<div class="clear">&nbsp;</div>

		</div>
		<div class="clear">&nbsp;</div>
	</div>
</body>
</html>