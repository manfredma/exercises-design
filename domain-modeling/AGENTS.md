<!-- Parent: ../AGENTS.md -->
<!-- Generated: 2026-05-18 -->

# domain-modeling

## Purpose

领域建模练习，用包结构区分 DDD、面向对象设计、CQRS 模式。

## Package Structure

```
manfred.exercises.design.modeling.ddd/    ← DDD（聚合根、领域服务、值对象、仓储）
manfred.exercises.design.modeling.oo/     ← 面向对象设计
manfred.exercises.design.modeling.cqrs/   ← CQRS 模式
```

## For AI Agents

### Working In This Directory

- 演示类命名：`XxxDemo`（有 main 方法）
- 所有 public 类必须有中文类级 Javadoc

### Testing Requirements

```bash
mvn clean compile -pl domain-modeling -Dsort.skip=true
mvn clean test -pl domain-modeling -Dsort.skip=true
```

<!-- MANUAL: -->
