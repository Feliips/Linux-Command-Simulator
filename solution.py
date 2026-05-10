import sys

comando = sys.stdin.readline().strip()

if comando == "ls":
    print("lista arquivos e diretorios")

elif comando == "cd":
    print("altera o diretorio atual")

elif comando == "pwd":
    print("mostra o caminho do diretorio atual")

elif comando == "mkdir":
    print("cria um novo diretorio")

else:
    print("comando invalido")