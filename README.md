# Santander Dev Week
Java RESTful API criada para a santander dev week.

## Diagrama de Classes

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Double balance
    -Double limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Double limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "n" Feature
  User "1" *-- "1" Card
  User "1" *-- "n" News
