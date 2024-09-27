# Gerenciador de Notas em Java com Injeção de Dependência

Este é um exemplo simples de um gerenciador de notas em Java que implementa injeção de dependência por construtor usando interfaces.

## Descrição

A aplicação permite:

- Adicionar notas
- Listar todas as notas
- Atualizar uma nota existente
- Remover uma nota

## Estrutura do Projeto

- `Note.java` - Modelo de dados para as notas.
- `NoteRepository.java` - Interface que define as operações do repositório de notas.
- `NoteRepositoryMemory.java` - Implementação em memória do repositório.
- `NoteService.java` - Serviço que utiliza o repositório de notas (injeção de dependência por construtor).
- `Main.java` - Classe principal para executar a aplicação.