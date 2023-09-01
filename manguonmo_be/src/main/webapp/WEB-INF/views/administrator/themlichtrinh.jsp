<!-- sử dụng tiếng việt -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- import JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- import thư viện spring-form -->
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin SkyTour</title>
<jsp:include page="/WEB-INF/views/common/variables.jsp"></jsp:include>
<jsp:include page="/WEB-INF/views/administrator/layout/css.jsp"></jsp:include>
<link rel="shortcut icon"
	href="${base}/img/images/iconLogoOffStardom.png" />
<script src="https://code.jquery.com/jquery-3.5.1.min.js"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="${base}/summernote-0.8.18-dist/summernote-bs4.min.css">


</head>
<body>
	<div class="container-scroller">
		<jsp:include page="/WEB-INF/views/administrator/layout/header.jsp"></jsp:include>

		<div class="container-fluid page-body-wrapper">
			<!-- partial:../../partials/_sidebar.html -->
			<jsp:include page="/WEB-INF/views/administrator/layout/sidebar.jsp"></jsp:include>
			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row">
						<div class="col-12 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Thêm lịch trình tour</h4>
									<p class="card-description">SkyTour</p>
									<%--@elvariable id="dayTourSave" type="java"--%>
									<sf:form class="forms-sample"
										action="${base }/admin/adddaytour/saveOrUpdate"
										modelAttribute="dayTourSave" method="post">
										<div class="form-group">
											<label for="id">Id day tour</label>
											<sf:input path="id" type="text" class="form-control"
												name="id" id="id" readonly="true"></sf:input>
										</div>
 										<div class="form-group">
											<label for="productTourEntityDay">Id tour</label>
											<sf:input path="productTourEntityDay.id" type="text" class="form-control"
												name="productTourEntityDay" id="productTourEntityDay" readonly="true" value="${productTourId}"></sf:input>
										</div>
										<div class="form-group">
											<label for="dayNumber">Ngày thứ</label>
											<sf:input path="dayNumber" type="number" class="form-control" required="true"
												name="dayNumber" id="dayNumber"
												placeholder="(1, 2, 3, 4,...)" min="1" max="30"></sf:input>
										</div>
										<div class="form-group">
											<label for="dayName">Tiêu đề của ngày</label>
											<sf:input path="dayName" type="text" class="form-control" required="true"
												name="dayName" id="dayName"></sf:input>
										</div>
										<div class="form-group">
											<label for="dayContent">Nội dung lịch trong ngày</label>
											<sf:textarea path="dayContent"
												name="dayContent" id="dayContent" autocomplete="off" required="true"
												class="summernote form-control" cols="100" rows="4"></sf:textarea>
										</div>
										<button type="submit" class="btn btn-gradient-primary me-2">Thêm</button>
										<a href="${base}/admin/addproducttour/${productTourId}"
											class="btn btn-warning">Thoát</a>
										<a href="#demo" class="btn btn-behance" data-toggle="collapse"
											style="background: #ccc;">Xem chi tiết lịch trình tour</a>
									</sf:form>
								</div>
							</div>

						</div>
					</div>
					<div class="row collapse" id="demo">
						<div class="col-12 grid-margin stretch-card">
							<div class="card">
								<div class="card-body ">
									<table class="table table-hover">
										<thead>
											<tr>
												<th>STT</th>
												<th>Id day tour</th>
												<th>Id tour</th>
												<th>Ngày thứ</th>
												<th>Tiêu đề của ngày</th>
												<th>Status</th>
												<th>Tác vụ</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${dayTour}" var="dayTour"
												varStatus="loop">
												<tr>
													<th scope="row">${loop.index +1 }</th>
													<td>${dayTour.id}</td>
													<td>${dayTour.productTourEntityDay.id}</td>
													<td>${dayTour.dayNumber}</td>
													<td style="text-overflow: ellipsis; overflow: hidden; max-width: 400px;">${dayTour.dayName}</td>
													<td><span id="_dayTour_status_${dayTour.id} }"
															  style="width: 20px; height: 20px;"> <c:choose>
														<c:when test="${dayTour.status}">
															<input type="checkbox" checked="checked"
																   readonly="readonly">
														</c:when>
														<c:otherwise>
															<input type="checkbox" readonly="readonly">
														</c:otherwise>
													</c:choose>
													</span></td>
													<td><a href="${base }/admin/adddaytour/${dayTour.productTourEntityDay.id}/${dayTour.id}"
														class="btn btn-warning" id="updateCategory">Sửa</a>
														<button onclick="DeleteDay(${dayTour.id})" class="btn btn-danger" id="deleteDay">Xóa</button>
													</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->
				<footer class="footer">
					<div class="container-fluid d-flex justify-content-between">
						<span
							class="text-muted d-block text-center text-sm-start d-sm-inline-block">Bản
							quyền © thuộc Nguyễn Quang Anh</span> <span
							class="float-none float-sm-end mt-1 mt-sm-0 text-end">
							Admin<a href="https://www.facebook.com/quang.sam.777/"
							target="_blank">Xem thông tin chi tiết</a> facebook.com
						</span>
					</div>
				</footer>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->


	<!-- Jquery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
	<jsp:include page="/WEB-INF/views/administrator/layout/js.jsp"></jsp:include>


	<!-- summernote-->
	<script src="${base}/summernote-0.8.18-dist/summernote-bs4.min.js"></script>
	<!-- internal javascript -->
	<!-- 	<script type="text/javascript">
		$(document).ready(function() {
			$('#highlightTour').summernote({
				placeholder : 'Mô tả chi tiết',
				width : 500,
				height : 100, // set editor height
				minHeight : null, // set minimum height of editor
				maxHeight : null
			// set maximum height of editor				             
			});
		});
	</script> -->
	<script>
		function DeleteDay(dayTourId) {
			var data = {
				id : dayTourId,
			};
			var deleteConfirm = confirm("Bạn chắc chắn muốn xóa?");
			if (deleteConfirm == true) {
				// $ === jQuery
				// json == javascript object
				jQuery.ajax({
					url : '${base}' + "/admin/daytour/delete", //->request mapping định nghĩa bên controller
					type : "post", //-> method type của Request Mapping
					contentType : "application/json", //-> nội dung gửi lên dạng json <=> javascript object
					data : JSON.stringify(data), //-> chuyển 1 javascript object thành string json

					dataType : "json", // kiểu dữ liệu trả về từ Controller
					success : function(jsonResult) { // gọi ajax thành công
						location.reload();
					},
					error : function(jqXhr, textStatus, errorMessage) { // gọi ajax thất bại
						alert("Xóa thất bại");
					}
				});

			}
		}
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#dayContent').summernote({
				placeholder : 'Mô tả chi tiết',
				width : 500,
				height : 100, // set editor height
				minHeight : null, // set minimum height of editor
				maxHeight : null
			// set maximum height of editor				             
			});
		});
	</script>
</body>
<!-- background: linear-gradient(to right, #84d9d2, #07cdae); xanh lá nhạt-->
<!-- background: linear-gradient(to right, #ffbf96, #fe7096); đỏ hồng-->
<!-- background: linear-gradient(to right, #f6e384, #ffd500); vàng-->
<!--  background: linear-gradient(to right, #90caf9, #047edf 99%); xanh dương-->
<!-- background: linear-gradient(to right, #da8cff, #9a55ff); tím -->
<!-- background: linear-gradient(to right, #e7ebf0, #868e96); xám -->
<!-- background: linear-gradient(89deg, #5e7188, #3e4b5b);  dark -->
<!-- background: linear-gradient(to bottom, #f4f4f4, #e4e4e9); trắng -->
</html>