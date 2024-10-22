package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String userid;
    private String productName;
    private String productid;
    private Integer qty;
    private String status;
    private String address;
}
