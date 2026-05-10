const comando = gets();

if (comando === 'ls') {
  console.log('lista arquivos e diretorios');
} else if (comando === 'cd') {
  console.log('altera o diretorio atual');
} else if (comando === 'pwd') {
  console.log('mostra o caminho do diretorio atual');
} else if (comando === 'mkdir') {
  console.log('cria um novo diretorio');
} else {
  console.log('comando invalido');
}
