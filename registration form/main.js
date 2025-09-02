document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("regForm");

  form.addEventListener("submit", function (e) {
    e.preventDefault(); // stop form submission
    validateForm();
  });

  function setError(id, message) {
    const input = document.getElementById(id);
    const errorSpan = document.getElementById(id + "-error");

    if (errorSpan) errorSpan.textContent = message;
    if (input) input.classList.add("error");
  }

  function clearErrors() {
    document.querySelectorAll(".error-msg").forEach(span => (span.textContent = ""));
    document.querySelectorAll(".infoc").forEach(el => el.classList.remove("error"));
  }

  function clearFieldError(id) {
    const input = document.getElementById(id);
    const errorSpan = document.getElementById(id + "-error");

    if (errorSpan) errorSpan.textContent = "";
    if (input) input.classList.remove("error");
  }

  // clear the error message when user starts typing.
  document.querySelectorAll(".infoc").forEach(input => {
    input.addEventListener("input", () => clearFieldError(input.id));
  });

  function validateForm() {
    let isValid = true;
    clearErrors();

    let fullname = document.getElementById("fullname");
    if (fullname.value.trim() === "") {
      setError("fullname", "Full Name is required");
      isValid = false;
    }

    let email = document.getElementById("email");
    if (!email.value.includes("@")) {
      setError("email", "Enter a valid email address");
      isValid = false;
    }

    let password = document.getElementById("password");
    if (password.value.length < 8) {
      setError("password", "Password must be at least 8 characters");
      isValid = false;
    }

    let gender = document.querySelector('input[name="gender"]:checked');
    if (!gender) {
      document.getElementById("gender-error").textContent = "Please select a gender";
      isValid = false;
    }

    let anum = document.getElementById("anum");
    if (anum.value.length !== 12) {
      setError("anum", "Aadhaar number must be 12 digits");
      isValid = false;
    }

    let pincode = document.getElementById("pincode");
    if (pincode.value.length !== 6) {
      setError("pincode", "Pincode must be 6 digits");
      isValid = false;
    }

    let city = document.getElementById("citySelect");
    if (city.value === "City") {
      document.getElementById("citySelect-error").textContent = "Please select a city";
      isValid = false;
    }

    let country = document.getElementById("country");
    if (country.value.trim() === "") {
      setError("country", "Country is required");
      isValid = false;
    }

    if (isValid) {
      alert("✅ Form submitted successfully!");
      form.reset();
    }
  }
});
