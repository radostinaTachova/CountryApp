# 🌍 CountryApp — Powered by REST Countries API

This is a simple Android application built with **Jetpack Compose** and **Kotlin**, using the [REST Countries API](https://restcountries.com/) to display a list of countries based on user input.

## 🔍 Features

- Real-time search bar: dynamically filters countries as the user types.
- Displays essential country information such as name, flag, and region.
- Clean and modern UI powered by Jetpack Compose.

## 🧱 Architecture

The app follows a **layered architecture** inspired by Android's Clean Architecture + MVVM.

### Project Structure

- `data`: Contains DTOs, Retrofit service, and repository implementations.
- `ui`: Composable views and ViewModels.

> The `domain` layer has been omitted intentionally due to the simplicity of the project. Introducing it would add unnecessary complexity for this use case.

📌 A conceptual overview of the architecture is illustrated below:

![2](https://github.com/user-attachments/assets/5466c6c7-6c54-4061-a0ec-ba26a9db2a1f)

## 🛠️ Tech Stack

- **Kotlin**
- **Jetpack Compose** — Declarative UI toolkit
- **MVVM** — Model-View-ViewModel pattern
- **Dagger Hilt** — Dependency injection
- **Retrofit** — HTTP client for API communication
- **Coroutines + Flow** — Asynchronous and reactive programming

## 🧪 Future Improvements


