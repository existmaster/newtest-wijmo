package newtestwijmo.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newtestwijmo.SalesApplication;
import newtestwijmo.domain.SalesOrderCreated;
import newtestwijmo.domain.SalesOrderDeleted;

@Entity
@Table(name = "SalesOrder_table")
@Data
//<<< DDD / Aggregate Root
public class SalesOrder {

    @Id
    private String salesOrderNumber;

    private String salesPerson;

    @Embedded
    private CompanyId companyId;

    private String salesType;

    @ElementCollection
    private List<SalesItem> salesItems;

    @PostPersist
    public void onPostPersist() {
        SalesOrderCreated salesOrderCreated = new SalesOrderCreated(this);
        salesOrderCreated.publishAfterCommit();

        SalesOrderDeleted salesOrderDeleted = new SalesOrderDeleted(this);
        salesOrderDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SalesOrderRepository repository() {
        SalesOrderRepository salesOrderRepository = SalesApplication.applicationContext.getBean(
            SalesOrderRepository.class
        );
        return salesOrderRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateSalesOrder(
        UpdateSalesOrderCommand updateSalesOrderCommand
    ) {
        //implement business logic here:

        SalesOrderUpdated salesOrderUpdated = new SalesOrderUpdated(this);
        salesOrderUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
