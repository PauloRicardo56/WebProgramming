function calc(operator) {

	var result = document.getElementById("result")
	var num1 = parseInt(document.getElementById('num1').value)
	var num2 = parseInt(document.getElementById('num2').value)

	switch(operator) {
		case "+":
			result.innerText = num1 + num2; break;
		case "-":
			result.innerText = num1 - num2; break;
		case "/":
			result.innerText = num1 / num2; break;
		case "*":
			result.innerText = num1 * num2; break;
		default:
			result.innerText = "Error"
	}
}
