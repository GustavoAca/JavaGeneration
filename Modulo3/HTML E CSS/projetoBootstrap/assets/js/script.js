let senha1 = document.querySelector(".em1")
let senha2 = document.querySelector(".em2")
let erro = document.querySelector("#txError")
let visualizar1 = document.querySelector(".visu1")
let visualizar2 = document.querySelector(".visu2")

let emailPass = false;
let senhaPass = false;


let btSenha = document.querySelector("#botaoSenha")

function verSenha() {
  if (senha1.value !== senha2.value) {
    erro.innerHTML = "Senhas divergentes"
    erro.style.color = "red"
  }
  else {
    erro.innerHTML = ""
    emailPass = true;
    senhaPass = true
  }
}

function mostraSenha() {
  if (btSenha.checked == true) {
    visualizar1.type = "text"
    visualizar2.type = "text"

  } else {
    visualizar1.type = "password"
    visualizar2.type = "password"

  }

}

function enviarForm() {
  if (senhaPass == true && emailPass == true) {
    alert("Enviado com sucesso")
  }

  else {
    alert("Complete os dados!")

  }
}


