package br.userauthjwt.authjwt.service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class studentNotFoundFields {

    private Long timestamp;
    private Integer err;
    private String message;
    private String path;

}
