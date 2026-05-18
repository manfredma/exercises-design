<!-- Generated: 2026-05-18 -->

# exercises-design

## Purpose

设计模式、架构模式、领域建模相关练习项目，从 `manfredma/exercises` 迁移重构而来。

## Key Files

| File | Description |
|------|-------------|
| `pom.xml` | 父 POM，统一依赖版本管理 |
| `CLAUDE.md` | AI Coding 规范：构建命令、模块约定、代码风格 |

## Module Map

### 设计模式（GoF 23 种）
`design-patterns/creational` — 创建型：singleton、factory、abstract-factory、builder、prototype
`design-patterns/structural` — 结构型：adapter、bridge、composite、decorator、facade、flyweight、proxy
`design-patterns/behavioral` — 行为型：chain-of-responsibility、command、iterator、mediator、memento、observer、state、strategy、template、visitor
`design-patterns/context-pattern` — Context 模式

### 架构模式
`arch-patterns/dci` — DCI 架构（Data、Context、Interaction）
`arch-patterns/layered` — 分层架构
`arch-patterns/orthogonal` — 正交设计

### 领域建模
`domain-modeling/ddd` — DDD 示例
`domain-modeling/oo` — 面向对象设计
`domain-modeling/cqrs` — CQRS 模式

## For AI Agents

### Working In This Directory

- 包名格式：`manfred.exercises.design.<pattern>.<topic>`
- 演示类命名：`XxxDemo`（有 main 方法）
- 不在 `src/main/java` 中使用 `@Test` 注解
- 所有 public 类必须有中文类级 Javadoc
- 无 `@author`/`@date` 等元数据注释
- 子模块 pom 不写 `<version>`，版本统一在根 pom 管理
- 修改根 `pom.xml` 时，只操作 `<dependencyManagement>` 和 `<modules>` 节

### 包内分层规范

```
xxx/         ← Demo 类（有 main 方法，演示入口）
xxx.model/   ← 模型/数据类
xxx.impl/    ← 接口实现类
xxx.util/    ← 工具类
```

### Testing Requirements

```bash
mvn clean test -Dsort.skip=true
mvn clean compile -pl design-patterns -Dsort.skip=true
mvn clean compile -pl arch-patterns -Dsort.skip=true
mvn clean compile -pl domain-modeling -Dsort.skip=true
```

### Common Patterns

- 父 POM 集中管理依赖版本，子模块按需引用无需写版本号
- 测试框架：JUnit 4
- 每个模式对应一个独立演示类 + 可选测试类

## Dependencies

- `junit:junit:4.13.1` — 测试框架
- `org.mockito:mockito-core:2.23.0` — Mock
- `com.google.guava:guava:30.1-jre` — Guava 工具库

<!-- MANUAL: -->
