package com.xwoekz.quarkus.service;

import com.xwoekz.quarkus.dto.ShowroomDTO;

public interface ShowroomService {
      boolean validateAndThenSave(ShowroomDTO dto);
}
