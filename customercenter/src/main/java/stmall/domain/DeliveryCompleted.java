package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String productName;
    private String productid;
    private Integer qty;
    private String address;
    private String status;
}
