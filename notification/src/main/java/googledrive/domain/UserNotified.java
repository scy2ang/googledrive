package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserNotified extends AbstractEvent {

    private Long id;

    public UserNotified(Notification aggregate){
        super(aggregate);
    }
    public UserNotified(){
        super();
    }
}
