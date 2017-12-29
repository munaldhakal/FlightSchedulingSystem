<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/full-slider.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
<!--
	$(document).ready(
			function() {
				$('input[name=radioButton]').on(
						'change',
						function() {
							var id = $(this).closest('tr').find('td:eq(0)')
									.text();
							var departurePlace = $(this).closest('tr').find(
									'td:eq(1)').text();
							var departureTime = $(this).closest('tr').find(
									'td:eq(2)').text();
							var arrivalPlace = $(this).closest('tr').find(
									'td:eq(3)').text();
							var arrivalTime = $(this).closest('tr').find(
									'td:eq(4)').text();
							var fare = parseInt($(this).closest('tr').find(
									'td:eq(5)').text(), 10);
							var fuelcharge = 1500;
							var airporttax = 500;
							var totalcharge = fare + fuelcharge + airporttax;
							$('.fare').text(
									$(this).closest('tr').find('td:eq(5)')
											.text());
							$('.totalfare').text(totalcharge);
							$('.airporttax').text(airporttax);
							$('.fuelcharge').text(fuelcharge);
							//$('.pass').text($(this).closest('tr').find('td:eq(1)').text());		
						});
			});
//-->
</script>
</head>
<body>
	<table>
		<tr>
			<th>Flight numbers</th>
			<th>Departure Plave</th>
			<th>Departure Time</th>
			<th>Arrival Place</th>
			<th>Arrival Time</th>
			<th>Fare</th>
			<th>Select</th>
		</tr>
		<%
			ResultSet rs = (ResultSet) request.getAttribute("rs");
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("id")%></td>
			<td><%=rs.getString("departurePlace")%></td>
			<td><%=rs.getString("departureTime")%></td>
			<td><%=rs.getString("arrivalPlace")%></td>
			<td><%=rs.getString("arrivalTime")%></td>
			<td><%=rs.getString("fare")%></td>
			<td><input type="radio" name="radioButton" /></td>
		</tr>
		<%
			}
		%>


	</table>
	<table align="center">
		<tr>
			<th>Fare details</th>
		</tr>
		<tr>
			<td>Passenger/s charge: <span class="fare"></span></td>
		</tr>
		<tr>
			<td>Fuel Charge: <span class="fuelcharge"></span></td>
		</tr>
		<tr>
			<td>Airport tax: <span class="airporttax"></span></td>
		</tr>
		<tr>
			<td><hr>Total Fare: <span class="totalfare"></span></td>
			<td></td>
			<td></td>
			<td><a class="btn btn-success" href="passenger.html">Next</a></td>
		</tr>
		</tbody>

	</table>
















	<!-- <table border="2" align="center">
		<h2 align="center">Select flights !</h2>
		<tbody>
			<th>Flight numbers</th>
			<th>Departure Time</th>
			<th>Arrival Time</th>
			<th>Fare</th>
			<th>Select</th>

			<tr>
				<td>1</td>
				<td>11:30</td>
				<td>12:00</td>
				<td>Rs. 3000</td>
				<td><input type="radio" name="product_variation" /></td>
			</tr>
			<tr>
				<td>2</td>
				<td>12:30</td>
				<td>13:30</td>
				<td>Rs. 4000</td>
				<td><input type="radio" name="product_variation" /></td>
			</tr>
			<tr>
				<td>3</td>
				<td>10:30</td>
				<td>14:00</td>
				<td>Rs. 5100</td>
				<td><input type="radio" name="product_variation" /></td>
			</tr>
			<tr>
				<td>4</td>
				<td>13:30</td>
				<td>15:00</td>
				<td>Rs. 5100</td>
				<td><input type="radio" name="product_variation" /></td>
			</tr>
			<tr>
				<td>5</td>
				<td>14:30</td>
				<td>16:00</td>
				<td>Rs. 2500</td>
				<td><input type="radio" name="product_variation" /></td>
			</tr>
			<tr>
				<td>6</td>
				<td>15:30</td>
				<td>14:00</td>
				<td>Rs. 2000</td>
				<td><input type="radio" name="product_variation" /></td>
			</tr>
			<tr>
				<td>7</td>
				<td>16:30</td>
				<td>17:00</td>
				<td>Rs. 5500</td>
				<td><input type="radio" name="product_variation" /></td>
			</tr>
			<tr>
				<td>8</td>
				<td>17:30</td>
				<td>12:00</td>
				<td>Rs. 4300</td>
				<td><input type="radio" name="product_variation" /></td>
			</tr>
		</tbody>
	</table> -->
</body>
</html>