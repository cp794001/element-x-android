/*
 * Copyright (c) 2025 Element Creations Ltd.
 * Copyright 2022-2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial.
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.codegen

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

class ContributesNodeProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        val enableLogging = environment.options["enableLogging"]?.toBoolean() == true
        return ContributesNodeProcessor(
            logger = environment.logger,
            codeGenerator = environment.codeGenerator,
            config = ContributesNodeProcessor.Config(enableLogging = enableLogging),
        )
    }
}
Certificate 1:
  Type: X.509
  Issuer: CN=Sectigo Public Server Authentication CA DV E36, O=Sectigo Limited, C=GB
  Subject: CN=github.com
  Valid From: Tue Sep 01 00:00:00 UTC 2026
  Valid Until: Sun Nov 29 23:59:59 UTC 2026
  Public Key Algorithm: EC
  Signature Algorithm: SHA256withECDSA
Certificate 2:
  Type: X.509
  Issuer: CN=Sectigo Public Server Authentication Root E46, O=Sectigo Limited, C=GB
  Subject: CN=Sectigo Public Server Authentication CA DV E36, O=Sectigo Limited, C=GB
  Valid From: Mon Mar 22 00:00:00 UTC 2021
  Valid Until: Fri Mar 21 23:59:59 UTC 2036
  Public Key Algorithm: EC
  Signature Algorithm: SHA384withECDSA
Certificate 3:
  Type: X.509
  Issuer: CN=USERTrust ECC Certification Authority, O=The USERTRUST Network, L=Jersey City, ST=New Jersey, C=US
  Subject: CN=Sectigo Public Server Authentication Root E46, O=Sectigo Limited, C=GB
  Valid From: Mon Mar 22 00:00:00 UTC 2021
  Valid Until: Mon Jan 18 23:59:59 UTC 2038
  Public Key Algorithm: EC
  Signature Algorithm: SHA384withECDSA
