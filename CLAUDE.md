# exercises-design

设计模式、架构模式、领域建模相关练习项目，从 `manfredma/exercises` 迁移重构而来。

## 项目背景

本项目从 `manfredma/exercises` 拆分，对应原项目中以下模块：

| 原模块                  | 迁移目标模块                  | 状态        |
|----------------------|-------------------------|-----------|
| `design-pattern/`    | `design-patterns/`      | 已完成       |
| `arch-pattern/`      | `arch-patterns/`        | 已完成       |
| `model_design/DDD/`  | `domain-modeling/ddd/`  | 已完成       |
| `model_design/OO/`   | `domain-modeling/oo/`   | 待迁移（源无代码） |
| `model_design/cqrs/` | `domain-modeling/cqrs/` | 待迁移（源无代码） |

## 项目结构

```
exercises-design/
├── pom.xml                    ← 父 POM，统一依赖版本管理
├── design-patterns/           ← GoF 设计模式（207 个类）
│   └── src/main/java/manfred/exercises/design/
│       ├── creational/        ← 创建型：singleton/factory/abstractfactory
│       ├── structural/        ← 结构型：adapter/bridge/composite/...
│       ├── behavioral/        ← 行为型：strategy/observer/command/...
│       └── other/             ← 其他：blackboard/mvc/typeobject/...
├── arch-patterns/             ← 架构模式
│   └── src/main/java/manfred/exercises/design/arch/
│       ├── dci/               ← DCI 架构（context/domain/rolemap）
│       ├── layered/           ← 分层架构
│       └── orthogonal/        ← 正交设计
└── domain-modeling/           ← 领域建模
    └── src/main/java/manfred/exercises/design/modeling/
        ├── ddd/               ← DDD 示例
        ├── oo/                ← 面向对象设计（待扩充）
        └── cqrs/              ← CQRS 模式（待扩充）
```

## 包内分层规范

```
xxx/              ← Demo 类（有 main 方法，演示入口）
xxx.model/        ← 模型/数据类
xxx.impl/         ← 接口实现类
xxx.util/         ← 工具类
```

## 代码规范

- 包名格式：`manfred.exercises.design.<category>.<pattern>`
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
mvn clean compile -pl arch-patterns -Dsort.skip=true
mvn clean compile -pl domain-modeling -Dsort.skip=true
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

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
        </dependency>
    </dependencies>
</project>
```
