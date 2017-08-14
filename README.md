# Comida Boteco

## Alunos
+ Jorge Luis Tavares Reis
+ Luiz Henrique Pegoraro

## Como iniciar?
```sh
git clone git@github.com:lPegz/inf-332-comida-boteco.git

cd comida-boteco

./mvnw clean install spring-boot:run
```
## Buildando em produção

### Docker
TBD

### Kubernetes
TBD

### Legacy
```sh
./mvnw clean install

java -jar target/comida-boteco-$VERSION.jar
```
