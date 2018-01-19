var arr=[];
var json_str;
var noOfAdults;
var noOfChildren;
var departurePlace;
var arrivalPlace;
var date;
function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    var expires = "expires="+d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}
function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}

function setTravelDetails(){
	arr.push(noOfAdults);
	arr.push(noOfChildren);
	arr.push(departurePlace);
	arr.push(arrivalPlace);
	arr.push(date);
	json_str = JSON.stringify(arr);
	setCookie('travelDetails',json_str,0.0208);
}