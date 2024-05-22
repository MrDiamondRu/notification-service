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
 * Сообщение
 *
 * @author rnikonov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sms {

    /**
     * id записи
     */
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    /**
     * номер телефона
     */
    private String phone;

    /**
     * текст сообщения
     */
    private String text;

    /**
     * тип сообщения
     */
    private int flash;

    /**
     * дата
     */
    private Instant date;

    /**
     * статус отправки
     */
    private boolean status;

    /**
     * флаг спам сообщения
     */
    private boolean spam;

    /**
     * номер задачи
     */
    private String code;
}

