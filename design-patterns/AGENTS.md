<!-- Parent: ../AGENTS.md -->
<!-- Generated: 2026-05-18 -->

# design-patterns

## Purpose

GoF 23 种设计模式练习，按创建型、结构型、行为型分子模块组织。

## Key Files

| File | Description |
|------|-------------|
| `pom.xml` | 聚合 POM，管理 creational/structural/behavioral/context-pattern |
| `creational/` | 创建型模式：singleton、factory、abstract-factory、builder、prototype |
| `structural/` | 结构型模式：adapter、bridge、composite、decorator、facade、flyweight、proxy |
| `behavioral/` | 行为型模式：strategy、observer、command、iterator、template 等 |
| `context-pattern/` | Context 模式 |

## For AI Agents

### Working In This Directory

- 包名格式：`manfred.exercises.design.<pattern-category>.<pattern-name>`
  - 示例：`manfred.exercises.design.creational.singleton`
- 每个模式一个包，包含 Demo 类（main 方法）和相关模型/实现类

### Testing Requirements

```bash
mvn clean compile -pl design-patterns/creational -Dsort.skip=true
mvn clean compile -pl design-patterns/structural -Dsort.skip=true
mvn clean compile -pl design-patterns/behavioral -Dsort.skip=true
```

<!-- MANUAL: -->
