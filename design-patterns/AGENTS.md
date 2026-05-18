<!-- Parent: ../AGENTS.md -->
<!-- Generated: 2026-05-18 -->

# design-patterns

## Purpose

GoF 23 种设计模式练习，用包结构区分创建型/结构型/行为型/Context 模式。

## Package Structure

```
manfred.exercises.design.creational.<pattern>/   ← 创建型：singleton、factory、builder 等
manfred.exercises.design.structural.<pattern>/   ← 结构型：adapter、decorator、proxy 等
manfred.exercises.design.behavioral.<pattern>/   ← 行为型：strategy、observer、command 等
manfred.exercises.design.context/                ← Context 模式
```

## For AI Agents

### Working In This Directory

- 每个模式一个子包，包含 Demo 类（main 方法）和相关模型/实现类
- 演示类命名：`XxxDemo`（有 main 方法）
- 所有 public 类必须有中文类级 Javadoc

### Testing Requirements

```bash
mvn clean compile -pl design-patterns -Dsort.skip=true
mvn clean test -pl design-patterns -Dsort.skip=true
```

<!-- MANUAL: -->
