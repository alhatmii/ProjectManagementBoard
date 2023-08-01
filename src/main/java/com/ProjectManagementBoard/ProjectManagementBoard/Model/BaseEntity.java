package com.ProjectManagementBoard.ProjectManagementBoard.Model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
// To auto generate Getter & Setter for Properties
@Getter
@Setter
@MappedSuperclass // Main Class "Inheritance", To Make sure That No repetition In The Code.
public class BaseEntity {
    // Creates Date
    @CreatedDate
    Date createDate;
    // Update up tp date
    @UpdateTimestamp
    Date updateDate;
    Boolean isActive;
}
