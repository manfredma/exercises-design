<!-- Parent: ../AGENTS.md -->
<!-- Generated: 2026-05-18 -->

# arch-patterns

## Purpose

架构模式练习，用包结构区分 DCI、分层架构、正交设计。

## Package Structure

```
manfred.exercises.design.arch.dci/          ← DCI 架构（context/domain/rolemap）
manfred.exercises.design.arch.layered/      ← 分层架构
manfred.exercises.design.arch.orthogonal/   ← 正交设计
```

## For AI Agents

### Working In This Directory

- DCI 模式包含 context/domain/rolemap 三层子包
- 演示类命名：`XxxDemo`（有 main 方法）
- 所有 public 类必须有中文类级 Javadoc

### Testing Requirements

```bash
mvn clean compile -pl arch-patterns -Dsort.skip=true
mvn clean test -pl arch-patterns -Dsort.skip=true
```

<!-- MANUAL: -->
