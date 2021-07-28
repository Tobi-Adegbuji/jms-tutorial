package dev.tobiadegbuji.jmstutorial.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Message implements Serializable {

    //Good practice to use serialVersionId when implementing serialization
    static final long serialVersionUID = -343424532L;

    private UUID id;

    private String message;


}
