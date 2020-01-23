package az.orient.course.request;

import lombok.Data;

@Data
public class RespStatus {

    private Integer statusCode;
    private String statusMessage;

    private static final Integer SUCCESS_CODE = 5;
    private static final String SUCCESS_MESSAGE = "success";

    public RespStatus() {
    }

    public RespStatus(Integer statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public static RespStatus getSuccessMessage() {
        return new RespStatus(SUCCESS_CODE, SUCCESS_MESSAGE);
    }


}
