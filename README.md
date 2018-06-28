# DSL
Trabalho de DSL para a cadeira de Tópicos Avançados em Engenharia de Software

# Introdução
O objetivo desta linguagem é a geração de Peças, Features e Recursos de fabricação e transporte para a simulação de uma linha de produção e o cálculo de tempo, custo, etc.

# Configurando o Ambiente
1. Importar para o workspace todos os projetos exceto 'simulador'
1. Caso necessário, criar a pasta src dentro do projeto "LinhaDeProducao"
1. Utilizar o projeto Acceleo (clique botão direito) para gerar o projeto Ui Acceleo Launcher Project
1. No projeto Acceleo vá até o arquivo generate.mtl na pasta main e execute run as -> Launch Acceleo Application
  1. Em model, escolha o arquivo Simulation.xmi
  1. Em target, escolha a pasta src-gen dentro do projeto Acceleo. Se esta pasta não existir, crie-a
  1. Em runner, escolha Acceleon Plug-in Application
  1. Apply e Run
1. Novamente no projeto Acceleo, escolher run as -> Eclipse Application
1. No novo ambiente, importar o projeto simulador

# Gerando código
1. Criar elementos no projeto simulador
1. Ao terminar, clicar com o botao direito em My.linhadeproducao e selecionar Acceleo Model to Text -> Generate Linhaproducao
1. Os arquivos são gerados dentro da pasta src-gen

#Observações
Inserção de arestas pelas ferramentas da interface não funciona. É necessário inserir manualmente através das propriedades do elemento.
