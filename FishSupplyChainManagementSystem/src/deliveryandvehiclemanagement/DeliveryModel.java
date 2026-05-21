
package deliveryandvehiclemanagement;

public class DeliveryModel
{
    
    private String deliveryId, invoiceId, vehicleNo, driverName;
    private String fuelType, capacity, location, dispatchTime, status;

    public DeliveryModel() {
    }
    
    

    public DeliveryModel(String deliveryId, String invoiceId, String vehicleNo,
                         String driverName, String fuelType, String capacity,
                         String location, String dispatchTime, String status)
    {
        this.deliveryId = deliveryId;
        this.invoiceId = invoiceId;
        this.vehicleNo = vehicleNo;
        this.driverName = driverName;
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.location = location;
        this.dispatchTime = dispatchTime;
        this.status = status;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(String dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
