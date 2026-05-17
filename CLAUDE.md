# exercises-design

设计模式、架构模式、领域建模相关练习项目，从 `manfredma/exercises` 迁移重构而来。

## 项目背景

本项目从 `manfredma/exercises` 拆分，对应原项目中以下模块：

| 原模块 | 迁移目标模块 | 说明 |
|--------|-------------|------|
| `design-pattern/` | `design-patterns/` | GoF 23 种设计模式 |
| `arch-pattern/` | `arch-patterns/` | DCI、分层架构、正交设计等架构模式 |
| `model_design/` | `domain-modeling/` | DDD、OO、CQRS、四色建模等 |
| `design-patterns/context-pattern/` | `design-patterns/context-pattern/` | Context 模式（已在 exercises 中重构完成） |

参考仓库：`manfredma/exercises-java-core`（已完成迁移重构，可作为结构标准）

## 目标项目结构

```
exercises-design/
├── pom.xml                    ← 父 POM
├── design-patterns/           ← GoF 设计模式
│   ├── creational/            ← 创建型（singleton、factory、builder 等）
│   ├── structural/            ← 结构型（adapter、decorator、proxy 等）
│   ├── behavioral/            ← 行为型（strategy、observer、visitor 等）
│   └── context-pattern/       ← Context 模式（已有完整实现）
├── arch-patterns/             ← 架构模式
│   ├── dci/                   ← DCI 架构
│   ├── layered/               ← 分层架构
│   └── orthogonal/            ← 正交设计
└── domain-modeling/           ← 领域建模
    ├── ddd/                   ← DDD 示例
    ├── oo/                    ← 面向对象设计
    └── cqrs/                  ← CQRS 模式
```

## 迁移说明

- 源仓库：`git@github.com:manfredma/exercises.git`
- 源模块路径：`design-pattern/`、`arch-pattern/`、`model_design/`
- 迁移原则：参考 `exercises-java-core` 的重构方式，按主题重新组织包结构
- 包名格式：`manfred.exercises.design.<topic>`

## 包内分层规范

```
xxx/              ← Demo 类（有 main 方法，演示入口）
xxx.model/        ← 模型/数据类
xxx.impl/         ← 接口实现类
xxx.util/         ← 工具类
```

## 代码规范

- 包名格式：`manfred.exercises.design.<pattern>.<topic>`
- 演示类命名：`XxxDemo`（有 main 方法）
- 不在 `src/main/java` 中使用 `@Test` 注解
- 所有 public 类必须有中文类级 Javadoc
- 无 `@author`/`@date` 等元数据注释
- 子模块 pom 不写 `<version>`，版本统一在根 pom 管理

## 构建命令

```bash
mvn clean compile -Dsort.skip=true
mvn clean test -Dsort.skip=true
mvn clean compile -pl design-patterns -Dsort.skip=true
```

## 子模块 pom.xml 模板

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>manfred.end</groupId>
        <artifactId>exercises-design</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>
    <artifactId>my-module</artifactId>
</project>
```
