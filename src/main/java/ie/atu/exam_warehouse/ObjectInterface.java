package ie.atu.exam_warehouse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "object",url = "http://localhost:8080")
public interface ObjectInterface {
    @PostMapping("/getWarehouseById")
    void getWarehouseById(@RequestBody WarehouseObject warehouseObject );

}
