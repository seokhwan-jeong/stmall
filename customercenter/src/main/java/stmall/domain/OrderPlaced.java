package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productName;
    private String productid;
    private Integer qty;
    private String status;
    private String address;
}
