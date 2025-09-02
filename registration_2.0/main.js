document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("regForm");

  // helper: show & clear errors
  const setError = (id, msg) => {
    const el = document.getElementById(id);
    const span = document.getElementById(id + "-error");
    if (el) el.classList.add("error");
    if (span) span.textContent = msg || "";
  };

  const clearFieldError = (id) => {
    const el = document.getElementById(id);
    const span = document.getElementById(id + "-error");
    if (el) el.classList.remove("error");
    if (span) span.textContent = "";
  };

  const clearAllErrors = () => {
    document.querySelectorAll(".infoc").forEach(i => i.classList.remove("error"));
    document.querySelectorAll(".error-msg").forEach(s => s.textContent = "");
    document.getElementById("gender-error").textContent = "";
  };

  // live clear on typing
  ["fullname","email","password","dob","anum","address","pincode","citySelect","country"]
    .forEach(id => {
      const el = document.getElementById(id);
      if (!el) return;
      const evt = (el.tagName === "SELECT") ? "change" : "input";
      el.addEventListener(evt, () => clearFieldError(id));
    });

  // live clear for gender
  document.querySelectorAll('input[name="gender"]').forEach(r => {
    r.addEventListener("change", () => {
      document.getElementById("gender-error").textContent = "";
    });
  });

  // enforce digits & max length for Aadhaar (12) and Pincode (6)
  const digitLimiter = (id, max) => {
    const el = document.getElementById(id);
    el.addEventListener("input", () => {
      el.value = el.value.replace(/\D/g, "").slice(0, max);
      if (el.value.length === max) clearFieldError(id);
    });
  };
  digitLimiter("anum", 12);
  digitLimiter("pincode", 6);

  // validation rules
  function validateForm() {
    clearAllErrors();
    let ok = true;

    const fullname = document.getElementById("fullname").value.trim();
    if (fullname.length < 3) { setError("fullname", "Full name must be at least 3 characters"); ok = false; }

    const email = document.getElementById("email").value.trim();
    const emailOk = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
    if (!emailOk) { setError("email", "Enter a valid email address"); ok = false; }

    const password = document.getElementById("password").value.trim();
    if (password.length < 6) { setError("password", "Password must be at least 6 characters"); ok = false; }

    const dob = document.getElementById("dob").value;
    if (!dob) { setError("dob", "Date of birth is required"); ok = false; }

    const aadhaar = document.getElementById("anum").value.trim();
    if (!/^\d{12}$/.test(aadhaar)) { setError("anum", "Aadhaar must be exactly 12 digits"); ok = false; }

    const address = document.getElementById("address").value.trim();
    if (address.length < 5) { setError("address", "Address must be at least 5 characters"); ok = false; }

    const pincode = document.getElementById("pincode").value.trim();
    if (!/^\d{6}$/.test(pincode)) { setError("pincode", "Pincode must be exactly 6 digits"); ok = false; }

    const city = document.getElementById("citySelect").value;
    if (!city) { setError("citySelect", "Please select a city"); ok = false; }

    const country = document.getElementById("country").value.trim();
    if (country.length < 3) { setError("country", "Country must be at least 3 characters"); ok = false; }

    const genderChecked = document.querySelector('input[name="gender"]:checked');
    if (!genderChecked) { document.getElementById("gender-error").textContent = "Please select a gender"; ok = false; }

    return ok;
  }

  form.addEventListener("submit", (e) => {
    e.preventDefault();
    if (validateForm()) {
      alert("✅ Form submitted successfully!");
      form.reset();
      clearAllErrors();
    }
  });
});
