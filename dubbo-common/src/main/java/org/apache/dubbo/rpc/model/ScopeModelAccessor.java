/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.rpc.model;

/**
 * 作用域模型的访问器, 可以用于接口默认方法来 获取 作用域模型
 * An accessor for scope model, it can be use in interface default methods to get scope model.
 */
public interface ScopeModelAccessor {

    ScopeModel getScopeModel();

    default FrameworkModel getFrameworkModel() {
        return ScopeModelUtil.getFrameworkModel(getScopeModel());
    }

    default ApplicationModel getApplicationModel() {
        return ScopeModelUtil.getApplicationModel(getScopeModel());
    }

    default ModuleModel getModuleModel() {
        return ScopeModelUtil.getModuleModel(getScopeModel());
    }

}
