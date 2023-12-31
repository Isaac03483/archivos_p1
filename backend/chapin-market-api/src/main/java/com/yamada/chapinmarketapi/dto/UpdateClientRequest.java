package com.yamada.chapinmarketapi.dto;

import jakarta.validation.constraints.NotNull;

public record UpdateClientRequest(@NotNull ClientDTO clientInfo, @NotNull AuthRequest adminAuth) {

}
