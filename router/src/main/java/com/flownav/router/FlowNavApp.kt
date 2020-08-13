/*
 * Copyright 2019, Jeziel Lago - Alex Soares.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flownav.router

object FlowNavApp {

    private lateinit var entryMap: Map<String, EntryConfig>

    fun start(entryMap: Map<String, EntryConfig>) {
        require(entryMap.isNotEmpty()) { "entryMap must be required for start FlowNavApp." }
        this.entryMap = entryMap
    }

    internal fun getEntryMap() = entryMap
}

data class EntryConfig(
    val name: String,
    val id: Int = -1
)

internal fun Int.isNotDefaultId(): Boolean = (this != -1)
