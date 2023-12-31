package com.rainbowbridge.reborn.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecommendedProductListDto {

    private String imagePath;

    private Long companyId;

    private String companyName;

    private Long productId;

    private String productName;

    private int price;

}
