var nome = window.document.querySelector("#nome");
var nomeOk = false;

function validarNome() {
  let txtNome = document.querySelector("#txtNome");

  if (nome.value.length < 2) {
    txtNome.innerHTML = "Nome invalido";
    txtNome.style.color = 'red';
    nomeOk = false;

  } else {
    txtNome.innerHTML = "Nome valido";
    txtNome.style.color = "green";
    nomeOk = true;
  }

}

function validar() {
  if (nomeOk == false) {
    alert("Deu erro poh")
  }
  else {
    alert("Mensagem enviada")
  }
}

