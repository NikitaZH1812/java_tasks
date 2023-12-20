package Generics;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws Exception {

        BookingUpdateRequest BookingUpdateRequest = new BookingUpdateRequest(new BookingRequest("START", "DESKTOP"));
        List<BookingUpdateRequest> BookingUpdateRequestList = List.of(BookingUpdateRequest);
        Generic<BookingUpdateRequest> genericBookingUpdateRequest = new Generic<>(BookingUpdateRequestList, new Pagination(1, 1, 1));

        BookingUpdateResponse BookingUpdateResponse = new BookingUpdateResponse(new BookingResponse(99999, 12, "PLANNED", "DEMO", "2023-12-20 16:00:00", "Africa/Abidjan", false, new Child(99990, 99999, new Customer(99999))));
        List<BookingUpdateResponse> BookingUpdateResponseList = List.of(BookingUpdateResponse);
        Generic<BookingUpdateResponse> genericBookingUpdateResponse = new Generic<>(BookingUpdateResponseList, new Pagination(2, 2, 2));

        System.out.println("BookingUpdateRequest Data: " + convertToJson(genericBookingUpdateRequest.getData()));
        System.out.println("Booking Pagination: " + convertToJson(genericBookingUpdateRequest.getPagination()));

        System.out.println("BookingUpdateResponse Data: " + convertToJson(genericBookingUpdateResponse.getData()));
        System.out.println("Booking Pagination: " + convertToJson(genericBookingUpdateResponse.getPagination()));

    }



    private static String convertToJson(Object object) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}
