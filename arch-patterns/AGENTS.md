<!-- Parent: ../AGENTS.md -->
<!-- Generated: 2026-05-18 -->

# arch-patterns

## Purpose

架构模式练习：DCI 架构、分层架构、正交设计。

## Key Files

| File | Description |
|------|-------------|
| `pom.xml` | 聚合 POM，管理 dci/layered/orthogonal |
| `dci/` | DCI 架构（Data、Context、Interaction）示例 |
| `layered/` | 分层架构示例 |
| `orthogonal/` | 正交设计示例 |

## For AI Agents

### Working In This Directory

- 包名格式：`manfred.exercises.design.arch.<pattern-name>`
  - 示例：`manfred.exercises.design.arch.dci`
- DCI 模式包含 context/domain/rolemap 三层子包

### Testing Requirements

```bash
mvn clean compile -pl arch-patterns/dci -Dsort.skip=true
mvn clean compile -pl arch-patterns/layered -Dsort.skip=true
mvn clean compile -pl arch-patterns/orthogonal -Dsort.skip=true
```

<!-- MANUAL: -->
