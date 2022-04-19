package com.codegym.thi_module4_cuoi.repository;

import com.codegym.thi_module4_cuoi.model.Nation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationRepository extends PagingAndSortingRepository<Nation, Long> {
}
