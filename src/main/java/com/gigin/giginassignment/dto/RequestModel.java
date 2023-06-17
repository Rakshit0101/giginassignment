package com.gigin.giginassignment.dto;

import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class RequestModel {
    @NonNull
    String emailId;
    @NotNull
    String password;

}
