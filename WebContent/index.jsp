<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="js/cookie.js"></script>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
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
	function toJspPage() {
		window.open("Login.jsp","_self");
	}
	function toRegisterPage() {
		window.open("Register.jsp","_self");
	}
	$(document).ready(function(){
	    $("#btncheck").click(function(){
	      noOfAdults=$("#noOfAdults").val();
	      noOfChildren=$("#noOfChildren").val();
	      departurePlace=$("#departurePlace").val();
	      arrivalPlace=$("#arrivalPlace").val();
	      date=$("#date").val();
	      console.log(noOfAdults);
	      console.log(noOfChildren);
	      console.log(departurePlace);
	      console.log(arrivalPlace);
	      console.log(date);
	      setTravelDetails();

	    });
	    });
//-->
</script>
</head>
<body>
	<nav>
	<form action="./ReturnTravelInfoResultSetServlet" method="post">
		<div>
			<input type="button" value="Register" name="Register.jsp"
				onclick="javascript:toRegisterPage();" style="float: right;" /> <input
				type="button" value="Login" name="Login.jsp"
				onclick="javascript:toJspPage();" style="float: right;" />
			<h2>Book a flight, NOW !</h2>
			<hr>

			<div>

				<!-- 			<span>One way</span> <input type="radio"
					onclick="javascript:yesnoCheck();" name="yesno" id="noCheck" /><span>Two
					way</span> <input type="radio" onclick="javascript:yesnoCheck();"
					name="yesno" id="yesCheck" /> <br> -->
				<p>
					<span> <img
						src="https://www.buddhaair.com/assets/themes/buddha/images/adult_ico.png"
						align="absmiddle"> <label>Adults <span>(12 +
								Yrs)</span></label> <select id="noOfAdults">
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
					</span> <span> <img
						src="https://www.buddhaair.com/assets/themes/buddha/images/child_ico.png"
						align="absmiddle"> <label>Children <span>(02-11
								Yrs)</span></label> <select id="noOfChildren">
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
						id="departurePlace" name="departurePlace" size="1">
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
						name="date" id="date">
					</span>
				</p>
				<p>
					<span id="sectorto"> <label>To <font
							id="sectortolabel">*</font></label> <select name="arrivalPlace"
						id="arrivalPlace" size="1">
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
					</select> <!-- <span id="ifYes" style="visibility: hidden"> <label
							for="date">Arrival date</label> <input type='date' name='to_date' />
					</span> -->



					</span>
				</p>
				<hr>
				<!-- <label>Nationality<font class="required">*</font></label> <select
					name="nationality" id="nationality" size="1">
					<option value=""> -- Nationality -- </option>
					<option value="1">Nepali</option>
					<option value="2">Indian</option>
					<option value="3">Others</option>
				</select>
 -->
				<p class="last">
					<input value="Check Availability" name="btncheck" id="btncheck"
						type="submit">
				</p>
			</div>
		</div>
	</form>
	</nav>

</body>
</html>