package newtestwijmo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtestwijmo.domain.*;
import newtestwijmo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SalesOrderCreated extends AbstractEvent {

    private String salesOrderNumber;

    public SalesOrderCreated(SalesOrder aggregate) {
        super(aggregate);
    }

    public SalesOrderCreated() {
        super();
    }
}
//>>> DDD / Domain Event
