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

## Installation In Your Mod

1. Add the class file to your mod source tree:
   - copy `src/main/java/com/modifold/ModifoldAnalytics.java` into your mod project
   - adjust the `package` line if your project uses a different package structure
2. Ensure Gson is available in your mod runtime/build.
3. Initialize analytics during your mod/plugin startup (setup/init phase):

```java
new ModifoldAnalytics("your-project-slug", "1.0.0");
```

4. Replace placeholders:
   - `your-project-slug` -> your Modifold project slug
   - `1.0.0` -> your current mod version

## Optional Markdown Embed

You can add a Markdown image with your online graph to the project page:

```md
![](https://api.modifold.com/analytics/optimized-somehow/embed)
```

You can enable dark theme by adding `?theme=dark`:

```md
![](https://api.modifold.com/analytics/optimized-somehow/embed?theme=dark)
```

Here `optimized-somehow` is your project slug.

![](https://api.modifold.com/analytics/optimized-somehow/embed)