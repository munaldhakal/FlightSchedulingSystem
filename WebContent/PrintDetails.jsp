<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="js/cookie.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Print</title>
<script>
<!-- 
function myFunction() {
    window.print();
}
window.onload = function(){
	var totalfare=getCookie('TotalFare');
	var cardHolderName=getCookie('cardHolderName');
	var documentId=getCookie('documentId');
	var ticketNumber=getCookie('FlightId');
	console.log("TotalFare"+totalfare);
    document.getElementById("totalFare").innerHTML="Total Fare :"+totalfare;
    document.getElementById("documentId").innerHTML="DocumentId :"+documentId;
    document.getElementById("cardHolderName").innerHTML="CardholderName :"+cardHolderName;
    document.getElementById("ticketNumber").innerHTML="Ticket Number: :"+ticketNumber;
}

 -->
 </script>
</head>
<body>
<button onclick="myFunction()" style="float: right;">Print</button>
<br><br>
<label id="cardHolderName">Name:</label><br>
<label id="documentId">DocumentId:</label><br>
<label id="totalFare" >Total Fare:</label><br>
<label id="ticketNumber">TicketNumber:</label>

</body>
</html>