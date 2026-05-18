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

### design-patterns — GoF 设计模式

包结构：`manfred.exercises.design.<category>.<pattern>`

| 分类 | 包 | 模式 |
|------|----|------|
| 创建型 | `creational` | singleton（5种实现）、factory、abstractfactory |
| 结构型 | `structural` | adapter（class/object）、bridge、composite、decorator、facade、filter、flyweight、proxy |
| 行为型 | `behavioral` | chainofresponsibility、command、interpreter（含arithmetic子包）、iterator、mediator、memento、observer、state（含vote子包）、strategy、template、visitor（含bill子包） |
| 其他 | `other` | blackboard（v1/v2）、businessdelegate、frontcontroller、mvc、typeobject |

### arch-patterns — 架构模式

包结构：`manfred.exercises.design.arch.<pattern>`

| 包 | 内容 |
|----|------|
| `dci` | DCI 架构：context/domain/rolemap 三层，含测试 |
| `layered` | 分层架构示例 |
| `orthogonal` | 正交设计示例，含测试 |

### domain-modeling — 领域建模

包结构：`manfred.exercises.design.modeling.<topic>`

| 包 | 内容 |
|----|------|
| `ddd` | DDD 示例入口（待扩充） |
| `oo` | 面向对象设计（待迁移） |
| `cqrs` | CQRS 模式（待迁移） |

## For AI Agents

### Working In This Directory

- 包名格式：`manfred.exercises.design.<category>.<pattern>`
- 演示类命名：`XxxDemo`（有 main 方法）
- 不在 `src/main/java` 中使用 `@Test` 注解
- 所有 public 类必须有中文类级 Javadoc
- 无 `@author`/`@date` 等元数据注释
- 子模块 pom 不写 `<version>`，版本统一在根 pom 管理

### 包内分层规范

```
xxx/         ← Demo 类（有 main 方法，演示入口）
xxx.model/   ← 模型/数据类
xxx.impl/    ← 接口实现类
xxx.util/    ← 工具类
```

### Testing Requirements

```bash
mvn clean compile -Dsort.skip=true
mvn clean test -Dsort.skip=true
mvn clean compile -pl design-patterns -Dsort.skip=true
mvn clean compile -pl arch-patterns -Dsort.skip=true
mvn clean compile -pl domain-modeling -Dsort.skip=true
```

### Common Patterns

- 父 POM 集中管理依赖版本，子模块按需引用无需写版本号
- 测试框架：JUnit 4
- 每个模式对应一个独立演示类（`XxxPatternDemo`）+ 可选测试类

## Dependencies（根 pom 管理）

| 依赖 | 版本 | 用途 |
|------|------|------|
| `junit:junit` | 4.13.1 | 测试框架（scope=test） |
| `org.mockito:mockito-core` | 2.23.0 | Mock（scope=test） |
| `org.apache.polygene.*` | 3.0.0 | DCI 架构框架（arch-patterns/dci） |
| `org.ow2.asm:asm*` | 5.2 | Polygene 依赖 |
| `org.apache.johnzon:johnzon-core` | 1.1.1 | Polygene 依赖 |

<!-- MANUAL: -->
