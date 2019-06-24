window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 550 || document.documentElement.scrollTop > 550) {
	document.getElementById("topo1").style.display = 'flex';
  } else {
    document.getElementById("topo1").style.display = 'none';
  }
 }

function goHome() {
  var elmnt = document.getElementById("home");
  elmnt.scrollIntoView({ behavior: 'smooth'});
}

function goAbout() {
  var elmnt = document.getElementById("about");
  elmnt.scrollIntoView({ behavior: 'smooth'});
}

function goIgredients() {
  var elmnt = document.getElementById("igredients");
  elmnt.scrollIntoView({ behavior: 'smooth'});
}

function goMenu() {
  var elmnt = document.getElementById("menu");
  elmnt.scrollIntoView({ behavior: 'smooth'});
}

function goReviews() {
  var elmnt = document.getElementById("reviews");
  elmnt.scrollIntoView({ behavior: 'smooth'});
}

function goReservation() {
  var elmnt = document.getElementById("reservation");
  elmnt.scrollIntoView({ behavior: 'smooth'});
}


function validateForm() {
  var partyNum =  document.forms["reservation"]["lpartyNum"].value;
  if (isNaN(partyNum)) {
    alert("Party number must be a number!");
    return false;
  }else {
    return true;
  }
}

function showBook() {
  var nome = document.forms["reservation"]["fname"].value;
  var email = document.forms["reservation"]["fmail"].value;
  var data = document.forms["reservation"]["fdate"].value;
  var partyNum = document.forms["reservation"]["lpartyNum"].value;

  alert("Reservation done!" + "\nName: " + nome + "\nEmail: " + email + "\nDate: " + data + 
        "\nParty Number: " + partyNum);
}