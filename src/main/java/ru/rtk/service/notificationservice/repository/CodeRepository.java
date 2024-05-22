package ru.rtk.service.notificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rtk.service.notificationservice.domain.Code;

import java.util.List;
import java.util.UUID;

/**
 * Интерфейс репозитория задач на отправку уведомлений
 *
 * @author rnikonov
 */
@Repository
public interface CodeRepository extends JpaRepository<Code, UUID> {

    Code findByNumber(String number);

    List<Code> findByOrderByDateOfLastActivityDesc();

}
