package ie.atu.exam_warehouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WarehouseController {
    private ObjectInterface objectInterface;
    private WarehouseObject warehouseObject;
    private List<WarehouseObject>stock;
    public WarehouseController(ObjectInterface objectInterface){
        this.objectInterface = objectInterface;
        this.warehouseObject =  new WarehouseObject();
       this.stock =  new ArrayList<>();
        warehouseObject.setWarehouseId(201);
        warehouseObject.setCapacity(100);
        warehouseObject.setLocation("London");
        stock.add(warehouseObject);
    }

   @PostMapping("/addProduct")
    WarehouseObject getWarehouseById(@RequestBody WarehouseObject sent){
        WarehouseObject check = new WarehouseObject();
        for(WarehouseObject stock1:stock){
            if ((stock1.getWarehouseId() == sent.getWarehouseId())){{
                check = warehouseObject;
            }
            }
        }
        return check;
    }

    @GetMapping("/Test")
    public String Test(){
    return "Test 123";
    }
}
