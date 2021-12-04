package com.cg.product.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.product.model.Cart;
import com.cg.product.model.Item;

@Data
public class CartDto {
    private Long id;
    private String name;
    private List<ItemDto> itemsDto = new ArrayList<>();

    public static CartDto from(Cart cart){
        CartDto cartDto = new CartDto();
        cartDto.setId(cart.getId());
        cartDto.setName(cart.getName());
        //cartDto.setItemsDto(cart.getItems().stream().map(ItemDto::from).collect(Collectors.toList()));
        cartDto.setItemsDto(cart.getItems().stream().map(t -> ItemDto.from(t)).collect(Collectors.toList()));
        
        return cartDto;
    }
}
