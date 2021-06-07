function fn1(){
			var str = document.getElementById("message").value;
			element = document.getElementById("haha");
			var message = document.getElementById("message");
			var x = document.getElementById("satisfied");
			if (message.value == "") {
				alert("error!");
				x.style.display == "none";
			}
			else {
				element.value =  str[0] + ", and an emotion will be displayed here..." ;
				fn2();
				fn3();
			}
	}

function fn2(){
			var x = document.getElementById("satisfied");
  		if (x.style.display == "none") {
    		x.style.display = "block";
  		} else {
    		x.style.display = "block";
  		}
}

function fn3(){
		var button1 = document.getElementById("button1");
		if (button1.style.display == "block") {
    	button1.style.display = "none";
  	} else {
    		button1.style.display = "none";
  	}
}

function fn4(){
	var satisfaction = document.getElementByName("satisfy");
	if (satisfaction.value == "Yes"){
		alert("sth")
	} else {
		alert("nope")
	}
}

function fn5(){
	var yes = document.getElementById("yes");
	var no = document.getElementById("no");
	var satisfied = document.getElementById("satisfied");
	var button1 = document.getElementById("button1");
	var button2 = document.getElementById("button2");
	var correction = document.getElementById("correction");
	var message = document.getElementById("message");
	var result = document.getElementById("haha")


	if (yes.checked ==true) {
		satisfied.style.display = "none";
		button1.style.display = "block";
		message.value = "";
		result.value = "";
	}

	else if(no.checked == true){
		correction.style.display = "block";
		satisfied.style.display = "none";
	}
	else{
		alert("You need to make a choice before proceeding. ");
	}
}

































