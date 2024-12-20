package com.hyunjin.portfolio.domain.repository

import com.hyunjin.portfolio.domain.entity.Achievement
import com.hyunjin.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository:JpaRepository<Link, Long> {
}