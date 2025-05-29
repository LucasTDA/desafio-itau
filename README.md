📊 Desafio Itaú — API de Transações
Este projeto consiste no desenvolvimento de uma API RESTful construída com Java + Spring Boot, que tem como objetivo gerenciar transações financeiras simuladas, permitindo a criação e remoção de transações, bem como o controle de validações específicas.

A API foi testada utilizando o Postman, garantindo o correto funcionamento dos endpoints e suas regras de negócio.

🚀 Tecnologias utilizadas:
☕ Java 17+

🌱 Spring Boot

🔧 Spring Web

🔍 Spring Validation

🛠️ Maven

✅ Postman (para testes dos endpoints)

📌 Funcionalidades:
✅ Criar transação:
➝ Endpoint responsável por receber uma transação contendo valor e data/hora.
➝ Possui validações de negócio:

Não aceita transações com valor menor ou igual a zero;

Não aceita transações com data/hora futura.

🗑️ Deletar todas as transações:
➝ Limpa todas as transações armazenadas em memória.

🔗 Endpoints da API:
| Método | Rota         | Descrição                  |
| ------ | ------------ | -------------------------- |
| POST   | `/transacao` | Cria uma nova transação    |
| DELETE | `/transacao` | Remove todas as transações |

🧠 Validações aplicadas:
O valor da transação deve ser maior que zero.

A data/hora da transação não pode ser no futuro.

Caso qualquer uma das validações não seja atendida, a API retorna o status:

422 - Unprocessable Entity

🧪 Testes:
Testes realizados utilizando o Postman para validar todos os endpoints e cenários possíveis.
