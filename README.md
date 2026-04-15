![Modifold Banner](https://modifold.com/images/banner.png?v=3)

# Modifold Analytics Plugin

This repository is an example of integrating ModifoldAnalytics into your Hytale mod/plugin.

After integration, extended mod analytics will appear on your project Analytics page at `https://modifold.com/`.

## Tech

- Java 25
- Maven
- Gson

## Build

```bash
mvn clean package
```

Output JAR will be in `target/`.

## Quick Integration

Use it in your plugin setup:

```java
new ModifoldAnalytics("optimized-somehow", "1.0.0");
```

Where:
- `optimized-somehow` is your `projectSlug`
- `1.0.0` is your plugin version