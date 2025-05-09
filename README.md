#  Pharmacy Product Management API

## Project Context

To support the opening of a new pharmacy, the founder faces challenges managing and organizing stock products. To address this, a REST API built with Spring Boot has been developed to efficiently manage pharmacy products, reducing time spent on product lookup and stock updates.

##  Features

As the pharmacy founder, I want to:

- **Add** new products to the database with details like name, quantity, price, and description. The product ID must be generated automatically.
- **Update** product information to correct errors or make changes (e.g., quantity or price).
- **Delete** products that are no longer needed or are obsolete.
- **View** the complete list of available products in the inventory.

---

## 🛠️ Technologies Used

| Technology    | Purpose                                 |
|---------------|------------------------------------------|
| Spring Boot   | Backend application framework            |
| Spring Data JPA | Database interaction layer               |
| Hibernate     | ORM for object-relational mapping        |
| Lombok        | Reduce boilerplate code (getters/setters)|
| MySQL         | Database (H2 used for in-memory testing) |
| Postman       | API testing tool                         |

---

## Project Structure

```bash
src
└── main
    └── java
        └── com.pharmacy.api
            ├── controller
            │   └── ProductController.java
            ├── entities
            │   └── Produit.java
            └── repository
                └── ProductRepository.java


```
---
## Author :
- ***Majd Eddine Oumanni***
