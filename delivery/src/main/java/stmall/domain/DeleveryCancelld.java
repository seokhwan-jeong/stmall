package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeleveryCancelld extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String productName;
    private String productid;
    private Integer qty;
    private String address;
    private String status;

    public DeleveryCancelld(Delivery aggregate) {
        super(aggregate);
    }

    public DeleveryCancelld() {
        super();
    }
}
//>>> DDD / Domain Event
