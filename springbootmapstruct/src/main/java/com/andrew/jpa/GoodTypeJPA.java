package com.andrew.jpa;

import com.andrew.domain.GoodTypeBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodTypeJPA
        extends JpaRepository<GoodTypeBean,Long>
{
}