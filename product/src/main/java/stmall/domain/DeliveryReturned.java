package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String productName;
    private String productid;
    private Integer qty;
    private String address;
    private String status;
}
