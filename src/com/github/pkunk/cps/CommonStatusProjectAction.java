/*
  * Copyright 2000-2009 JetBrains s.r.o.
  * Copyright 2011 Alex B
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
package com.github.pkunk.cps;

import com.intellij.openapi.vcs.update.AbstractCommonUpdateAction;
import com.intellij.openapi.vcs.update.ActionInfo;
import com.intellij.openapi.vcs.update.ScopeInfo;

public class CommonStatusProjectAction extends AbstractCommonUpdateAction {
    public CommonStatusProjectAction() {
        super(ActionInfo.STATUS, ScopeInfo.PROJECT, true);
    }

    protected boolean filterRootsBeforeAction() {
        return false;
    }

}
