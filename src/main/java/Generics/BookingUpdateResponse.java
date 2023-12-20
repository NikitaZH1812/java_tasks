package Generics;

/*
{
    "booking": {
        "id": 99999,
        "tutor_id": 12,
        "status": "PLANNED",
        "type": "DEMO",
        "start": "2023-12-20 16:00:00",
        "booked_timezone": "Africa/Abidjan",
        "is_finished": false,
        "child": {
            "id": 99990,
            "customer_id": 99999,
            "customer": {
                "id": 99999
            }
        }
    }
}
 */

public class BookingUpdateResponse {
    private BookingResponse BookingResponse;

    public BookingUpdateResponse(BookingResponse BookingResponse) {
        this.BookingResponse = BookingResponse;
    }

    public Generics.BookingResponse getBookingResponse() {
        return BookingResponse;
    }

    public void setBookingResponse(Generics.BookingResponse bookingResponse) {
        BookingResponse = bookingResponse;
    }
}

class BookingResponse {
    private int id;
    private Integer tutorId;
    private String status;
    private String type;
    private String start;
    private String bookedTimezone;
    private boolean isFinished;
    private Child child;

    public BookingResponse(int id, Integer tutorId, String status, String type, String start, String bookedTimezone, boolean isFinished, Child child) {
        this.id = id;
        this.tutorId = tutorId;
        this.status = status;
        this.type = type;
        this.start = start;
        this.bookedTimezone = bookedTimezone;
        this.isFinished = isFinished;
        this.child = child;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getBookedTimezone() {
        return bookedTimezone;
    }

    public void setBookedTimezone(String bookedTimezone) {
        this.bookedTimezone = bookedTimezone;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}

class Child {
    private int id;
    private int customerId;
    private Customer customer;

    public Child(int id, int customerId, Customer customer) {
        this.id = id;
        this.customerId = customerId;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

class Customer {
    private int id;

    public Customer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

