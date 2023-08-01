package com.ProjectManagementBoard.ProjectManagementBoard.Model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
@Getter
@Setter
@MappedSuperclass // Main Class "Inheritance", To Make sure That No repetition In The Code.

public class BaseEntity {
    @CreatedDate
    Date createDate;
    @UpdateTimestamp
    Date updateDate;
    Boolean isActive;
}
