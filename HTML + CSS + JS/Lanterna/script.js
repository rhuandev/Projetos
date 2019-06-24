function ligar() {
	document.getElementById('luz').style.visibility = "initial";
}

function desligar() {
	document.getElementById('luz').style.visibility = "hidden"
}

function ligaDesliga() {
	if(document.getElementById('luz').style.visibility === "hidden") {
		if(num > 0){
		ligar();
		gastaBateria();
		}
		
		if(num == 0){
			desligar();
		}

	}else {
		desligar();
	}
	
}

function gastaBateria() {
	document.getElementById('bateria-level').innerHTML= num + "%";

	if(num == 0){
		desligar();
	}
}

function trocaBateria() {
	num = 100;
	document.getElementById('bateria-level').innerHTML= num + "%";
	console.log(num);
}

var num = 100;

if(num > 0) {
		setInterval(function() {
			if(document.getElementById('luz').style.visibility === "initial"){
				if(num > 0) {
				num = num - 1;
				gastaBateria(num);
				console.log(num);
				}
			}
		}, 100)
}

 