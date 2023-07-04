# Cap01Task01
Components and dependency injection

## Módulo: Back end
DESAFIO : Criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete.

* Springboot 3.1.0
* Spring web
* Java 17

## Detalhes da implementação :

### Adicionar informações no console

Na classe principal basta implementar a classe: 
>> CommandLineRunner

e sobrescrever o método: 
>> run(String... args)

```java
@SpringBootApplication
public class Desafio1Cap1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Cap1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!!!");
	}
}
```