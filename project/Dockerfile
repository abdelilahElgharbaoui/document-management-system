# Étape 1 : Construire l'application React
FROM node:18 AS build
WORKDIR /app

# Copier les fichiers package.json et installer les dépendances
COPY package*.json ./
RUN npm install

# Copier le reste des fichiers et construire l'application
COPY . ./
RUN npm run build

# Étape 2 : Utiliser Nginx pour servir les fichiers
FROM nginx:latest
COPY --from=build /app/dist /usr/share/nginx/html

# Exposer le port 80
EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
