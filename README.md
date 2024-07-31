# Paint App

A web-based drawing application inspired by Microsoft Paint, built with Vue.js and Spring Boot. The application provides a simple and intuitive interface for users to create digital drawings with various tools, colors, and features.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Design Patterns](#design-patterns)

## Features

- **Drawing Canvas**: A responsive canvas for drawing, featuring various tools like brush, shapes, text, and eraser.
- **Color Palette**: Choose from a wide range of colors to enhance your artwork.
- **Tool Options**: Customize brush size, shape, and other tool properties.
- **File Management**: Save, load images in various formats.
- **Undo/Redo**: Easily undo and redo actions.
- **User Authentication**: Secure login and registration for personalized experiences.

## Technologies Used

### Frontend
- [Vue.js](https://vuejs.org/) - JavaScript framework for building user interfaces.
- HTML5 Canvas - For rendering the drawing area.
- CSS3 - Styling the user interface.

### Backend
- [Spring Boot](https://spring.io/projects/spring-boot) - Java framework for building production-ready applications.


### Backend
- **Singleton Pattern**: Ensure a class has only one instance and provide a global point of access to it, such as for configuration settings.
- **Prototype Pattern**: Create new objects by copying an existing object, useful for creating tool instances with similar properties.
- **Factory Pattern**: Provide an interface for creating objects in a superclass but allow subclasses to alter the type of objects that will be created.
- **MVC Pattern**: Separation of concerns into Model, View, and Controller layers.
- **Service Layer Pattern**: Encapsulation of business logic within service classes.
