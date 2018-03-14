/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.declarations.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.FirTypeParameter
import org.jetbrains.kotlin.fir.expressions.FirAnnotationCall
import org.jetbrains.kotlin.fir.types.FirType
import org.jetbrains.kotlin.ir.declarations.IrDeclarationKind
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.types.Variance

class FirTypeParameterImpl(
    override val session: FirSession,
    override val psi: PsiElement?,
    override val name: Name,
    override val variance: Variance
) : FirTypeParameter {
    override val declarationKind = IrDeclarationKind.TYPE_PARAMETER

    override val bounds = mutableListOf<FirType>()

    override val annotations = mutableListOf<FirAnnotationCall>()
}