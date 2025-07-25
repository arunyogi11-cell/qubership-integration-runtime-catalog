/*
 * Copyright 2024-2025 NetCracker Technology Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.qubership.integration.platform.runtime.catalog.model.exportimport.instructions;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Import instructions response object")
public class GeneralImportInstructionsDTO {

    @Schema(description = "Chain import instructions object")
    private ChainImportInstructionsDTO chains;
    @Schema(description = "Service import instructions object")
    private ImportInstructionsDTO services;
    @Schema(description = "Specification groups import instructions object")
    private ImportInstructionsDTO specificationGroups;
    @Schema(description = "Specification import instructions object")
    private ImportInstructionsDTO specifications;
    @Schema(description = "Common variable import instructions object")
    private ImportInstructionsDTO commonVariables;
}
