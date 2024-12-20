package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.Achievement
import com.hyunjin.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository:JpaRepository<HttpInterface, Long> {
}