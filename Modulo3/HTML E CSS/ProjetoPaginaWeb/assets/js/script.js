/*
 * por tag: getElementByTagName()
 * por id: getElementeById()
 * por nome: getELementByName()
 * por classe: getElementsByClassName()
 * por seletor: querySelector()
 */

let nome = window.document.getElementById("nome");
let email = window.document.querySelector("#email");
let assunto = document.querySelector("#assunto");
let nomeOk = false;
let emailOk = false;
let assuntoOk = false;
let mapa = document.querySelector("#mapa")

nome.style.width = "100%";
email.style.width = "100%";

function validaNome() {
  let txtNome = document.querySelector("#txtNome")
  if (nome.value.length < 3) {
    txtNome.innerHTML = "Nome invalido";
    txtNome.style.color = '#c0392b';
  } else {
    txtNome.innerHTML = 'Nome valido';
    txtNome.style.color = '#2ecc71';
    nomeOk = true;
  }
}

function validaEmail() {
  let txtEmail = document.querySelector("#txtEmail");

  if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 || email.value.indexOf('com') == -1 ) {
    txtEmail.innerHTML = 'Email inválido';
    txtEmail.style.color = '#c0392b';
  } else 
  {
    txtEmail.innerHTML = 'Email válido';
    txtEmail.style.color = '#2ecc71';
    emailOk = true;
  }
}

function validaAssunto (){
  let txtAssunto = document.querySelector('#txtAssunto')

  if(assunto.value.length>=100){
    txtAssunto.innerHTML = 'O texto é muito grande, digite no máximo 100 caracteres';
    txtAssunto.style.color = '#c0392b';
    txtAssunto.style.display = 'block';
  }
  else{
    txtAssunto.style.display = 'none';
    assuntoOk = true;
  }

}

function enviar(){
  if(nomeOk == true && emailOk == true && assuntoOk == true){
    alert('Formulário enviado com sucesso!')
  } else {
    alert('Preencha todos os campos.')
  }
}

function mapaZoom(){
  mapa.style.width = '800px'
  mapa.style.height = '600px'
  mapa.style.transition = "all .5s"
  mapa.style.border = "2px solid"
}

function mapaNormal(){
  mapa.style.width = '400px'
  mapa.style.height = '250px'
  mapa.style.border = "none"
}