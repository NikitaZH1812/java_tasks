package Generics;

/*
{
  "booking": {
    "activity_status": "START",
    "device_type": "DESKTOP"
  }
}
 */

public class BookingUpdateRequest {
    private BookingRequest BookingRequest;

    public BookingUpdateRequest(BookingRequest BookingRequest) {
        this.BookingRequest = BookingRequest;
    }

    public Generics.BookingRequest getBookingRequest() {
        return BookingRequest;
    }

    public void setBookingRequest(Generics.BookingRequest bookingRequest) {
        BookingRequest = bookingRequest;
    }
}
class BookingRequest {


    private String activityStatus;

    private String deviceType;

    public BookingRequest(String activityStatus, String deviceType) {
        this.activityStatus = activityStatus;
        this.deviceType = deviceType;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}
