package com.yamada.chapinmarketapi.services;

import com.yamada.chapinmarketapi.dto.CardTypeDTO;
import com.yamada.chapinmarketapi.models.CardType;
import com.yamada.chapinmarketapi.repositories.CardTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CardTypeService {

    private CardTypeRepository cardTypeRepository;


    public Page<CardTypeDTO> getAllCardTypes(Pageable pageable) {
        return cardTypeRepository.findAll(pageable).map(CardTypeDTO::new);
    }

    public CardTypeDTO updateCardType(CardTypeDTO cardTypeDTO) {
        CardType cardType = cardTypeRepository.getReferenceById(cardTypeDTO.id());

        System.out.println("ENCONTRANDO REFERENCIA");
        cardType.update(cardTypeDTO);

        return cardTypeDTO;
    }
}
