package newtestwijmo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtestwijmo.domain.*;
import newtestwijmo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CompanyDeleted extends AbstractEvent {

    private UUID companyId;

    public CompanyDeleted(Company aggregate) {
        super(aggregate);
    }

    public CompanyDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
