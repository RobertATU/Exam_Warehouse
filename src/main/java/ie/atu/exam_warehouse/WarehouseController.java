package ie.atu.exam_warehouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
    private ObjectInterface objectInterface;
    private WarehouseObject warehouseObject;
    public WarehouseController(ObjectInterface objectInterface){
        this.objectInterface = objectInterface;
        this.warehouseObject =  new WarehouseObject();
        warehouseObject.setWarehouseId(201);
        warehouseObject.setCapacity(100);
        warehouseObject.setLocation("London");
    }

   @PostMapping("/getWarehouseById")
    WarehouseObject getWarehouseById(){
        return warehouseObject;
    }

    @GetMapping("/Test")
    public String Test(){
    return "Test 123";
    }
}
