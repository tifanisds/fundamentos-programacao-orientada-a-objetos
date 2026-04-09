## Escopo geral:

Uma empresa de manutenção e suporte técnico deseja automatizar a gestão de suas
Ordens de Serviço (OS). Atualmente, o controle das OSs é feito manualmente,
resultando em falhas na comunicação, atrasos no atendimento e dificuldades no
acompanhamento do status das solicitações.
Para melhorar esse processo, você deve desenvolver um sistema em Java, utilizando
Programação Orientada a Objetos (POO), que permita gerenciar as Ordens de Serviço
desde sua criação até sua conclusão.

## Desenvolver um sistema que permita:

Criar e gerenciar Ordens de Serviço (OS) associadas a clientes e técnicos.
Acompanhar o status das OSs, que pode ser "Aberta" → "Em andamento" →
"Concluída".
Registrar informações relevantes sobre a OS, como descrição do serviço e
cliente associado.
Listar todas as OSs abertas e permitir a atualização do status da OS.

Regras de Negócio:
1. Clientes podem ser Pessoa Física (CPF) ou Pessoa Jurídica (CNPJ), e devem conter nome e contato.

2. Técnicos têm uma especialidade específica, como "TI - Redes" ou "Eletricista", e são responsáveis por executar as OSs.

3. Cada OS deve conter:
- Um cliente vinculado (pessoa física ou jurídica).
- Um técnico responsável.
- Uma descrição do serviço solicitado.
- Um status, que começa como "Aberta" e pode avançar para "Em andamento" e "Concluída".
- A data de criação da OS.

4. O sistema deve permitir ao usuário
- Criar novas OSs, associando um cliente e um técnico.
- Visualizar todas as OSs abertas.
- Avançar o status de uma OS específica.
- Encerrar o programa quando desejar.

## Funcionalidades Esperadas:

- Criar um sistema interativo, onde o usuário pode escolher as ações através de um menu.
- Usar herança para diferenciar clientes PF e PJ.
- Utilizar associação de classes para relacionar clientes e técnicos às OSs.
- Aplicar laços de repetição (while ou for) para listar e gerenciar as OSs.
- Utilizar construtores para inicializar objetos corretamente.