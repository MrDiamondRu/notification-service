package ru.rtk.service.notificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rtk.service.notificationservice.domain.Sms;

import java.util.List;
import java.util.UUID;

/**
 * Интерфейс репозитория сообщений
 *
 * @author rnikonov
 */
@Repository
public interface SmsRepository extends JpaRepository<Sms, UUID> {

    List<Sms> findByCodeOrderByIdDesc(String text);

    List<Sms> findByCodeOrderByDateDesc(String code);

    List<Sms> findByCodeAndSpamFalseOrderByDateDesc(String code);

}
