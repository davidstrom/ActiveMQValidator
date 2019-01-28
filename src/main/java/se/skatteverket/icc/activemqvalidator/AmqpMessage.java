package se.skatteverket.icc.activemqvalidator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmqpMessage {
    private String to;
    private String body;
}
