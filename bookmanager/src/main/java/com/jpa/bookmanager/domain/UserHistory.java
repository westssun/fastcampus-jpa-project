package com.jpa.bookmanager.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
//@EntityListeners(value = {MyEntityListener.class})
@EntityListeners(value = {AuditingEntityListener.class})
public class UserHistory implements Auditable {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;
    private String name;
    private String email;

    @CreatedDate /* AuditingEntityListener */
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}