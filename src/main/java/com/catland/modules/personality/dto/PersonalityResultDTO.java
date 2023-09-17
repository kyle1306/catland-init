package com.catland.modules.personality.dto;

import com.catland.common.enums.PersonalityTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/9/2 11:03 下午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonalityResultDTO {
    private String code;
    private String name;
    private String desc;

    public static PersonalityResultDTO convertDTO(PersonalityTypeEnum personality) {
        PersonalityResultDTO.PersonalityResultDTOBuilder builder = PersonalityResultDTO.builder();
        return builder.code(personality.getCode()).name(personality.getName()).build();
    }
}
