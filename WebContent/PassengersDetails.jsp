<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="js/cookie.js"></script>
<script>
<!--
	function SubmitFunction1(form) {
		if (form.firstName.value == null || form.firstName.value == "") {
			alert("ERROR:FirstName cannot be empty.");
			form.firstName.focus();
			return false;
		}
		var re = /^[A-Za-z]+$/;
		var rf = /^[W0-9]+$/;
		if (!re.test(form.firstName.value)) {
			alert("ERROR:FirstName contains invalid character.");
			form.firstName.focus();
			return false;
		}
		if (rf.test(form.middleName.value)) {
			alert("ERROR:MiddleName contains invalid character.");
			form.middleName.focus();
			return false;
		}
		if (form.lastName.value == null || form.lastName.value == "") {
			alert("ERROR:LastName cannot be empty.");
			form.lastName.focus();
			return false;
		}
		if (!re.test(form.chLastName.value)) {
			alert("ERROR:LastName contains invalid character.");
			form.lastName.focus();
			return false;
		}
		return true;
	}
	function SubmitFunction2(form) {
		if (form.chFirstName.value == null || form.chFirstName.value == "") {
			alert("ERROR:FirstName cannot be empty.");
			form.chFirstName.focus();
			return false;
		}
		var re = /^[A-Za-z]+$/;
		var rf = /^[W0-9]+$/;
		var rg = /^[0-9]+$/;
		if (!re.test(form.chFirstName.value)) {
			alert("ERROR:FirstName contains invalid character.");
			form.chFirstName.focus();
			return false;
		}
		if (rf.test(form.chMiddleName.value)) {
			alert("ERROR:MiddleName contains invalid character.");
			form.chMiddleName.focus();
			return false;
		}
		if (form.chLastName.value == null || form.chLastName.value == "") {
			alert("ERROR:LastName cannot be empty.");
			form.chLastName.focus();
			return false;
		}
		if (!re.test(form.chLastName.value)) {
			alert("ERROR:LastName contains invalid character.");
			form.chLastName.focus();
			return false;
		}
		if (form.cardNumber.value == null || form.cardNumber.value == "") {
			alert("ERROR:cardName cannot be empty.");
			form.cardNumber.focus();
			return false;
		}
		if (!rg.test(form.cardNumber.value)) {
			alert("ERROR:cardNumber contains invalid character.");
			form.cardNumber.focus();
			return false;
		}
		if (form.chEmailId.value == null || form.chEmailId.value == "") {
			alert("ERROR:Email cannot be empty");
		}
		return true;
	}
	call = function() {
		json_str = getCookie('travelDetails');
	    arr = JSON.parse(json_str);
	    var passenger=parseInt(arr[0])+parseInt(arr[1]);
	    window.location.replace("PassengersDetails.jsp?name="+passenger);
	   
	}

//-->
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Passenger Detail</title>
</head>
<body>
<input type="button" value="Get" onclick='call()'>
    <%
        String name=request.getParameter("name");
        if(name!=null){
            out.println(name);
        }
    %>
</body>
</html>