package com.kodlama.io.rentacar.business.abstracts;

import com.kodlama.io.rentacar.business.dto.requests.create.CreateMaintenanceRequest;
import com.kodlama.io.rentacar.business.dto.requests.update.UpdateMaintenanceRequest;
import com.kodlama.io.rentacar.business.dto.responses.create.CreateMaintenanceResponse;
import com.kodlama.io.rentacar.business.dto.responses.get.GetAllMaintenancesResponse;
import com.kodlama.io.rentacar.business.dto.responses.get.GetMaintenanceResponse;
import com.kodlama.io.rentacar.business.dto.responses.update.UpdateMaintenanceResponse;

import java.util.List;

public interface MaintenanceService {
    List<GetAllMaintenancesResponse> getAll();
    GetMaintenanceResponse getById(int id);
    CreateMaintenanceResponse add(CreateMaintenanceRequest createMaintenanceRequest);
    UpdateMaintenanceResponse update(UpdateMaintenanceRequest updateMaintenanceRequest);
    void delete(int id);
    GetMaintenanceResponse returnCarFromMaintenance(int carId);
}
