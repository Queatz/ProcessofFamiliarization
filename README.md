# Process of Familiarization

A single-purpose web app for deep language-phrase familiarization sessions.

## Modules

| Module | Role |
|--------|------|
| `:web` | Compose HTML frontend (Kotlin/JS) |
| `:core` | Shared models and business logic (JVM + JS) |
| `:server` | Ktor backend (JVM) |

## Prerequisites

- JDK 17+
- A modern browser for the web UI

## Build

```bash
./gradlew build
```

## Run the web frontend

```bash
./gradlew :web:jsBrowserDevelopmentRun
```

## Run the server

```bash
./gradlew :server:run
```

Server listens on [http://0.0.0.0:8080](http://0.0.0.0:8080) by default.

## Theme

The web UI ships with system light/dark support via `prefers-color-scheme` in `Styles.kt`.
`html` and `body` pick up background/foreground tokens automatically.
