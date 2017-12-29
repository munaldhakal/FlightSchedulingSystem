<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
<script type="text/javascript">
<!--
	function addField(n) {
		var tr = n.parentNode.parentNode.cloneNode(true);
		document.getElementById('tbl').appendChild(tr);
	}
//-->
</script>
</head>
<body>
	<form action="./TravelDetailsServlet" method="post">
		<%
			String createdBy = (String) request.getAttribute("createdBy");
			request.setAttribute("createdBy", createdBy);
			
		
			out.print(createdBy);
		%>
		
		<input type="hidden" name="createdBy" value="${createdBy}">
		
		<table id="tbl" style="width: 100%">
			<tr>
				<th>From</th>
				<th>To</th>
				<th>Date</th>
				<th>Departure Time</th>
				<th>Arrival Time</th>
				<th>Fare</th>
				<th>Status</th>
				<th>Add New Data</th>
			</tr>
			<tr>
				<td><select name="departurePlace" id="depart" size="1"
					class="city-from required" onchange="getDestination(this)">
						<option value=""> -- FROM -- </option>

						<option value="KTM">Kathmandu</option>
						<option value="BIR">Biratnagar</option>
						<option value="BWA">Bhairahawa</option>
						<option value="DHI">Dhanagadhi</option>
						<option value="JKR">Janakpur</option>
						<option value="KEP">Nepalgunj</option>
						<option value="PKR">Pokhara</option>
						<option value="SIF">Simara</option>
						<option value="TMI">Tumlingtar</option>
						<option value="BDP">Bhadrapur</option>
						<option value="BHR">Bharatpur</option>
				</select></td>
				<td><select name="arrivalPlace" id="arrivalPlace" size="1"
					class="city-from required">
						<option value=""> -- TO -- </option>
						<option value="KTM">Kathmandu</option>
						<option value="BIR">Biratnagar</option>
						<option value="BWA">Bhairahawa</option>
						<option value="DHI">Dhanagadhi</option>
						<option value="JKR">Janakpur</option>
						<option value="KEP">Nepalgunj</option>
						<option value="PKR">Pokhara</option>
						<option value="SIF">Simara</option>
						<option value="TMI">Tumlingtar</option>
						<option value="BDP">Bhadrapur</option>
						<option value="BHR">Bharatpur</option>
				</select></td>
				<td><label for="date">Date</label> <input type='date'
					name='departureDate' /></td>
				<td><input type="time" name="departureTime"></td>
				<td><input type="time" name="arrivalTime"></td>
				<td><input type="Fare" name=fare></td>
				<td><select name="status" id="status" size="1">
						<option value="ACTIVE">ACTIVE</option>
						<option value="SOLD">SOLD</option>
				</select></td>
				<td><input type="button" class="button" value="+"
					onclick="addField(this);" /></td>
			</tr>
		</table>
		<input type="submit" name="submit" value="Send">
	</form>
</body>
</html>