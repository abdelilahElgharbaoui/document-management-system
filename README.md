# Document Management System

## Overview
The Document Management System is a microservices-based application that allows users to manage documents, share them with other users, and control access. The system includes key services for document handling, user management, and document sharing. Additionally, it utilizes Eureka for service discovery, an API Gateway for routing requests, and a dedicated Security microservice to manage access controls.

## Microservices

1. **Document Service**
   - Manages document creation, updating, and deletion.
   - Attributes: `Document(id, titre, contenu, propriétaire_id)`

2. **User Service**
   - Manages user information and operations.
   - Attributes: `Utilisateur(id, nom, email)`

3. **Share Service**
   - Manages sharing of documents between users.
   - Attributes: `Partage(id, document_id, utilisateur_id)`

## Additional Components

- **Eureka**: Service discovery for dynamic registration of microservices.
- **API Gateway**: Centralized API Gateway for routing and controlling requests to services.
- **Security Microservice**: Manages user authentication and authorization.

## Features

- **Document Management**: Create, view, update, and delete documents.
- **User Management**: Manage users and their credentials.
- **Document Sharing**: Share documents with other users securely.
- **Authentication and Authorization**: Role-based access control for secure document sharing.

## Technologies

- **Spring Boot**: For microservices.
- **Eureka**: Service discovery.
- **Spring Cloud Gateway**: API Gateway.
- **Spring Security**: For managing access control and security.
- **MySQL/PostgreSQL**: Database for storing users, documents, and shares.
- **Docker** (optional): For containerized deployment.

## Getting Started

### Prerequisites
- **Java 11 or later**
- **Maven**
- **Docker** (optional)
- **MySQL/PostgreSQL** database setup

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/document-management-system.git
