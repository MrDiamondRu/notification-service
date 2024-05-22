package ru.rtk.service.notificationservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.Instant;
import java.util.UUID;

/**
 * Задача на отправку уведомлений
 *
 * @author rnikonov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Code {

    /**
     * id записи
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    /**
     * Номер
     */
    private String number;

    /**
     * Дата добавления
     */
    private Instant dateAdded;

    /**
     * Дата последней активности по номеру
     */
    private Instant dateOfLastActivity;

}
