package com.andrew.jpa;


import com.andrew.domain.GoodInfoBean;
import com.andrew.domain.GoodTypeBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodInfoJPA
        extends JpaRepository<GoodInfoBean,Long>
{
}
