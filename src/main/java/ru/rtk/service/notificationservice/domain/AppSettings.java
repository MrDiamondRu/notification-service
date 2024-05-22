package ru.rtk.service.notificationservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Настройки приложения
 *
 * @author rnikonov
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppSettings {

    /**
     * id записи
     */
    @Id
    private Integer id;

    /**
     * путь поиска файлов сообщений
     */
    private String msgPath;

    /**
     * таймаут "спам" сообщений
     */
    private int timeOut;

    /**
     * статус работы приложения
     */
    private boolean workStatus;

}

