var today = new Date().toISOString().split("T")[0];
document.getElementById("date").min = today;

function check(id, errId, msg, isValid) {
  var input = document.getElementById(id);
  var err = document.getElementById(errId);

  if (isValid) {
    input.className = "valid";
    err.className = "error";
  } else {
    input.className = "invalid";
    err.textContent = msg;
    err.className = "error show";
  }
  return isValid;
}

document.getElementById("planet").onblur = function () {
  var val = this.value;
  var hasVowel = /[aeiou]/i.test(val);
  var hasDigit = /\d/.test(val);
  var ok = val && hasVowel && hasDigit;
  check("planet", "planetErr", "Need vowel AND digit", ok);
};

document.getElementById("alienId").onblur = function () {
  var ok = /^[A-Z]{3}-[A-Z]{2}_\d{4}@[A-Z]{3}$/.test(this.value);
  check("alienId", "idErr", "Format: ABC-XY_1234@UFO", ok);
};

document.getElementById("antenna").onblur = function () {
  var num = parseInt(this.value);
  var ok = num >= 0 && num % 2 === 0;
  check("antenna", "antennaErr", "Even numbers only", ok);
};

document.getElementById("phrase").onblur = function () {
  var hasPunct = /[!.,;?:'"-]/.test(this.value);
  var hasEmoji = /[\u{1F300}-\u{1F9FF}]/u.test(this.value);
  var ok = this.value && (hasPunct || hasEmoji);
  check("phrase", "phraseErr", "Add emoji or punctuation", ok);
};

document.getElementById("date").onblur = function () {
  var selected = new Date(this.value);
  var now = new Date();
  now.setHours(0, 0, 0, 0);
  var ok = selected >= now;
  check("date", "dateErr", "Must be today or future", ok);
};

document.getElementById("eyes").onchange = function () {
  var ok = this.value !== "";
  check("eyes", "eyesErr", "Please select", ok);
};

document.getElementById("form").onsubmit = function (e) {
  e.preventDefault();

  var p = document.getElementById("planet");
  var id = document.getElementById("alienId");
  var a = document.getElementById("antenna");
  var ph = document.getElementById("phrase");
  var d = document.getElementById("date");
  var ey = document.getElementById("eyes");

  var v1 = /[aeiou]/i.test(p.value) && /\d/.test(p.value);
  var v2 = /^[A-Z]{3}-[A-Z]{2}_\d{4}@[A-Z]{3}$/.test(id.value);
  var v3 = parseInt(a.value) >= 0 && parseInt(a.value) % 2 === 0;
  var v4 =
    /[!.,;?:'"-]/.test(ph.value) || /[\u{1F300}-\u{1F9FF}]/u.test(ph.value);
  var v5 = new Date(d.value) >= new Date().setHours(0, 0, 0, 0);
  var v6 = ey.value !== "";

  check("planet", "planetErr", "Need vowel AND digit", v1);
  check("alienId", "idErr", "Format: ABC-XY_1234@UFO", v2);
  check("antenna", "antennaErr", "Even numbers only", v3);
  check("phrase", "phraseErr", "Add emoji or punctuation", v4);
  check("date", "dateErr", "Must be today or future", v5);
  check("eyes", "eyesErr", "Please select", v6);

  if (v1 && v2 && v3 && v4 && v5 && v6) {
    var rand = Math.random().toString(36).substring(2, 11).toUpperCase();
    document.getElementById("code").textContent = "EARTH-" + rand;
    document.getElementById("modal").className = "modal show";
  }
};

function reset() {
  document.getElementById("form").reset();
  document.getElementById("modal").className = "modal";
  var inputs = document.querySelectorAll("input, select");
  for (var i = 0; i < inputs.length; i++) {
    inputs[i].className = "";
  }
  var errors = document.querySelectorAll(".error");
  for (var j = 0; j < errors.length; j++) {
    errors[j].className = "error";
  }
}
