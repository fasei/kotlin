/*
 * Copyright 2010-2017 JetBrains s.r.o.
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

package org.jetbrains.kotlin.ir.symbols.impl

import org.jetbrains.kotlin.descriptors.ClassKind
import org.jetbrains.kotlin.descriptors.Modality
import org.jetbrains.kotlin.descriptors.Visibility
import org.jetbrains.kotlin.ir.declarations.IrClass
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.types.KotlinType

class IrClassSymbolImpl(
        name: Name,
        modality: Modality,
        visibility: Visibility,
        override val kind: ClassKind,
        override val supertypes: List<KotlinType>,
        override val isData: Boolean,
        override val isCompanionObject: Boolean
) : IrClassifierSymbolBase(name, modality, visibility), IrClassSymbol {
    override lateinit var declaration: IrClass
}