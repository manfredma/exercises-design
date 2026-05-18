<!-- Parent: ../AGENTS.md -->
<!-- Generated: 2026-05-18 -->

# domain-modeling

## Purpose

领域建模练习：DDD、面向对象设计、CQRS 模式。

## Key Files

| File | Description |
|------|-------------|
| `pom.xml` | 聚合 POM，管理 ddd/oo/cqrs |
| `ddd/` | DDD 示例（聚合根、领域服务、值对象等） |
| `oo/` | 面向对象设计示例 |
| `cqrs/` | CQRS 模式示例 |

## For AI Agents

### Working In This Directory

- 包名格式：`manfred.exercises.design.modeling.<topic>`
  - 示例：`manfred.exercises.design.modeling.ddd`
- DDD 模块遵循聚合根/领域服务/值对象/仓储的标准分层

### Testing Requirements

```bash
mvn clean compile -pl domain-modeling/ddd -Dsort.skip=true
mvn clean compile -pl domain-modeling/oo -Dsort.skip=true
mvn clean compile -pl domain-modeling/cqrs -Dsort.skip=true
```

<!-- MANUAL: -->
