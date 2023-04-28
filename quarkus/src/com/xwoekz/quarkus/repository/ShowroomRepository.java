package com.xwoekz.quarkus.repository;

import com.xwoekz.quarkus.dto.ShowroomDTO;

public interface ShowroomRepository {
       boolean save(ShowroomDTO dto);
}
