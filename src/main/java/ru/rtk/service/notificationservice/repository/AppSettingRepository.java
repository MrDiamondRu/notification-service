package ru.rtk.service.notificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rtk.service.notificationservice.domain.AppSettings;

/**
 * Интерфейс репозитория настроек приложения
 *
 * @author rnikonov
 */
@Repository
public interface AppSettingRepository extends JpaRepository<AppSettings,Integer> {

}
