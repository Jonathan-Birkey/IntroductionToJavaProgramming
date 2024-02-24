# Introduction To Java Programing
Introduction to Java Programming and Data Structures Comprehensive Version 12 by Y. Daniel Liang

This is the textbook I used to first learn programming in 2016. After having graduated and working as a software engineer for a few years now I am working through this textbook as a way to self gauge how I have progressed in my programming abilities with Java.

[![Super-Linter](https://github.com/Jonathan-Birkey/IntroductionToJavaProgramming/actions/workflows/superlinter.yml/badge.svg)](https://github.com/marketplace/actions/super-linter)

## Notes
| Tool | Name | Version | Link |
|---|---|---|---|
| IDE  | Eclipse | 2023-12 R | <https://www.eclipse.org/downloads/packages/installer> |
| JVM  | Oracle Java JRE | 21.0.2 | Installed from Eclipse IDE installer |
| Code Formatter | google-java-format-eclipse-plugin | v1.20.0 | <https://github.com/google/google-java-format/releases/tag/v1.20.0> |

## google-java-format
This project uses the google-java-format-eclipse-plugin to do the code style formating. You can download the build jar file for the [releases page](https://github.com/google/google-java-format/releases/tag/v1.20.0). Once downloaded drap-and-drop the jar into your `Eclipse/Contents/Eclipse/dropin` folder.

Make sure you add the following lines to the end of your `eclipse.ini` file.

```ini
--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED
--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED
```
