/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package manfred.exercises.design.arch.dci.domain.data;

import org.apache.polygene.api.common.UseDefaults;
import org.apache.polygene.api.injection.scope.State;
import org.apache.polygene.api.mixin.Mixins;
import org.apache.polygene.api.property.Property;
import org.apache.polygene.library.constraints.annotation.GreaterThan;

/**
 * 账户余额数据接口，维护任意类型账户的余额。
 * 方法名使用过去时，代表事件。仅做最低限度的合理性校验，
 * 由调用角色决定是否允许执行变更。
 */
@Mixins(BalanceData.Mixin.class)
public interface BalanceData {
    void increasedBalance(@GreaterThan(0) Integer amount);

    void decreasedBalance(@GreaterThan(0) Integer amount);

    Integer getBalance();

    // Default implementation

    class Mixin implements BalanceData {
        @State
        @UseDefaults
        Property<Integer> balance;

        public void increasedBalance(Integer amount) {
            balance.set(balance.get() + amount);
        }

        public void decreasedBalance(Integer amount) {
            balance.set(balance.get() - amount);
        }

        public Integer getBalance() {
            return balance.get();
        }
    }
}
