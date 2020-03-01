function calc(num1, num2, operator) {

	
	var result = document.getElementById("result")
	var num1v = parseInt(num1.value)
	var num2v = parseInt(num2.value)

	switch(operator) {
		case "+":
			result.innerText = num1v + num2v; break;
		case "-":
			result.innerText = num1v - num2v; break;
		case "/":
			result.innerText = num1v / num2v; break;
		case "*":
			result.innerText = num1v * num2v; break;
		default:
			result.innerText = "Error"
	}
}