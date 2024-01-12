// =======Function to show/hide password========
function togglePassword(inputId) {
    const passwordInput = document.getElementById(inputId);
    const showBtn = document.getElementById('showBtn');

    if (passwordInput.type === 'password') {
        passwordInput.type = 'text';
        showBtn.classList.remove('fa-eye');
        showBtn.classList.add('fa-eye-slash');
    } else {
        passwordInput.type = 'password';
        showBtn.classList.remove('fa-eye-slash');
        showBtn.classList.add('fa-eye');
    }
}

// let inputBox = document.getElementById("input-box")
// let input = document.getElementsByTagName("input")
