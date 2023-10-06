package newtestwijmo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtestwijmo.domain.*;
import newtestwijmo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SalesOrderUpdated extends AbstractEvent {

    private String salesOrderNumber;

    public SalesOrderUpdated(SalesOrder aggregate) {
        super(aggregate);
    }

    public SalesOrderUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
