<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<title>Airplane</title>
<script type="text/javascript">
<!--
	function yesnoCheck() {
		if (document.getElementById('yesCheck').checked) {
			document.getElementById('ifYes').style.visibility = 'visible';
		} else
			document.getElementById('ifYes').style.visibility = 'hidden';
	}
//-->
</script>
</head>
<body>
	<nav>
	<form>
		<div>
			<h2>Book a flight, NOW !</h2>
			<hr>

			<div>

				<span>One way</span> <input type="radio"
					onclick="javascript:yesnoCheck();" name="yesno" id="noCheck" /><span>Two
					way</span> <input type="radio" onclick="javascript:yesnoCheck();"
					name="yesno" id="yesCheck" /> <br>

				<div></div>

				<p>
					<span> <img
						src="https://www.buddhaair.com/assets/themes/buddha/images/adult_ico.png"
						align="absmiddle"> <label>Adults <span>(12 +
								Yrs)</span></label> <select name="adult">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
					</select>
					</span>
				<div></div>
				<span> <img
					src="https://www.buddhaair.com/assets/themes/buddha/images/child_ico.png"
					align="absmiddle"> <label>Children <span>(02-11
							Yrs)</span></label> <select name="child">
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
				</select>
				</span>
				</p>
				<hr>
				<p>
					<span> <label>From <font>*</font></label> <select
						name="depart" id="depart" size="1" onchange="getDestination(this)">
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
					</select> <label for="date">Departure date</label> <input type="date"
						name="from_date">
					</span>
				</p>
				<p>
					<span id="sectorto"> <label>To <font
							id="sectortolabel">*</font></label> <select name="arrival" id="arrival"
						size="1">
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
					</select> <span id="ifYes" style="visibility: hidden"> <label
							for="date">Arrival date</label> <input type='date' name='to_date' />
					</span>



					</span>
				</p>
				<hr>
				<label>Nationality<font class="required">*</font></label> <select
					name="cnationality" id="cnationality" size="1">
					<option value=""> -- Nationality -- </option>
					<option value="1">Nepali</option>
					<option value="2">Indian</option>
					<option value="3">Others</option>
				</select>

				<p class="last">
					<input name="bookingtype" value="H" type="hidden"> <input
						value="Check Availability" name="FlightSubmit" type="button">
				</p>
			</div>
		</div>
	</form>
	</nav>

</body>
</html>