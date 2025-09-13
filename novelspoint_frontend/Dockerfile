FROM node:18 as build
WORKDIR /app
COPY package*.json ./
RUN npm ci
COPY . .
RUN npm run build -- --output-path=dist

FROM nginx:stable-alpine
COPY --from=build /app/dist /usr/share/nginx/html