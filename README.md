# Aplicación de Mascotas con Menús y Fragments

## Descripción

Esta aplicación Android muestra una lista de mascotas usando `RecyclerView`, permitiendo calificarlas con íconos de huesos. Además, incorpora menús de opciones y estructura modular con `Fragments`.

---

## Características

### Parte 1: Lista de Mascotas

- Visualización de una lista de mascotas en `RecyclerView`.
- Cada mascota muestra su imagen, nombre y calificación representada con huesos amarillos.
- El ícono de hueso en blanco permite "raitear" mascotas.

### Parte 2: Menú con Action View

- Se ha añadido un botón en forma de estrella (Action View).
- Al hacer clic, se navega a una segunda `Activity` donde se muestran las 5 mascotas favoritas (hardcodeadas) en otro `RecyclerView`.
- Se incluye botón de retorno al `MainActivity`.

---

## Parte 3: Menús y Fragments

### Menú de Opciones

- Incluye las opciones:
  - **Contacto**: muestra un formulario con nombre, correo y mensaje. Al pulsar "Enviar Comentario", se utiliza la librería JavaMail para enviar el mensaje.
  - **Acerca de**: muestra una bio del desarrollador.

### Fragments y ViewPager

- El contenido principal está dividido en `Fragments` mostrados dentro de un `ViewPager`.
- Se creó un `Fragment` adicional de **Perfil de Mascota**:
  - Muestra imagen redonda de perfil (usando CircularImageView).
  - Muestra nombre de la mascota.
  - `RecyclerView` en forma de `GridLayout` con fotos y cantidad de calificaciones (huesos).

---

## Librerías Usadas

- [JavaMail para Android](https://java.net/projects/javamail/pages/Android)
- [lopspower/CircularImageView](https://github.com/lopspower/CircularImageView)

---

## Cómo ejecutar

1. Clona o descarga el proyecto desde GitHub.
2. Abre el proyecto en Android Studio.
3. Ejecuta el proyecto en un emulador o dispositivo físico.
4. Asegúrate de tener permisos de Internet y correo configurados si vas a probar el envío de mensajes.

---

## Autor

**Juan Esteban Franco Otálora**  
Desarrollador Android - Proyecto académico
