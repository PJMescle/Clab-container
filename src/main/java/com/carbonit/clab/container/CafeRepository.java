package com.carbonit.clab.container;

import com.carbonit.clab.container.controller.CafeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeRepository extends JpaRepository<CafeEntity, Long> {
}
