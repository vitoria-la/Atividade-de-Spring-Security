# Atividade-de-Spring-Security


Parte 1 - Conceitos

1. Explique com suas palavras o que é Spring Security.
  Spring Security é uma dependência que adiciona uma camada de segurança para os métodos HTTP (como Get, Post, etc;), podendo ser costumizada de diferentes maneiras (Como liberar certos métodos apenas para certos tipos de usuários, exigir senha e login, etc;).

2. Para que serve o método csrf().disable()?
  Esse método desabilita o security, permitindo sua costumização.

3. Explique o que significa SessionCreationPolicy.STATELESS.
  É uma política no qual significa que o security não guarda os dados do usuário, apenas os utiliza.

4. Qual a função do permitAll()?
  O permitAll() permite que um método HTTP seja acessado sem nenhuma autenticação prévia.

5. Explique o que faz o requestMatchers().
  Acho que ele pega a requisição que está de acordo com os seus parâmetros (como HttpMethod.GET, "/livros").

6. Qual a função do anyRequest().authenticated()?
  Que o usuário precisa estar autenticado para realizar qualquer requisição.

7. O que é uma API Stateless?
  Uma API Stateless apenas utiliza os dados do usuário, sem armazena-los.

8. Explique o que a lambda abaixo faz:
session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
  Indica a ação que será realizada.
