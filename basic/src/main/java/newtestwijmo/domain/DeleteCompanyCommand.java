package newtestwijmo.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DeleteCompanyCommand {

    private UUID companyId;
}
