var data = null;

/* Load img */

var canvas = document.getElementById('GameArea');
var ctx = canvas.getContext('2d');

var robot		=	new Image(512, 512);
var machine1	=	new Image(512, 512);
var machine2	=	new Image(512, 512);
var machine3	=	new Image(512, 512);
var machine4	=	new Image(512, 512);

robot.src 		=	'source/robot.png';
machine1.src 	=	'source/machine1.png';
machine2.src 	=	'source/machine2.png';
machine3.src 	=	'source/machine3.png';
machine4.src 	=	'source/machine4.png';


var position;
var c = 0, d = 0;
var interval1;

gameArea = document.getElementById("GameArea");
player = document.getElementById("Player");

gameArea.addEventListener("click", gameLoop);

function gameLoop() {
	c = 0;
	if (interval1 !== null) {
		window.clearInterval(interval1);
	}
	if (data != null) {
		interval1 = window.setInterval(render, 50);
	}
}

function render() {
	w = ctx.canvas.width / 900;
	h = ctx.canvas.height / 600;
	ctx.clearRect(0, 0, ctx.canvas.width, ctx.canvas.height);
	ctx.drawImage(machine4, data[c].a * w, data[c].b * w, data[c].c * h, data[c].d * h);
	ctx.drawImage(robot, data[c].e * w, data[c].f * w, data[c].g * h, data[c].h * h);
	ctx.drawImage(machine1, data[c].i * w, data[c].k * w, data[c].l * h, data[c].m * h);
	ctx.drawImage(machine2, data[c].n * w, data[c].o * w, data[c].p * h, data[c].q * h);
	ctx.drawImage(machine3, data[c].r * w, data[c].s * w, data[c].t * h, data[c].u * h);
	ctx.fillStyle = "red";
	ctx.fillRect(data[c].w * w, data[c].x * h, data[c].y * w, data[c].z * h);
	ctx.fillStyle = "orange";
	ctx.fillRect(data[c].aa * w, data[c].ab * h, data[c].ac * w, data[c].ad * h);
	ctx.fillStyle = "yellow";
	ctx.fillRect(data[c].ae * w, data[c].af * h, data[c].ag * w, data[c].ah * h);
	ctx.fillStyle = "yellowgreen";
	ctx.fillRect(data[c].ai * w, data[c].ak * h, data[c].al * w, data[c].am * h);
	ctx.fillStyle = "lightblue";
	ctx.fillRect(data[c].an * w, data[c].ao * h, data[c].ap * w, data[c].aq * h);
	ctx.fillStyle = "brown";
	ctx.fillRect(data[c].ar * w, data[c].as * h, data[c].at * w, data[c].au * h);
	ctx.fillStyle = "black";
	ctx.font = "30px bold Arial";
	ctx.textAlign = "center";
	ctx.fillText(data[c].aw , data[c].ax * w, data[c].ay * h);
	
	document.getElementById("P_1-name").innerHTML = data[c].az;
	document.getElementById("P_1-A").innerHTML = data[c].ba;
	document.getElementById("P_1-B").innerHTML = data[c].bb;
	document.getElementById("P_1-C").innerHTML = data[c].bc;
	document.getElementById("P_1-D").innerHTML = data[c].bd;
	document.getElementById("P_1-E").innerHTML = data[c].be;

	document.getElementById("P_2-name").innerHTML = data[c].bf;
	document.getElementById("P_2-A").innerHTML = data[c].bg;
	document.getElementById("P_2-B").innerHTML = data[c].bh;
	document.getElementById("P_2-C").innerHTML = data[c].bi;
	document.getElementById("P_2-D").innerHTML = data[c].bk;
	document.getElementById("P_2-E").innerHTML = data[c].bl;

	document.getElementById("P_3-name").innerHTML = data[c].bm;
	document.getElementById("P_3-A").innerHTML = data[c].bn;
	document.getElementById("P_3-B").innerHTML = data[c].bo;
	document.getElementById("P_3-C").innerHTML = data[c].bp;
	document.getElementById("P_3-D").innerHTML = data[c].bq;
	document.getElementById("P_3-E").innerHTML = data[c].br;

	document.getElementById("P_4-name").innerHTML = data[c].bs;
	document.getElementById("P_4-A").innerHTML = data[c].bt;
	document.getElementById("P_4-B").innerHTML = data[c].bu;
	document.getElementById("P_4-C").innerHTML = data[c].bw;
	document.getElementById("P_4-D").innerHTML = data[c].bv;
	document.getElementById("P_4-E").innerHTML = data[c].bx;

	document.getElementById("N-A").innerHTML = data[c].by;
	document.getElementById("N-B").innerHTML = data[c].bz;
	document.getElementById("N-C").innerHTML = data[c].ca;
	document.getElementById("N-D").innerHTML = data[c].cb;
	document.getElementById("N-E").innerHTML = data[c].cc;

	document.getElementById("Player-score").innerHTML = data[c].cd;
	document.getElementById("Player-A").innerHTML = data[c].ce;
	document.getElementById("Player-B").innerHTML = data[c].cf;
	document.getElementById("Player-C").innerHTML = data[c].cg;
	document.getElementById("Player-D").innerHTML = data[c].ch;
	document.getElementById("Player-E").innerHTML = data[c].ci;
	
	console.log(c);
	++c;
	if (c >= data.length - 1) {
		window.clearInterval(interval1);
	}
}

this.addEventListener("load", load);

function load() {
	ctx.canvas.width = window.innerWidth - 27;
	ctx.canvas.height = 2 * ctx.canvas.width / 3 ;
	window.onresize = function(){
		ctx.canvas.width = window.innerWidth - 27;
		ctx.canvas.height = 2 * ctx.canvas.width / 3 ;
	};
}

var input = document.getElementById("myFile");

input.addEventListener("change", function () {
	if (this.files && this.files[0]) {
		var myFile = this.files[0];
		var reader = new FileReader();
    
		reader.addEventListener('load', function (e) {
		data = JSON.parse(e.target.result);
    });
    
	reader.readAsBinaryString(myFile);
  }   
});