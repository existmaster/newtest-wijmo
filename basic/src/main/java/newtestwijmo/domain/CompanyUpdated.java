package newtestwijmo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import newtestwijmo.domain.*;
import newtestwijmo.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CompanyUpdated extends AbstractEvent {

    private UUID companyId;
    private String name;
    private String industry;
    private LocalDate foundedDate;

    public CompanyUpdated(Company aggregate) {
        super(aggregate);
    }

    public CompanyUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
