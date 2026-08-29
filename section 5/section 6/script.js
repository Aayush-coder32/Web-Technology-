document.getElementById('registrationForm').addEventListener('submit', function(event) {
 event.preventDefault();
 document.getElementById('nameError').textContent = '';
 document.getElementById('emailError').textContent = '';
  document.getElementById('phoneError').textContent = '';
  document.getElementById('passwordError').textContent = '';
 const name = document.getElementById('name').value;
 const email = document.getElementById('email').value;
 const phone = document.getElementById('phone').value;
 const password = document.getElementById('password').value;
 let valid = true;
 // Validate Email
 const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; // Basic email validation
 if (!emailRegex.test(email)) {
 document.getElementById('emailError').textContent = 'Please enter a valid email address.';
 valid = false;
 }
 // Validate Phone Number
const phoneRegex = /^\d{10}$/; // Exactly 10 digits
 if (!phoneRegex.test(phone)) {
 document.getElementById('phoneError').textContent = 'Phone number must contain exactly 10
digits.';
 valid = false;
 }
